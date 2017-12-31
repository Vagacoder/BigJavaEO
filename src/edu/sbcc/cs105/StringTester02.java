package edu.sbcc.cs105;

public class StringTester02 {

	public static void main(String[] args) {
		String s1 = " Hello";
		String s2 = s1;
		String s3 = s1.toUpperCase();
		// String s3 = s1.replace("o", "O");
		// String s3 = s1.trim();
		s1 = s3;
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s3);

	}

}
