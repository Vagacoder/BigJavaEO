package ch24;

/**
   A bank customer with a checking and savings account.
*/
public class Customer
{  
   private int customerNumber;
   private BankAccount checkingAccount;
   private BankAccount savingsAccount;

   /**
      Constructs a customer with a given number and PIN.
      @param aCustomerNumber the customer number
      @param checkingAccountNumber the checking account number
      @param savingsAccountNumber the savings account number
   */
   public Customer(int aCustomerNumber, 
      int checkingAccountNumber, int savingsAccountNumber)
   {  
      customerNumber = aCustomerNumber;
      checkingAccount = new BankAccount(checkingAccountNumber);
      savingsAccount = new BankAccount(savingsAccountNumber);
   }
   
   /** 
      Gets the checking account of this customer.
      @return the checking account
   */
   public BankAccount getCheckingAccount()
   {  
      return checkingAccount;
   }
   
   /** 
      Gets the savings account of this customer.
      @return the savings account
   */
   public BankAccount getSavingsAccount()
   {  
      return savingsAccount;
   }
}
