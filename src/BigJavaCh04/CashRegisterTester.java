package BigJavaCh04;

/**
 * This class tests the CashRegister class.
 */
public class CashRegisterTester {
	public static void main(String[] args) {
		CashRegister register = new CashRegister();

		/**
		 * register.recordPurchase(0.75); register.recordPurchase(1.50);
		 * register.receivePayment(2, 0, 5, 0, 0);
		 */

		register.recordPurchase(19.93);
		register.receivePayment(20, 0, 0, 0, 0);
		System.out.printf("Change: %.2f\n", register.giveChange());
		// System.out.println(register.giveChange());

		/**
		 * System.out.println("Expected: 0.25");
		 * 
		 * register.recordPurchase(2.25); register.recordPurchase(19.25);
		 * register.receivePayment(23, 2, 0, 0, 0); System.out.print("Change: ");
		 * System.out.println(register.giveChange()); System.out.println("Expected:
		 * 2.0");
		 * 
		 * register.recordPurchase(20.37); register.enterDollars(20);
		 * register.enterQuarters(2); System.out.println("Change: " +
		 * register.giveChange()); System.out.println("Expected: 0.13");
		 */
	}
}
