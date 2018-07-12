package ch14;

import java.util.Comparator;

import ch10.Country;

//  for E14.12
public class CountryComparator implements Comparator<Country> {

	@Override
	public int compare(Country c1, Country c2) {

		return -Double.compare(c1.getArea(), c2.getArea());
	}

}
