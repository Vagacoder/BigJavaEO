package edu.sbcc.cs105;

import java.util.*;

public class Input {

	public static void main(String[] args) {

		Scanner in1 = new Scanner(System.in);

		// System.out.print("Please enter bottle number: ");
		// int bottle = in1.nextInt();
		// System.out.print("Please enter name: ");
		// String name = in1.next();

		// System.out.println(bottle);
		// System.out.println(name);

		System.out.print("name:");
		String firstName = in1.next();
		String lastName = in1.next();
		System.out.println(firstName);
		System.out.println(lastName);
		in1.close();
	}

}
