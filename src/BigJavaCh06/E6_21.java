package BigJavaCh06;

import java.util.Scanner;

public class E6_21 {
	
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
			dollar = in.nextDouble();}
		
		System.out.print("Please enter Japanese Yen value (Enter 0 for finish): ");
		yen = in.nextDouble();
		while (yen > 0) {
			dollar = yen / oneDollarToYen;
			System.out.printf("The dollar is: %.2f.\n", dollar);
			System.out.print("Please enter Japanese Yen value (Enter 0 for finish): ");
			yen = in.nextDouble();
		}
		
	
	}
}
