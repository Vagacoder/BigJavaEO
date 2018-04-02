package BigJavaCh05;

import java.util.*;

public class Middle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = in.next();

		int position;
		int length;
		if (str.length() % 2 == 1) {
			position = str.length() / 2;
			length = 1;
		} else {
			position = str.length() / 2 - 1;
			length = 2;
		}
		String result = str.substring(position, position + length);

		System.out.println("Middle: " + result);
	}
}
