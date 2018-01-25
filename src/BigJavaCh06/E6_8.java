package BigJavaCh06;

import java.util.*;

public class E6_8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a sentence: ");
		String sentence = in.nextLine();
		int length = sentence.length();
		String first = "";
		String middle = "";
		String last = "";
		int i = 0;
		int j = 0;

		for (int k = 0; k < length; k++) {
			i = new Random().nextInt(length - 1);

			do {
				j = new Random().nextInt(length);
			} while (j <= i);

			first = sentence.substring(0, i);
			middle = sentence.substring(i + 1, j);
			last = sentence.substring(j + 1);

			sentence = first + sentence.charAt(j) + middle + sentence.charAt(i) + last;
			System.out.println(sentence);
		}
		in.close();
		System.out.println(sentence);
	}

}
