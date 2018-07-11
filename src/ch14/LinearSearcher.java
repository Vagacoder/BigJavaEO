package ch14;

/**
 * A class for executing linear searches in an array.
 */
public class LinearSearcher {
    /**
     * Finds a value in an array, using the linear search algorithm.
     * 
     * @param a
     *            the array to search
     * @param value
     *            the value to find
     * @return the index at which the value occurs, or -1 if it does not occur in
     *         the array
     */
    public static int search(int[] a, int value) {
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == value) {
		return i;
	    }
	}
	return -1;
    }
}
