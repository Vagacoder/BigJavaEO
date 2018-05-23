package ch10.java8_note_3_2;

/**
 * This class implements two interfaces, each of which provides a default name
 * method.
 */
public class User implements Person, Named {
    private String first;
    private String last;

    public User(String first, String last) {
	this.first = first;
	this.last = last;
    }

    // This method MUST be implemented to resolve the conflict.
    public String name() {
	// Here, we provide a different implementation.
	return (first.substring(0, 1) + last).toLowerCase();

	// You could have also called one of the default methods:
	// return Person.super.name();
    }

    public String firstName() {
	return first;
    }

    public String lastName() {
	return last;
    }
}
