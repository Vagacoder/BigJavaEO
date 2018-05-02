package BigJavaCh06;

/**
 * A class to monitor the growth of an investment that accumulates interest at a
 * fixed annual rate.
 */
public class Investment1 {
	private double balance;
	private double rate;
	private int year;

	/**
	 * Constructs an Investment object from a starting balance and interest rate.
	 * 
	 * @param aBalance
	 *            the starting balance
	 * @param aRate
	 *            the interest rate in percent
	 */
	public Investment1(double aBalance, double aRate) {
		balance = aBalance;
		rate = aRate;
		year = 0;
	}

	/**
	 * Keeps accumulating interest until a target balance has been reached.
	 * 
	 * @param targetBalance
	 *            the desired balance
	 */
	public void waitForBalance(double targetBalance) {
		while (balance < targetBalance) {
			year++;
			double interest = balance * rate / 100;
			balance = balance + interest;
			System.out.printf("%.2f\n", balance);
		}
	}

	/**
	 * Gets the current investment balance.
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Gets the number of years this investment has accumulated interest.
	 * 
	 * @return the number of years since the start of the investment
	 */
	public int getYears() {
		return year;
	}
}
