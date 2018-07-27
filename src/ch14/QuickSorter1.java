package ch14;

// P14.3
// if n <= 7, use the middle element.
// if n <= 40, use the median of first, middle and last element.
// otherwise, use pseudo-median of nine elements

public class QuickSorter1 {

    public static void sort(int[] a) {
	sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int from, int to) {
	if (from >= to) {
	    return;
	}
	int p = partition(a, from, to);
	sort(a, from, p);
	sort(a, p + 1, to);
    }

    // modified partition method

    private static int partition(int[] a, int from, int to) {
	int n = to - from + 1;
	int middle = (from + to) / 2;

	int pivot;

	if (n <= 7) {
	    pivot = a[middle];
	} else if (n <= 40) {
	    pivot = findMedianFrom3(a, from, to);
	} else {
	    pivot = findMedianFrom9(a, from, to);
	}

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

    // helper method to find median from 3 elements: starting one, middle one and
    // last one.
    private static int findMedianFrom3(int[] a, int from, int to) {
	int middle = (from + to) / 2;
	if (a[from] < a[middle]) {
	    if (a[middle] < a[to]) {
		return a[middle];
	    } else if (a[to] < a[from]) {
		return a[from];
	    } else
		return a[to];
	}
	// a[middle] < a[from]
	else {
	    if (a[from] < a[to]) {
		return a[from];
	    } else if (a[to] < a[middle]) {
		return a[middle];
	    } else {
		return a[to];
	    }
	}
    }

    // helper method to find median from 9 elements.
    private static int findMedianFrom9(int[] a, int from, int to) {
	int n = to - from + 1;
	int[] median1 = new int[3];
	int[] median2 = new int[3];
	int[] median3 = new int[3];
	for (int i = 0; i < 3; i++) {
	    median1[i] = a[i * (n - 1) / 8];
	}
	for (int i = 3; i < 6; i++) {
	    median2[i] = a[i * (n - 1) / 8];
	}
	for (int i = 6; i < 9; i++) {
	    median3[i] = a[i * (n - 1) / 8];
	}

	int[] medians = new int[3];
	medians[0] = findMedianFrom3(median1, 0, 2);
	medians[1] = findMedianFrom3(median2, 0, 2);
	medians[2] = findMedianFrom3(median3, 0, 2);

	return findMedianFrom3(medians, 0, 2);
    }

}
