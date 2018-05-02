package BigJavaCh05;

import java.util.*;

/**
 * A program to compute shipping costs.
 */
public class Shipping {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the state or province: ");
		String state = in.next();

		System.out.println("Enter the country: ");
		String country = in.next();

		double shippingCost;

		if (country.equals("USA")) {
			if (state.equals("AK") || state.equals("HI")) // See Section 5.7 for the || (or) operator
			{
				shippingCost = 10;
			} else {
				shippingCost = 5;
			}
		} else {
			shippingCost = 10;
		}

		System.out.printf("Shipping cost to %s, %s: $%.2f\n", state, country, shippingCost);
	}
}
