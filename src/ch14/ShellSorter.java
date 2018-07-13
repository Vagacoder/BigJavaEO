package ch14;

import java.util.*;

/**
 * The sort method of this class sorts an array, using the Shell sort algorithm.
 */
public class ShellSorter {
    /**
     * Sorts an array, using Shell sort.
     * 
     * @param a
     *            the array to sort
     */
    public static void sort(int[] a) {
	// Generate the sequence values
	ArrayList<Integer> columns = new ArrayList<Integer>();
	int c = 1;
	while (c < a.length) {
	    columns.add(c);
	    c = 3 * c + 1;
	}

	// For each column count, sort all columns
	for (int s = columns.size() - 1; s >= 0; s--) {
	    c = columns.get(s);
	    for (int k = 0; k < c; k++) {
		insertionSort(a, k, c);
	    }
	}
    }

    /**
     * Sorts a column, using insertion sort.
     * 
     * @param a
     *            the array to sort
     * @param k
     *            the index of the first element in the column
     * @param c
     *            the gap between elements in the column
     */
    public static void insertionSort(int[] a, int k, int c) {
	for (int i = k + c; i < a.length; i = i + c) {
	    int next = a[i];
	    // Move all larger elements up
	    int j = i;
	    while (j >= c && a[j - c] > next) {
		a[j] = a[j - c];
		j = j - c;
	    }
	    // Insert the element
	    a[j] = next;
	}
    }
}
