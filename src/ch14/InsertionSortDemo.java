package ch14;

import java.util.*;

/**
 * This program demonstrates the insertion sort algorithm.
 */
public class InsertionSortDemo {
    public static void main(String[] args) {
	int[] a = ArrayUtil.randomIntArray(20000, 100);
	System.out.println(Arrays.toString(a));
	StopWatch sw1 = new StopWatch();
	sw1.start();
	InsertionSorter.sort(a);
	sw1.stop();
	System.out.println(Arrays.toString(a));
	System.out.printf("Insertion sort takes %d milli seconds", sw1.getElapsedTime());
    }
}
