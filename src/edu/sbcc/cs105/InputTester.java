package edu.sbcc.cs105;

import java.io.*;
import java.util.*;

public class InputTester {

	public static void main(String[] args) throws FileNotFoundException {

		File inputFile = new File("data.txt");
		Scanner in = new Scanner(inputFile);

		while (in.hasNextDouble()) {
			double number = in.nextDouble();
			System.out.println(number);
		}

		in.close();

		System.out.println(System.getProperty("user.dir"));

		PrintWriter out = new PrintWriter("output.txt");
		out.println("Hello world!");
		out.close();
	}

}
