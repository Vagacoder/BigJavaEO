package ch24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

/**
 * Enters an invoice into the database. Be sure to add Customer.sql,
 * Product.sql, Invoice.sql, and LineItem.sql to the database before running
 * this program.
 */
public class InvoiceEntry {
   public static void main(String args[]) {
      if (args.length == 0) {
         System.out.println(
               "Usage: java -classpath driver_class_path" + File.pathSeparator + 
               ". InvoiceEntry propertiesFile");
         return;
      }

      try {
         SimpleDataSource.init(args[0]);
         try (Connection conn = SimpleDataSource.getConnection(); 
                  Scanner in = new Scanner(System.in)) {
            addInvoice(in, conn);
         }
      } catch (SQLException ex) {
         System.out.println("Database error");
         ex.printStackTrace();
      } catch (ClassNotFoundException ex) {
         System.out.println("Error loading database driver");
         ex.printStackTrace();
      } catch (IOException ex) {
         System.out.println("Error loading database properties");
         ex.printStackTrace();
      }
   }

   public static void addInvoice(Scanner in, Connection conn) throws SQLException {
      int customerNumber = newCustomer(conn, in);

      int id = getNewId(conn, "Invoice");
      try (PreparedStatement stat = conn.prepareStatement("INSERT INTO Invoice VALUES (?, ?, 0)")) {
         stat.setInt(1, id);
         stat.setInt(2, customerNumber);
         stat.executeUpdate();
      }

      boolean done = false;
      while (!done) {
         String productCode = nextLine(in, "Product code (D=Done, L=List)");
         if (productCode.equals("D")) {
            done = true;
         } else if (productCode.equals("L")) {
            listProducts(conn);
         } else if (findProduct(conn, productCode)) {
            int quantity = nextInt(in, "Quantity");
            addLineItem(conn, id, productCode, quantity);
         } else {
            System.out.println("Invalid product code.");
         }
      }
      showInvoice(conn, id);
   }

   /**
    * Prompts the user for the customer information and creates a new customer.
    * 
    * @param conn the database connection
    * @param in   the scanner
    * @return the ID of the new customer
    */
   private static int newCustomer(Connection conn, Scanner in) throws SQLException {
      String name = nextLine(in, "Name");
      String address = nextLine(in, "Street address");
      String city = nextLine(in, "City");
      String state = nextLine(in, "State");
      String zip = nextLine(in, "Zip");
      int id = getNewId(conn, "Customer");
      try (PreparedStatement stat = conn.prepareStatement("INSERT INTO Customer VALUES (?, ?, ?, ?, ?, ?)")) {
         stat.setInt(1, id);
         stat.setString(2, name);
         stat.setString(3, address);
         stat.setString(4, city);
         stat.setString(5, state);
         stat.setString(6, zip);
         stat.executeUpdate();
      }
      return id;
   }

   /**
    * Finds a product in the database.
    * 
    * @param conn the database connection
    * @param code the product code to search
    * @return true if there is a product with the given code
    */
   private static boolean findProduct(Connection conn, String code) throws SQLException {
      boolean found = false;
      try (PreparedStatement stat = conn.prepareStatement("SELECT * FROM Product WHERE Product_Code = ?")) {
         stat.setString(1, code);
         ResultSet result = stat.executeQuery();
         found = result.next();
      }
      return found;
   }

   /**
    * Adds a line item to the database
    * 
    * @param conn     the database connection
    * @param id       the invoice ID
    * @param code     the product code
    * @param quantity the quantity to order
    */
   private static void addLineItem(Connection conn, int id, String code, int quantity) 
                     throws SQLException {
      try (PreparedStatement stat = conn.prepareStatement("INSERT INTO LineItem VALUES (?, ?, ?)")) {
         stat.setInt(1, id);
         stat.setString(2, code);
         stat.setInt(3, quantity);
         stat.executeUpdate();
      }
   }

   /**
    * Lists all products in the database.
    * 
    * @param conn the database connection
    */
   private static void listProducts(Connection conn) throws SQLException {
      try (Statement stat = conn.createStatement()) {
         ResultSet result = stat.executeQuery("SELECT Product_Code, Description FROM Product");
         while (result.next()) {
            String code = result.getString(1);
            String description = result.getString(2);
            System.out.println(code + " " + description);
         }
      }
   }

   /**
    * Gets a new ID for a table. This method should be called from inside a
    * transaction that also creates the new row with this ID. The ID field should
    * have name table_Number and type INTEGER.
    * 
    * @param table the table name
    * @return a new ID that has not yet been used.
    */
   private static int getNewId(Connection conn, String table) throws SQLException {
      int max = -1;
      try (Statement stat = conn.createStatement()) {
         ResultSet result = stat.executeQuery("SELECT max(" + table + "_Number) FROM " + table);
         result.next();
         max = result.getInt(1) + 1;
      }
      return max;
   }

   /**
    * Shows an invoice.
    * 
    * @param conn the database connection
    * @param id   the invoice ID
    */
   private static void showInvoice(Connection conn, int id) throws SQLException {
      try (PreparedStatement stat = conn.prepareStatement("SELECT Customer.Name, Customer.Address, "
            + "Customer.City, Customer.State, Customer.Zip " + "FROM Customer, Invoice "
            + "WHERE Customer.Customer_Number = Invoice.Customer_Number "
             + "AND Invoice.Invoice_Number = ?")) {
         stat.setInt(1, id);
         ResultSet result = stat.executeQuery();
         result.next();
         System.out.println(result.getString(1));
         System.out.println(result.getString(2));
         System.out.println(result.getString(3).trim() + ", " + result.getString(4) 
                              + " " + result.getString(5));
      }

      try (PreparedStatement stat = conn.prepareStatement(
            "SELECT Product.Product_Code, Product.Description, LineItem.Quantity " + "FROM Product, LineItem "
                  + "WHERE Product.Product_Code = LineItem.Product_Code " + "AND LineItem.Invoice_Number = ?")) {
         stat.setInt(1, id);

         ResultSet result = stat.executeQuery();
         while (result.next()) {
            String code = result.getString(1);
            String description = result.getString(2).trim();
            int qty = result.getInt(3);

            System.out.println(qty + " x " + code + " " + description);
         }
      }
   }

   /**
    * Prompts the user and reads a line from a scanner.
    * 
    * @param in     the scanner
    * @param prompt the prompt
    * @return the string that the user entered
    */
   private static String nextLine(Scanner in, String prompt) {
      System.out.print(prompt + ": ");
      return in.nextLine();
   }

   /**
    * Prompts the user and reads an integer from a scanner.
    * 
    * @param in     the scanner
    * @param prompt the prompt
    * @return the integer that the user entered
    */
   private static int nextInt(Scanner in, String prompt) {
      System.out.print(prompt + ": ");
      int result = in.nextInt();
      in.nextLine(); // Consume newline
      return result;
   }
}
