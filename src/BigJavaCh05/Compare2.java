package BigJavaCh05;

import java.util.*;

/**
 * This program demonstrates comparisons of numbers, using Boolean expressions.
 */
public class Compare2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter two numbers (such as 3.5 4.5): ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		if (x == y) {
			System.out.println("They are the same.");
		} else {
			System.out.print("The first number is ");
			if (x > y) {
				System.out.println("larger");
			} else {
				System.out.println("smaller");
			}

			if (-0.01 < x - y && x - y < 0.01) {
				System.out.println("The numbers are close together");
			}

			if (x == y + 1 || x == y - 1) {
				System.out.println("The numbers are one apart");
			}

			if (x > 0 && y > 0 || x < 0 && y < 0) {
				System.out.println("The numbers have the same sign");
			} else {
				System.out.println("The numbers have different signs");
			}
		}
	}
}
