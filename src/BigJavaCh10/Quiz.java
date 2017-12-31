package BigJavaCh10;

public class Quiz implements Measurable {

	private double score;
	private String grade;

	public Quiz(double score, String grade) {
		this.score = score;
		this.grade = grade;
	}

	@Override
	public double getMeasure() {
		return score;
	}

}
