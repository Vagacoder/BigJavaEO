package ch14;

import java.util.*;

/**
 * This program demonstrates the Shell sort algorithm by sorting an array that
 * is filled with random numbers.
 */
public class ShellSortDemo {
    public static void main(String[] args) {
	int[] a = ArrayUtil.randomIntArray(20, 100);
	System.out.println(Arrays.toString(a));

	ShellSorter.sort(a);

	System.out.println(Arrays.toString(a));
    }
}
