package BigJavaCh10;

public class Quiz implements Measurable{
	
	double score;
	String grade;
	
	public Quiz(double score, String grade) {
		
		this.score = score;
		this.grade = grade;
		
	}
	
	public double getMeasure() {
		return score;
	}
	
	public String getName() {
		return null;
	}

}
