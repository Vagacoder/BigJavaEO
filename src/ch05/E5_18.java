package ch05;

import java.util.*;

public class E5_18 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your income: ");
		double income = in.nextDouble();
		
		TaxUS1913 newIncome = new TaxUS1913(income);
		double newTax = newIncome.getTax();
		System.out.printf("The tax of $%.2f is $%.2f at 1913.", income, newTax);	
		
	}

}
