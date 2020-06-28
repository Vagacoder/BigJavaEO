package ch24;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private int accountNumber;

   /**
      Constructs a bank account with a given balance.
      @param anAccountNumber the account number
   */
   public BankAccount(int anAccountNumber)
   {  
      accountNumber = anAccountNumber;
   }

   /**
      Deposits money into a bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
         throws SQLException
   {
      try (Connection conn = SimpleDataSource.getConnection())
      {
         PreparedStatement stat = conn.prepareStatement(
               "UPDATE Account"
               + " SET Balance = Balance + ?"
               + " WHERE Account_Number = ?");
         stat.setDouble(1, amount);
         stat.setInt(2, accountNumber);
         stat.executeUpdate();      
      }
   }

   /**
      Withdraws money from a bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
         throws SQLException
   {
      try (Connection conn = SimpleDataSource.getConnection())
      {
         PreparedStatement stat = conn.prepareStatement(
               "UPDATE Account"
               + " SET Balance = Balance - ?"
               + " WHERE Account_Number = ?");
         stat.setDouble(1, amount);
         stat.setInt(2, accountNumber);
         stat.executeUpdate();      
      }
   }

   /**
      Gets the balance of a bank account.
      @return the account balance
   */
   public double getBalance()
         throws SQLException
   {
      try (Connection conn = SimpleDataSource.getConnection())
      {
         double balance = 0;
         PreparedStatement stat = conn.prepareStatement(
               "SELECT Balance FROM Account WHERE Account_Number = ?");
         stat.setInt(1, accountNumber);
         ResultSet result = stat.executeQuery();
         if (result.next())
         {
            balance = result.getDouble(1);
         }
         return balance;
      }
   }
}

