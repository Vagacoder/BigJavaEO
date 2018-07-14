package ch14;

import ch10.*;

/**
 * The sort method of this class sorts an array, using the selection sort
 * algorithm.
 */
public class SelectionSorter {
    /**
     * Sorts an array, using selection sort.
     * 
     * @param a
     *            the array to sort
     */
    public static void sort(int[] a) {
	for (int i = 0; i < a.length - 1; i++) {
	    int minPos = minimumPosition(a, i);
	    ArrayUtil.swap(a, minPos, i);
	}
    }

    /**
     * Finds the smallest element in a tail range of the array.
     * 
     * @param a
     *            the array to sort
     * @param from
     *            the first position in a to compare
     * @return the position of the smallest element in the range a[from] . . .
     *         a[a.length - 1]
     */
    private static int minimumPosition(int[] a, int from) {
	int minPos = from;
	for (int i = from + 1; i < a.length; i++) {
	    if (a[i] < a[minPos]) {
		minPos = i;
	    }
	}
	return minPos;
    }

    /**
     * Sort an array to descending order
     * 
     * @param a
     */
    public static void sortDes(int[] a) {
	for (int i = 0; i < a.length - 1; i++) {
	    int minPos = maximumPosition(a, i);
	    ArrayUtil.swap(a, minPos, i);
	}
    }

    /**
     * helper method to find the index of maximum element
     * 
     * @param a
     * @param from
     * @return
     */

    private static int maximumPosition(int[] a, int from) {
	int maxPos = from;
	for (int i = from + 1; i < a.length; i++) {
	    if (a[i] > a[maxPos]) {
		maxPos = i;
	    }
	}
	return maxPos;
    }

    /**
     * E14.2 sorting array of coin
     * 
     * @param a
     */
    public static void sortCoin(Coin[] a) {
	for (int i = 0; i < a.length - 1; i++) {
	    int minPos = minCoinPosition(a, i);
	    Coin temp = a[i];
	    a[i] = a[minPos];
	    a[minPos] = temp;
	}
    }

    private static int minCoinPosition(Coin[] a, int from) {
	int minPos = from;
	for (int i = from + 1; i < a.length; i++) {
	    if (a[i].getValue() < a[minPos].getValue()) {
		minPos = i;
	    }
	}
	return minPos;
    }

    /**
     * for E14.5
     * 
     * @param a
     */
    public static void sortMeasurabale(Measurable[] a) {
	for (int i = 0; i < a.length - 1; i++) {
	    int minPos = minMeasurePosition(a, i);
	    Measurable temp = a[i];
	    a[i] = a[minPos];
	    a[minPos] = temp;
	}
    }

    private static int minMeasurePosition(Measurable[] a, int from) {
	int minPos = from;
	for (int i = from + 1; i < a.length; i++) {
	    if (a[i].getMeasure() < a[minPos].getMeasure()) {
		minPos = i;
	    }
	}
	return minPos;
    }
}
