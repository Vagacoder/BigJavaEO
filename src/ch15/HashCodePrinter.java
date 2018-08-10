package ch15;

import java.util.*;

/**
 * This program prints hash codes of countries.
 */
public class HashCodePrinter {
	public static void main(String[] args) {
		Country country1 = new Country("Belgium", 30510);
		Country country2 = new Country("Thailand", 514000);
		Country country3 = new Country("Belgium", 30510);

		System.out.println("hash code of country1=" + country1.hashCode());
		System.out.println("hash code of country2=" + country2.hashCode());
		System.out.println("hash code of country3=" + country3.hashCode());

		// Add the countries to the hash set.

		Set<Country> countries = new HashSet<>();
		countries.add(country1);
		countries.add(country2);
		countries.add(country3);

		// Print the set. Note that the set has two elements.

		System.out.println(countries);
	}
}
