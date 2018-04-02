<<<<<<< HEAD
package BigJavaCh03;

/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();

      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.recordPurchase(4.75);
      register.recordPurchase(18.55);
      //register.receivePayment(50);

      //double change = register.giveChange();

      //System.out.println(change);  
      //System.out.println("Expected: 11.25");
      
      register.printReceipt();
      System.out.println("Expected: 62.05");
      System.out.println(register.getSaleCount());
      System.out.println(register.getSalesTotal());
      
   }
}
=======
package BigJavaCh03;

/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();

      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.recordPurchase(4.75);
      register.recordPurchase(18.55);
      //register.receivePayment(50);

      //double change = register.giveChange();

      //System.out.println(change);  
      //System.out.println("Expected: 11.25");
      
      register.printReceipt();
      System.out.println("Expected: 62.05");
      System.out.println(register.getSaleCount());
      System.out.println(register.getSalesTotal());
      
   }
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
