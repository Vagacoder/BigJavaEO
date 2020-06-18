package ch21;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This bank contains a collection of bank accounts.
 */
public class Bank implements Serializable {
   /**
    *
    */
   private static final long serialVersionUID = -796223842153734606L;
   
   private ArrayList<BankAccount> accounts;

   /**
    * Constructs a bank with no bank accounts.
    */
   public Bank() {
      accounts = new ArrayList<>();
   }

   /**
    * Adds an account to this bank.
    * 
    * @param a the account to add
    */
   public void addAccount(BankAccount a) {
      accounts.add(a);
   }

   /**
    * Finds a bank account with a given number.
    * 
    * @param accountNumber the number to find
    * @return the account with the given number, or null if there is no such
    *         account
    */
   public BankAccount find(int accountNumber) {
      for (BankAccount a : accounts) {
         if (a.getAccountNumber() == accountNumber) // Found a match
         {
            return a;
         }
      }
      return null; // No match in the entire array list
   }
}
