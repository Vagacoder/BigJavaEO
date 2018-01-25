package BigJavaCh04;

public class P4_5_CashRegister {
	
	private double purchase;
	private double payment;
	
	/**
	 * Constructs a cash register with no money in it.
	 */
	
	public P4_5_CashRegister() {
		
		this.purchase = 0;
		this.payment = 0;
	}
	
	/**
	 * Records the purchase price of an item.
	 * 
	 * @param amount
	 *            the price of the purchased item
	 */
	public void recordPurchase(double amount) {
		this.purchase = purchase + amount;
	}
	
	/**
	 * Computes the change due and resets the machine for the next customer.
	 * 
	 * @return the change due to the customer
	 */
	public double giveChange() {
		double change = payment - purchase;
		this.purchase = 0;
		this.payment = 0;
		return change;
	}
	
	public void receivePayment() {
		
		P4_5_Coin receiveCoin = new P4_5_Coin();
		
		this.payment = receiveCoin.totalAmount();
	
		
		
		
	}
}
