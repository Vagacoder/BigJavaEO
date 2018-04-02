package BigJavaCh09;

public class Instructor extends Person {

	private double salary;

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + " " + salary;
	}
}
