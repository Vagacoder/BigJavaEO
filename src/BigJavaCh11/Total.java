<<<<<<< HEAD
package BigJavaCh11;

import java.io.*;
import java.util.*;

/**
 * This program reads a file with numbers, and writes the numbers to another
 * file, lined up in a column and followed by their total.
 */
public class Total {
	public static void main(String[] args) throws FileNotFoundException {
		// Prompt for the input and output file names

		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.next();
		System.out.print("Output file: ");
		String outputFileName = console.next();

		// Construct the Scanner and PrintWriter objects for reading and writing

		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);

		// Read the input and write the output

		double total = 0;

		while (in.hasNextDouble()) {
			double value = in.nextDouble();
			out.printf("%15.2f\n", value);
			total = total + value;
		}

		out.printf("Total: %8.2f\n", total);

		in.close();
		out.close();
		console.close();
	}
}
=======
package BigJavaCh11;

import java.io.*;
import java.util.*;

/**
 * This program reads a file with numbers, and writes the numbers to another
 * file, lined up in a column and followed by their total.
 */
public class Total {
	public static void main(String[] args) throws FileNotFoundException {
		// Prompt for the input and output file names

		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.next();
		System.out.print("Output file: ");
		String outputFileName = console.next();

		// Construct the Scanner and PrintWriter objects for reading and writing

		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);

		// Read the input and write the output

		double total = 0;

		while (in.hasNextDouble()) {
			double value = in.nextDouble();
			out.printf("%15.2f\n", value);
			total = total + value;
		}

		out.printf("Total: %8.2f\n", total);

		in.close();
		out.close();
		console.close();
	}
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
