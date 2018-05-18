package ch06;

import java.util.*;

/**
 * This program shows how you can prompt for input that fulfills a certain
 * condition. Try entering negative values, such as -2 or -0.5, to see how they
 * are rejected.
 */
public class DoLoop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double value;
		do {
			System.out.print("Enter a number >= 0: ");
			value = in.nextDouble();
		} while (value < 0);
		double root = Math.sqrt(value);
		in.close();
		System.out.println("The square root of the number is " + root);
	}
}
