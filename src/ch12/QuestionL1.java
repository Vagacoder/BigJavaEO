package ch12;

public class QuestionL1 extends Addition {

	public QuestionL1() {
		a = (int) (Math.random() * 10);
		b = (int) (Math.random() * (10 - a));
		result = a + b;
	}
}
