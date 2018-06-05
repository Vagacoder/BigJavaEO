package ch11;


public class InsufficientFundsException extends IllegalArgumentException
{
   public InsufficientFundsException() {}
   public InsufficientFundsException(String message)
   {
      super(message);
   }
}
