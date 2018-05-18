package ch06;

/**
 * This program computes how long it takes for an investment to double.
 */
public class InvestmentRunner1 {
	public static void main(String[] args) {
		final double INITIAL_BALANCE = 10000;
		final double RATE = 10;
		Investment1 invest = new Investment1(INITIAL_BALANCE, RATE);
		invest.waitForBalance(2 * INITIAL_BALANCE);
		int years = invest.getYears();
		System.out.println("The investment doubled after " + years + " years");
	}
}
