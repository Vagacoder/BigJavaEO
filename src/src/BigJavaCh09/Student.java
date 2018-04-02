package BigJavaCh09;

public class Student extends Person {

	private String major;

	public void setMajor(String major) {

		this.major = major;

	}

	public String toString() {

		return super.toString() + " " + major;
	}

}
