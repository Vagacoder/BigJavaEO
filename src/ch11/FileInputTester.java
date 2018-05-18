
package ch11;

import java.io.*;
import java.util.*;

public class FileInputTester {

    public static void main(String[] args) throws FileNotFoundException {

	File inputFile = new File("input.txt");
	Scanner in = new Scanner(inputFile);
	in.useDelimiter("[^A-Za-z]+");

	while (in.hasNext()) {
	    String word = in.next();
	    System.out.println(word);
	}
	/**
	 * while (in.hasNextDouble()) { double number = in.nextDouble();
	 * System.out.println(number); }
	 */

	in.close();
	/**
	 * File output = new File("output.txt"); PrintWriter out = new
	 * PrintWriter(output); out.println("Hello World!"); out.close();
	 */

    }

}
