package ch14;

// P14.3 find k th element in a unsorted list

public class P14_3 {

    public static void main(String[] args) {

    }

    public static int findMedian(int[] l, int k, int a, int b) {

	if (a >= b) {
	    return l[a];
	}
	int p = partition(l, a, b);
	int n1 = p - a;
	int n2 = 1;
	int n3 = b - p;

	if (k < n1) {
	    return findMedian(l, k, 0, n1);
	} else if (k > n1 + n2) {
	    return findMedian(l, k - n1 - n2, n1 + n2, b);
	} else {
	    return p;
	}
    }

    private static int partition(int[] l, int from, int to) {
	int pivot = l[from];
	int i = from - 1;
	int j = to + 1;
	while (i < j) {
	    i++;
	    while (l[i] < pivot) {
		i++;
	    }
	    j--;
	    while (l[j] > pivot) {
		j--;
	    }
	    if (i < j) {
		ArrayUtil.swap(l, i, j);
	    }
	}
	return j;
    }
}
