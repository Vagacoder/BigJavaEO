package ch14;

/**
 * A class for executing binary searches in an array.
 */
public class BinarySearcher {
	/**
	 * Finds a value in a range of a sorted array, using the binary search
	 * algorithm.
	 * 
	 * @param a     the array in which to search
	 * @param low   the low index of the range
	 * @param high  the high index of the range
	 * @param value the value to find
	 * @return the index at which the value occurs, or -1 if it does not occur in
	 *         the array
	 */
	public static int search(int[] a, int low, int high, int value) {
		if (low <= high) {
			int mid = (low + high) / 2;

			if (a[mid] == value) {
				return mid;
			} else if (a[mid] < value) {
				return search(a, mid + 1, high, value);
			} else {
				return search(a, low, mid - 1, value);
			}
		} else {
			return -1;
		}
	}

	public static int searchString(String[] a, int low, int high, String s) {
		if (low <= high) {
			int mid = (low + high) / 2;

			if (a[mid].compareTo(s) == 0) {
				return mid;
			} else if (a[mid].compareTo(s) < 0) {
				return searchString(a, mid + 1, high, s);
			} else {
				return searchString(a, low, mid - 1, s);
			}
		} else {
			return -1;
		}
	}
}
