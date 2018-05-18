package ch06;

import java.util.*;

public class E6_20 {

	public static void main(String[] args) {
		System.out.print("Please enter the today's price for one dollar in Yen: ");
		Scanner in = new Scanner(System.in);
		double oneDollarToYen = in.nextDouble();

		System.out.print("Please enter US dollar value (Enter 0 for finish): ");
		double dollar = in.nextDouble();
		double yen;
		while (dollar > 0) {
			yen = dollar * oneDollarToYen;
			System.out.printf("The yen is: %.2f.\n", yen);
			System.out.print("Please enter US dollar value (Enter 0 for finish): ");
			dollar = in.nextDouble();
		}

	}

}
