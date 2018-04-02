package BigJavaCh09;

import java.time.*;

public class Person {

	private String name;
	private LocalDate dateOfBirth;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDOB(LocalDate date) {
		dateOfBirth = date;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDOB() {
		return dateOfBirth;
	}

	public String toString() {
		return name + " " + dateOfBirth.toString();
	}

}
