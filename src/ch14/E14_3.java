package ch14;

import java.util.Scanner;

public class E14_3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter minimum array size: ");
		int min = in.nextInt();
		System.out.print("Enter maximum array size: ");
		int max = in.nextInt();

		// Construct random array

		for (int i = min; i <= max; i += (max-min)/100) {
		int[] a = ArrayUtil.randomIntArray(i, 100);

		// Use stopwatch to time selection sort

		StopWatch timer = new StopWatch();

		timer.start();
		SelectionSorter.sort(a);
		timer.stop();

		System.out.println("Array size: " + i +" \tElapsed time: " + 
		timer.getElapsedTime() + " milliseconds");}
	}
}
