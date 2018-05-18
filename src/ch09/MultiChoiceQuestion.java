package ch09;

public class MultiChoiceQuestion extends AnyCorrectChoiceQuestion {

	public void display() {
		// Display the question text
		super.display();
		System.out.println("Please input all answers separated with space. e.g. 1 3 4");
	}

}
