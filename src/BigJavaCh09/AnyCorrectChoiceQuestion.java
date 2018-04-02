package BigJavaCh09;

public class AnyCorrectChoiceQuestion extends ChoiceQuestion {

    private int answerNumber = 1;
    private String answer = "";

    public void addChoice(String choice, boolean correct) {

	super.addChoice(choice, correct);
	if (correct) {
	    if (answer.equals("")) {
		answer = answer + answerNumber;
	    } else {
		answer = answer + " " + answerNumber;
	    }
	}

	super.setAnswer(answer);

	answerNumber++;

    }

    public boolean checkAnswer(String response) {

	return super.checkOneOfAnswers(response);
    }
}
