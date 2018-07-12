package ch14;

import java.util.Arrays;
import java.util.Comparator;

import ch10.Country;

public class E14_12 {

	public static void main(String[] args) {
		
		Country c1 = new Country("USA", 10000);
		Country c2 = new Country("UK", 2000);
		Country c3 = new Country("France", 3000);
		Country c4 = new Country("Germany", 3500);
		Country c5 = new Country("Spain", 2500);
		
		Country[] cArray = {c1, c2, c3, c4, c5};
		for (Country c : cArray) {
			System.out.println(c.getName());
		}
		
		System.out.println();
		CountryComparator cc = new CountryComparator();
		Arrays.sort(cArray, cc);
		for (Country c : cArray) {
			System.out.println(c.getName());
		}
	}
}
