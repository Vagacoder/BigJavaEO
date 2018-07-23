package ch14;

import java.util.*;

// P14.3 find k th element in a unsorted list

public class P14_3 {

    public static void main(String[] args) {

	int[] a = ArrayUtil.randomIntArray(10, 20);
	// int[] a = { 6, 7, 2, 4, 1, 6, 6, 3, 9, 4 };
	// int[] a = { 11, 15, 12, 17, 13, 13, 18, 15, 18, 11 };
	// int[] a = { 15, 8, 6, 19, 0, 18, 14, 13, 15, 15 };
	System.out.println(Arrays.toString(a));
	int k = findMedian(a, 5, 0, a.length);
	System.out.println(k);
	System.out.println(Arrays.toString(a));
    }

    public static int findMedian(int[] l, int k, int a, int b) {
	int pivot = l[a];
	if (a >= b) {
	    return pivot;
	}
	ArrayList<Integer> smaller = new ArrayList<>();
	ArrayList<Integer> equal = new ArrayList<>();
	ArrayList<Integer> larger = new ArrayList<>();

	for (int i = a; i < b; i++) {
	    int number = l[i];
	    if (number < pivot) {
		smaller.add(number);
	    } else if (number == pivot) {
		equal.add(number);
	    } else {
		larger.add(number);
	    }
	}

	int n1 = smaller.size();
	int n2 = equal.size();
	int n3 = larger.size();

	if (k <= n1) {
	    int[] newArray = listToArray(smaller);
	    return findMedian(newArray, k, 0, n1);
	} else if (k > n1 + n2) {
	    int[] newArray = listToArray(larger);
	    return findMedian(newArray, k - n1 - n2, 0, n3);
	} else {
	    return pivot;
	}
    }

    public static int[] listToArray(List<Integer> l) {
	int[] result = new int[l.size()];
	for (int i = 0; i < l.size(); i++) {
	    result[i] = l.get(i);
	}
	return result;
    }

    private static int partition(int[] l, int from, int to) {
	int pivot = l[from];
	int p = from;
	int i = from + 1;
	while (i < to) {
	    if (l[i] < pivot) {
		int temp = l[i];
		int j = i - 1;
		while (j >= p && j >= 0) {
		    l[j + 1] = l[j];
		    j--;
		}
		j++;
		l[j] = temp;
		p++;
		i++;

	    } else if (l[i] == pivot) {
		// int temp = l[i];
		int j = i - 1;
		while (j >= p && j >= 0) {
		    l[j + 1] = l[j];
		    j--;
		}
		// j++;
		// l[j] = temp;
		i++;
	    } else {
		i++;
	    }
	}
	return p;
    }
}
