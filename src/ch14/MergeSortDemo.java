package ch14;

import java.util.*;

import org.apache.commons.lang3.RandomStringUtils;


/**
 * This program demonstrates the merge sort algorithm by sorting an array that
 * is filled with random numbers.
 */
public class MergeSortDemo {
	public static void main(String[] args) {
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println(Arrays.toString(a));

		MergeSorter.sort(a);

		System.out.println(Arrays.toString(a));
		
		String[] b = new String[20];
		for (int i =0; i < 20; i++) {
			b[i] = RandomStringUtils.randomAlphabetic(4);
		}
		
		System.out.println(Arrays.toString(b));

		MergeSorter.stringSort(b);

		System.out.println(Arrays.toString(b));
	}
}
