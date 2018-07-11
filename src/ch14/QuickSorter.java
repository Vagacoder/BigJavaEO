package ch14;

/**
 * The sort method of this class sorts an array, using the quick sort algorithm.
 */
public class QuickSorter {
    /**
     * Sorts an array, using quick sort.
     * 
     * @param a
     *            the array to sort
     */
    public static void sort(int[] a) {
	sort(a, 0, a.length - 1);
    }

    /**
     * Sorts a portion of an array, using quick sort.
     * 
     * @param a
     *            the array to sort
     * @param from
     *            the first index of the portion to be sorted
     * @param to
     *            the last index of the portion to be sorted
     */
    public static void sort(int[] a, int from, int to) {
	if (from >= to) {
	    return;
	}
	int p = partition(a, from, to);
	sort(a, from, p);
	sort(a, p + 1, to);
    }

    /**
     * Partitions a portion of an array.
     * 
     * @param a
     *            the array to partition
     * @param from
     *            the first index of the portion to be partitioned
     * @param to
     *            the last index of the portion to be partitioned
     * @return the last index of the first partition
     */
    private static int partition(int[] a, int from, int to) {
	int pivot = a[from];
	int i = from - 1;
	int j = to + 1;
	while (i < j) {
	    i++;
	    while (a[i] < pivot) {
		i++;
	    }
	    j--;
	    while (a[j] > pivot) {
		j--;
	    }
	    if (i < j) {
		ArrayUtil.swap(a, i, j);
	    }
	}
	return j;
    }
}
