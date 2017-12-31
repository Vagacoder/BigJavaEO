package edu.sbcc.cs105;

import java.awt.*;
//import java.lang.Object;

public class StringTester01 {

	public static void main(String[] args) {
		String a = " Hello";
		String b = "World ";
		String c = "!";
		String new_string = String.join(" ", a, b, c);
		System.out.println(new_string);
		String new_string1 = new_string.trim();
		System.out.println(new_string1);
		Rectangle box = new Rectangle(10, 4, 50, 50);
		System.out.println(box);
		box.toString();
		// String box_s = box.toString();
		// System.out.println(box_s);

		String box_s1 = String.join(" ", a, box.toString(), b);
		System.out.println(box_s1);

	}

}
