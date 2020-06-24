package ch24;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
 * E24.5  Write a Java program that uses the database tables from the invoice 
 * database in Section 24.2. Prompt the user for an invoice number and print out
 *  the invoice, format­ted as in Chapter 12.
 * 

 */
public class GetInvoice {

    public static void main(String[] args) throws Exception {

        String configFilename = "ch24/database.properties";
        SimpleDataSource.init(configFilename);

        Scanner keyIn = new Scanner(System.in);
        System.out.println("Please enter invoice number:");

        try (Connection con = SimpleDataSource.getConnection();
            Statement state = con.createStatement()) {
            while (keyIn.hasNextLine()) {
                String input = keyIn.nextLine();
                if(input.equalsIgnoreCase("quit")){
                    break;
                }

                // TODO use ? symbol here
                String query = "select * from invoice where invoice_number=" + input;
                boolean hasResult = state.execute(query);
                if(hasResult){
                    ResultSet result = state.getResultSet();
                    System.out.println(result.getMetaData().getColumnCount());
                }
            }
        }

        keyIn.close();
    }

}