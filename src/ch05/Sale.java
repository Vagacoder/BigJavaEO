package ch05;

import java.util.*;

public class Sale {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Original price before discount: ");
		double originalPrice = in.nextDouble();

		double discountRate;
		if (originalPrice < 128) {
			discountRate = 0.92;
		} else {
			discountRate = 0.84;
		}

		double discountedPrice = discountRate * originalPrice;

		System.out.printf("Discounted price: %.2f\n", discountedPrice);

		in.close();
	}
}
