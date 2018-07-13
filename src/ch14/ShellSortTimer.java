package ch14;

import java.util.*;

/**
 * This program measures how long it takes to sort an array of a user-specified
 * size with the Shell sort algorithm.
 */
public class ShellSortTimer {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter array size: ");
	int n = in.nextInt();

	// Construct random array

	int[] a = ArrayUtil.randomIntArray(n, 100);
	int[] a2 = Arrays.copyOf(a, a.length);
	int[] a3 = Arrays.copyOf(a, a.length);

	// Use stopwatch to time selection sort

	StopWatch timer = new StopWatch();

	timer.start();
	ShellSorter.sort(a);
	timer.stop();

	System.out.println("Elapsed time with Shell sort: " + timer.getElapsedTime() + " milliseconds");

	timer.reset();
	timer.start();
	Arrays.sort(a2);
	timer.stop();

	System.out.println("Elapsed time with Arrays.sort: " + timer.getElapsedTime() + " milliseconds");

	if (!Arrays.equals(a, a2)) {
	    throw new IllegalStateException("Incorrect sort result");
	}

	timer.reset();
	timer.start();
	InsertionSorter.sort(a3);
	timer.stop();

	System.out.println("Elapsed time with insertion sort: " + timer.getElapsedTime() + " milliseconds");
    }
}
