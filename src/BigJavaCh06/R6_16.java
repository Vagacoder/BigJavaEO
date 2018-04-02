<<<<<<< HEAD
package BigJavaCh06;

import java.util.*;

public class R6_16 {

	public static void main(String[] args) {

		ArrayList<Integer> scores = new ArrayList<Integer>();
		System.out.print("Please enter name: ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

		System.out.print("Please enter the score, enter -1 for finishe: ");
		int score = in.nextInt();
		while (score != -1) {
			scores.add(score);
			score = in.nextInt();
		}

		int sum = 0;
		System.out.print(name + " ");
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
			System.out.printf("%d ", scores.get(i));
		}
		double average = sum / scores.size();
		in.close();
		System.out.printf("The average score is %.1f.\n", average);
	}

}
=======
package BigJavaCh06;

import java.util.*;

public class R6_16 {

	public static void main(String[] args) {

		ArrayList<Integer> scores = new ArrayList<Integer>();
		System.out.print("Please enter name: ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();

		System.out.print("Please enter the score, enter -1 for finishe: ");
		int score = in.nextInt();
		while (score != -1) {
			scores.add(score);
			score = in.nextInt();
		}

		int sum = 0;
		System.out.print(name + " ");
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
			System.out.printf("%d ", scores.get(i));
		}
		double average = sum / scores.size();
		in.close();
		System.out.printf("The average score is %.1f.\n", average);
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
