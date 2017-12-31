package edu.sbcc.cs105;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {

		double sum = 0, x = 0;
		Scanner in = new Scanner(System.in);
		for (System.out.print("Inputs: "); in.hasNextDouble(); sum = sum + x) {
			x = in.nextDouble();
		}
		in.close();
		System.out.println(sum);

	}

}
