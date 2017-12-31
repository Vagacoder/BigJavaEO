package BigJavaCh09;

import java.util.*;

/**
 * This program shows a simple quiz with one question.
 */
public class QuestionDemo1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Question q = new Question();
		q.setText("Who was the inventor of Java?");
		q.setAnswer("James Gosling");

		q.display();
		System.out.print("Your answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));

		AnyCorrectChoiceQuestion q1 = new AnyCorrectChoiceQuestion();
		q1.setText("Where have you been?");
		q1.addChoice("Beijing", true);
		q1.addChoice("Shanghai", false);
		q1.addChoice("Guangzhou", false);
		q1.addChoice("Tianjing", true);
		q1.display();
		System.out.print("Your answer: ");
		response = in.nextLine();
		System.out.println(q1.checkOneOfAnswers(response));
		System.out.println(q1.toString());

		MultiChoiceQuestion q2 = new MultiChoiceQuestion();
		q2.setText("Where have you been?");
		q2.addChoice("Beijing", true);
		q2.addChoice("Shanghai", false);
		q2.addChoice("Guangzhou", false);
		q2.addChoice("Tianjing", true);
		q2.display();
		System.out.print("Your answer: ");
		response = in.nextLine();
		System.out.println(q2.checkAnswer(response));
		System.out.println(q2.toString());
	}
}
