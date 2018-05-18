package ch04;

public class P4_7_BookStore {

	private double totalPrice;
	private double bookNumber;
	final public double SALE_TAX_RATE = 7.5;
	final public double SHIPPING_CHARGE_PER_BOOK =2.0;
		
	public P4_7_BookStore(double totalBookPrice, int bookNumber) {
		
		this.totalPrice = totalBookPrice;
		this.bookNumber = bookNumber;
		
	}
	
	public double getShippingFee() {
		
		double shippingFee = bookNumber * SHIPPING_CHARGE_PER_BOOK;
		
		return shippingFee;
	}
	
	public double getSaleTax() {
		
		double saleTax = totalPrice * SALE_TAX_RATE/100.0;
		
		return saleTax;
	}
	
	public double getOrderPrice () {
		
		double orderPrice = totalPrice + this.getShippingFee() + this.getSaleTax();
		return orderPrice;
			}
	
	public void printOrder () {
		
		System.out.printf("The price of books is:         %8.2f$\n", totalPrice);
		System.out.printf("The sale tax is:               %8.2f$\n", this.getSaleTax());
		System.out.printf("The shipping charge is:        %8.2f$\n", this.getShippingFee());
		System.out.printf("The  total price of order is:  %8.2f$\n", this.getOrderPrice());
	}
}
