package ch10;

import java.io.*;
import java.util.*;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 * 
 * P10.13
 */
public class BankAccount implements Measurable, Formattable {
    private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount() {
	balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     * 
     * @param initialBalance
     *            the initial balance
     */
    public BankAccount(double initialBalance) {
	balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     * 
     * @param amount
     *            the amount to deposit
     */
    public void deposit(double amount) {
	double newBalance = balance + amount;
	balance = newBalance;
    }

    /**
     * Withdraws money from the bank account.
     * 
     * @param amount
     *            the amount to withdraw
     */
    public void withdraw(double amount) {
	double newBalance = balance - amount;
	balance = newBalance;
    }

    /**
     * Gets the current balance of the bank account.
     * 
     * @return the current balance
     */
    public double getBalance() {
	return balance;
    }

    @Override
    public double getMeasure() {
	// TODO Auto-generated method stub
	return balance;
    }

    @Override
    public String getName() {
	// TODO Auto-generated method stub
	return null;
    }

    /**
     * P10.13 and P10.14 Argument, formatter, is storing the result, formatted
     * balance.
     */

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
	String balance = "" + this.balance;
	int size = balance.length();
	if (width > size) {
	    for (int i = 0; i < width - size; i++) {
		balance = " " + balance;
	    }
	} else if (width < -1) {
	    throw new IllegalArgumentException("Wrong width");
	}
	size = balance.length();
	if (precision < size && precision >= 0) {
	    balance = balance.substring(size - precision, size);
	} else if (precision < -1) {
	    throw new IllegalArgumentException("Wrong precision");
	}

	Appendable a = formatter.out();
	try {
	    a.append(balance);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }
}
