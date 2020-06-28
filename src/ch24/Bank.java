package ch24;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * A bank consisting of multiple bank accounts.
 */
public class Bank {
   /**
    * Finds a customer with a given number and PIN.
    * 
    * @param customerNumber the customer number
    * @param pin            the personal identification number
    * @return the matching customer, or null if none found
    */
   public Customer findCustomer(int customerNumber, int pin) throws SQLException {
      try (Connection conn = SimpleDataSource.getConnection()) {
         Customer c = null;
         PreparedStatement stat = conn.prepareStatement(
            "SELECT * FROM BankCustomer WHERE Customer_Number = ?");
         stat.setInt(1, customerNumber);

         ResultSet result = stat.executeQuery();
         if (result.next() && pin == result.getInt("PIN")) {
            c = new Customer(customerNumber, result.getInt("Checking_Account_Number"),
                  result.getInt("Savings_Account_Number"));
         }
         return c;
      }
   }
}
