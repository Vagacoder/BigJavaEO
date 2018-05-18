package ch08;

import java.util.*;

/**
 * This program calculates a simple tax return.
 */
public class TaxCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter your income: ");
		double income = in.nextDouble();

		System.out.print("Are you married? (Y/N) ");
		String input = in.next();
		int status;
		if (input.equals("Y"))
			{
				status = TaxReturn.MARRIED;
			}
		else
			{
				status = TaxReturn.SINGLE;
			}

		TaxReturn aTaxReturn = new TaxReturn(income, status);

		System.out.println("Tax: " + aTaxReturn.getTax());
	}
}
