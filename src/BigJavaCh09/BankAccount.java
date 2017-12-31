package BigJavaCh09;

/**
 * A bank account has a balance and a mechanism for applying interest or fees at
 * the end of the month.
 */
public class BankAccount {
	private double balance;
	public final int FREE_WITHDRAWALS = 3;
	public final int WITHDRAWAL_FEE = 1;
	private double transaction = 0;

	/**
	 * Constructs a bank account with zero balance.
	 */
	public BankAccount() {
		balance = 0;
	}

	/**
	 * Makes a deposit into this account.
	 * 
	 * @param amount
	 *            the amount of the deposit
	 */
	public void deposit(double amount) {
		balance = balance + amount;
		transactionFee();
		transaction++;
	}

	/**
	 * Makes a withdrawal from this account, or charges a penalty if sufficient
	 * funds are not available.
	 * 
	 * @param amount
	 *            the amount of the withdrawal
	 */
	public void withdraw(double amount) {
		balance = balance - amount;
		transactionFee();
		transaction++;
	}

	/**
	 * Carries out the end of month processing that is appropriate for this account.
	 */
	public void monthEnd() {

		transaction = 0;
	}

	/**
	 * Gets the current balance of this bank account.
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

	public void transactionFee() {

		if (transaction > FREE_WITHDRAWALS)
			{
				withdraw(WITHDRAWAL_FEE);
			}
	}
}
