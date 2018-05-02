package BigJavaCh06;

import java.util.*;

public class E6_14_binary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int number = in.nextInt();
		in.close();
		while (number > 0) {

			System.out.printf("%d\n", number % 2);
			number = number / 2;

		}

	}

}
