package BigJavaCh09;

/**
   A bank account has a balance and a mechanism for applying interest or fees at 
   the end of the month.
*/
public class BankAccount
{
   private double balance;

   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount()
   {
      balance = 0;
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
   }
   
   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
      balance = balance - amount;
   }
   
   /**
      Carries out the end of month processing that is appropriate
      for this account.
   */
   public void monthEnd() 
   {
   }
   
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
}
