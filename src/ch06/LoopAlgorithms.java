package ch06;

import java.util.*;

/**
 * This program combines several common loop algorithms.
 */
public class LoopAlgorithms {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter input: ");
		int input = in.nextInt();
		int min = input; // The largest input
		int max = input; // The smallest input

		int count = 1; // The number of inputs
		int sum = input; // The sum of the inputs

		boolean foundNegative = false; // Set to true if we found at least one negative input
		int negatives; // The count of negative inputs
		int firstNegative = 0; // The position of the first negative input

		if (input < 0) {
			foundNegative = true;
			firstNegative = 1;
			negatives = 1;
		} else {
			negatives = 0;
		}

		boolean done = false;
		while (!done) {
			System.out.print("Enter input, 0 to quit: ");
			input = in.nextInt();
			if (input == 0) // Zero is the sentinel value
			{
				done = true;
			} else {
				sum = sum + input; // Computing sum and average
				count++;

				if (input < min) // Determining minimum and maximum
				{
					min = input;
				} else if (input > max) {
					max = input;
				}

				if (input < 0) // Counting matches
				{
					negatives++;

					if (!foundNegative) // Finding first match
					{
						foundNegative = true;
						firstNegative = count;
					}
				}
			}
		}
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum * 1.0 / count);
		System.out.println("Negative values: " + negatives);
		if (foundNegative) {
			System.out.println("First negative: " + firstNegative);
		}
		in.close();
	}
}
