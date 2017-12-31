package BigJavaCh07;

import java.util.*;

/**
 * This program reads a sequence of die toss values and prints how many times
 * each value occurred.
 */
public class Dice {
	private int[] counters;

	public Dice(int sides) {
		counters = new int[sides + 1]; // counters[0] is not used
	}

	public void countInputs() {
		System.out.println("Please enter values, Q to quit:");
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int value = in.nextInt();

			// Increment the counter for the input value

			if (1 <= value && value < counters.length) {
				counters[value]++;
			} else {
				System.out.println(value + " is not a valid input.");
			}
		}
	}

	public void printCounters() {
		for (int i = 1; i < counters.length; i++) {
			System.out.printf("%2d: %4d\n", i, counters[i]);
		}
	}
}
