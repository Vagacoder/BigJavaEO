package BigJavaCh05;

import java.util.*;

public class E5_21 {

	public static void main(String[] args) {

		System.out.print("Please enter 3 words: ");
		Scanner in = new Scanner(System.in);
		String first = in.next();
		String second = in.next();
		String third = in.next();
		in.close();

		String min = "";
		String middle = "";
		String max = "";

		if (first.compareTo(second) < 0 && first.compareTo(third) < 0) {
			min = first;
			if (second.compareTo(third) < 0) {
				middle = second;
				max = third;
			} else {

				middle = third;
				max = second;
			}

		} else if (second.compareTo(first) < 0 && second.compareTo(third) < 0) {
			min = second;
			if (first.compareTo(third) < 0) {
				middle = first;
				max = third;
			} else {
				middle = third;
				max = first;
			}

		} else if (third.compareTo(first) < 0 && third.compareTo(second) < 0) {
			min = third;
			if (first.compareTo(second) < 0) {
				middle = first;
				max = second;
			} else {
				middle = second;
				max = first;
			}

		}

		System.out.println(min);
		System.out.println(middle);
		System.out.println(max);
	}

}
