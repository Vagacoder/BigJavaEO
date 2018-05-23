package ch10.java8_note_3_1;

public class User extends Person implements Named {
    private String username;

    public User(String first, String last) {
	super(first, last);
	username = (first.substring(0, 1) + last).toLowerCase();
    }

    // ...
}
