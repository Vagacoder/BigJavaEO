package BigJavaCh07;

import java.util.*;

/**
 * This program reads a sequence of values and prints them, marking the largest
 * value.
 */
public class LargestInArrayList {
	public static void main(String[] args) {
		ArrayList<Double> values = new ArrayList<Double>();

		// Read inputs

		System.out.println("Please enter values, Q to quit:");
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble())
			{
				values.add(in.nextDouble());
			}

		// Find the largest value

		double largest = values.get(0);
		for (int i = 1; i < values.size(); i++)
			{
				if (values.get(i) > largest)
					{
						largest = values.get(i);
					}
			}

		// Print all values, marking the largest

		for (double element : values)
			{
				System.out.print(element);
				if (element == largest)
					{
						System.out.print(" <== largest value");
					}
				System.out.println();
			}
	}
}
