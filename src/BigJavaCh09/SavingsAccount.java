package BigJavaCh09;

/**
   A savings account earns interest on the minimum balance.
*/
public class SavingsAccount extends BankAccount
{
   private double interestRate;
   private double minBalance; 

   /**
      Constructs a savings account with a zero balance.
   */
   public SavingsAccount()
   {
      interestRate = 0;
      minBalance = 0;
   }

   /**
      Sets the interest rate for this account.
      @param rate the monthly interest rate in percent
   */
   public void setInterestRate(double rate)
   {
      interestRate = rate;
   }

   public void withdraw(double amount)
   {
      super.withdraw(amount);
      double balance = getBalance();
      if (balance < minBalance)
      {
         minBalance = balance;
      }
   }
   
   public void monthEnd()
   {
      double interest = minBalance * interestRate / 100;
      deposit(interest);
      minBalance = getBalance();
   }
}
