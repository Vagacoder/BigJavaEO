package ch14;

import java.util.*;

public class E14_15 {

    public static void main(String[] args) {
	int[] a = { 2, 1, 4, 3, 5, 7, 10, 8, 6, 9 };
	insertionSort1(a);
	System.out.println(Arrays.toString(a));
    }

    public static void insertionSort1(int[] a) {
	for (int i = 1; i < a.length; i++) {
	    int next = a[i];
	    int indexForNext = -E14_13.search(a, 0, i - 1, next) - 1;
	    int j;
	    for (j = i; j > indexForNext && j > 0; j--) {
		a[j] = a[j - 1];
	    }
	    a[j] = next;
	}
    }
}
