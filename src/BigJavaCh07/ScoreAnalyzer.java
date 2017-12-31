package BigJavaCh07;

import java.util.*;

public class ScoreAnalyzer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Student_Array fred = new Student_Array(100);
		System.out.println("Please enter values, Q to quit:");
		while (in.hasNextDouble()) {
			if (!fred.addScore(in.nextDouble())) {
				System.out.println("Too many scores.");
				return;
			}
		}
		System.out.println("Final score: " + fred.finalScore());
	}
}
