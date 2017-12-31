package BigJavaCh03;

/**
 * A bank account has a balance that can be changed by deposit and withdraw.
 * 
 * @author Skuller
 *
 */

public class BankAccount {

	private double balance = 0;
	private int accountNumber;
	private double interestRate;
	private double expected_balance = 0;

	/**
	 * Construct a bank account with account number.
	 * 
	 * @param accountNumber
	 */

	public BankAccount(int accountNumber) {

		balance = 0;
		this.accountNumber = accountNumber;
	}

	/**
	 * Construct a bank account with account number and initial balance.
	 * 
	 * @param accountNumber
	 *            account number.
	 * @param amount
	 *            initial balance.
	 */
	public BankAccount(int accountNumber, double amount) {

		balance = amount;
		this.accountNumber = accountNumber;

	}

	/**
	 * return the account number.
	 * 
	 * @return account number.
	 */
	public int getAccountNumber() {
		return this.accountNumber;
	}

	/**
	 * Deposit the money into the bank account.
	 * 
	 * @param amount
	 *            the amount to deposit.
	 */
	public void deposit(double amount) {

		balance = balance + amount;

	}

	/**
	 * Withdraw the money from the bank account.
	 * 
	 * @param amount
	 *            the amount to withdraw.
	 */
	public void withdraw(double amount) {

		balance = balance - amount;

	}

	/**
	 * Check the bank account balance
	 * 
	 * @return return the current balance in the bank account.
	 */

	public double getBalance() {

		return balance;

	}

	public double addInterest(double rate) {

		interestRate = rate;
		expected_balance = balance * (1 + interestRate / 100);
		return expected_balance;

	}

	public void transfer(BankAccount that, double amount) {

		this.balance = this.balance - amount;
		that.balance = that.balance + amount;

	}

}
