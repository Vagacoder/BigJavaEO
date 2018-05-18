package ch03;

public class StudentTester {

	public static void main(String[] args) {

		Student qirui = new Student("Qirui");

		qirui.addQuiz(99);
		qirui.addQuiz(91);
		qirui.addQuiz(84);

		System.out.println(qirui.getTotalScore());
		System.out.println(qirui.getAverage());

	}

}
