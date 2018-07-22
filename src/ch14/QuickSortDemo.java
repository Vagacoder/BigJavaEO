package ch14;

import java.util.*;

/**
 * This program demonstrates the quick sort algorithm by sorting an array that
 * is filled with random numbers.
 */
public class QuickSortDemo {
    public static void main(String[] args) {
	// int[] a = ArrayUtil.randomIntArray(20, 100);
	int[] a = { 47, 57, 21, 81, 0, 17, 72, 86, 93, 48, 27, 3, 33, 47, 71, 94, 6, 34 };
	System.out.println(Arrays.toString(a));

	QuickSorter.sort(a);

	System.out.println(Arrays.toString(a));
    }
}
