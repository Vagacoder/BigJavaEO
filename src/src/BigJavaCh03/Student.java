package BigJavaCh03;

public class Student {

	private String name;
	private int totalScore;
	private int quizNumber;

	public Student(String stuName) {

		name = stuName;
		totalScore = 0;
		quizNumber = 0;
	}

	public void addQuiz(int score) {

		totalScore = totalScore + score;
		quizNumber = quizNumber + 1;

	}

	public int getTotalScore() {

		return totalScore;

	}

	public double getAverage() {

		return totalScore / quizNumber;
	}

}
