package ch10;

import java.util.*;

/**
 * P10.13
 * 
 * @author Skuller
 *
 */
public class BankAccountTester {

    public static void main(String[] args) {
	Measurable[] accounts = new Measurable[3];
	accounts[0] = (Measurable) new BankAccount(0);
	accounts[1] = (Measurable) new BankAccount(10000);
	accounts[2] = (Measurable) new BankAccount(2000);

	double averageBalance = Data.average(accounts);
	System.out.println("Average balance: " + averageBalance);
	System.out.println("Expected: 4000");

	BankAccount ba1 = (BankAccount) accounts[1];
	Formatter f = new Formatter();
	ba1.formatTo(f, FormattableFlags.UPPERCASE, 10, 4);
	System.out.println(f);
    }

}
