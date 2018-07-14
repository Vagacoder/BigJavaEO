package ch14;

import java.util.*;

import ch10.*;

/**
 * This program demonstrates the selection sort algorithm by sorting an array
 * that is filled with random numbers.
 */
public class SelectionSortDemo {
    public static void main(String[] args) {
	int[] a = ArrayUtil.randomIntArray(20, 100);
	System.out.println(Arrays.toString(a));

	SelectionSorter.sort(a);
	System.out.println(Arrays.toString(a));

	SelectionSorter.sortDes(a);
	System.out.println(Arrays.toString(a));

	// E14.2
	Coin c1 = new Coin(25, "Q");
	Coin c2 = new Coin(5, "C");
	Coin c3 = new Coin(10, "D");
	Coin c4 = new Coin(1, "P");
	Coin c5 = new Coin(100, "D");

	Coin[] ca = { c1, c2, c3, c4, c5 };
	SelectionSorter.sortCoin(ca);
	for (Coin c : ca) {
	    System.out.println(c.getName());
	}
    }
}
