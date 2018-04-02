<<<<<<< HEAD
package BigJavaCh03;

/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   private String record = "";
   
   private double totalSale = 0;
   private int saleCount = 0;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double price)
   {
      purchase = purchase + price;
      record = record + "Purchase: " + price + "\n"; 
      totalSale = totalSale + price;
      saleCount = saleCount + 1;
   }

   /**
      Processes a payment received from the customer.
      @param amount the amount of the payment
   */
   public void receivePayment(double pay)
   {
      payment = payment + pay;
      
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
   
   public void printReceipt() {
	   
	   System.out.println(record);
	   System.out.println("Total amount is: " + purchase);
	   
   }
   
   public double getSalesTotal() {
	   
	   return totalSale;
   }
   
   public int getSaleCount() {
		  
	   return saleCount;	 
	   
   }
   
   public void restSaleInformation() {
	   
	   totalSale = 0;
	   saleCount = 0;
   }
}
=======
package BigJavaCh03;

/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   private String record = "";
   
   private double totalSale = 0;
   private int saleCount = 0;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double price)
   {
      purchase = purchase + price;
      record = record + "Purchase: " + price + "\n"; 
      totalSale = totalSale + price;
      saleCount = saleCount + 1;
   }

   /**
      Processes a payment received from the customer.
      @param amount the amount of the payment
   */
   public void receivePayment(double pay)
   {
      payment = payment + pay;
      
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
   
   public void printReceipt() {
	   
	   System.out.println(record);
	   System.out.println("Total amount is: " + purchase);
	   
   }
   
   public double getSalesTotal() {
	   
	   return totalSale;
   }
   
   public int getSaleCount() {
		  
	   return saleCount;	 
	   
   }
   
   public void restSaleInformation() {
	   
	   totalSale = 0;
	   saleCount = 0;
   }
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
