package ch02;

public class ReplaceTester {

	public static void main(String[] args) {
		String river = "Mississippi";
		String river_new = river.replace("s", "$");
		String river_new1 = river_new.replace("i", "!");
		river = river.toLowerCase();
		System.out.println("Expected result: ");
		System.out.println("M!$$!$$!pp!");
		System.out.println("My result is: ");
		System.out.println(river_new1);

		System.out.println(river);

		String space = " Hello, Space ! ";
		space.trim();
		System.out.println(space);
		System.out.println(space.trim());

	}

}
