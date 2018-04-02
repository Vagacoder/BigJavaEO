<<<<<<< HEAD
package BigJavaCh06;

/**
   This program removes spaces and dashes from a credit card number.
*/
public class CCNumber2
{
   public static void main(String[] args)
   {
      String creditCardNumber = "4123-5678-9012-3450";
      String newNumber = "";
      for (int i = 0; i< creditCardNumber.length(); i++)
      {
    	  if (creditCardNumber.charAt(i) != ' ' && creditCardNumber.charAt(i) != '-')
    	  {
    		  newNumber += creditCardNumber.charAt(i);
    	  }
      }
      
      System.out.println(newNumber);
   }	
}
=======
package BigJavaCh06;

/**
   This program removes spaces and dashes from a credit card number.
*/
public class CCNumber2
{
   public static void main(String[] args)
   {
      String creditCardNumber = "4123-5678-9012-3450";
      String newNumber = "";
      for (int i = 0; i< creditCardNumber.length(); i++)
      {
    	  if (creditCardNumber.charAt(i) != ' ' && creditCardNumber.charAt(i) != '-')
    	  {
    		  newNumber += creditCardNumber.charAt(i);
    	  }
      }
      
      System.out.println(newNumber);
   }	
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
