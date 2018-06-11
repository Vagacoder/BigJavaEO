package ch12;

public class QuestionL3 extends Addition{
	
	public QuestionL3() {
		a = (int) (Math.random() * 10);
		b = (int) (Math.random() * 10);
		result = a - b;
	}

	@ Override
	public void printQ() {
		System.out.printf("%d - %d = ?", a, b);
	}
}
