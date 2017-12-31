package BigJavaCh09;

public class NumericQuestion extends Question {

	double answer;

	public void setAnswer(double answer) {

		this.answer = answer;
	}

	public boolean checkAnswer(double response) {

		if (Double.compare(answer, response) == 0)
			{
				return true;
			}
		else
			{
				return false;
			}

	}

}
