package ch10.java8_note_3_1;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
    }

    public String name() {
	return firstName() + " " + lastName();
    }

    public String firstName() {
	return firstName;
    }

    public String lastName() {
	return lastName;
    }
}
