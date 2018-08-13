package ch15;

import java.time.*;
import java.util.*;

// For the class of RosterTest

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		LocalDate now = LocalDate.now();
		return now.compareTo(birthday);
	}

	public void printPerson() {
		System.out.println(name);
	}

	public Sex getGender() {
		return gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public static List<Person> createRoster() {
		List<Person> result = new ArrayList<>();
		result.add(new Person("Jack", LocalDate.of(1998, 8, 03), Sex.MALE, "jack@abc.com"));
		result.add(new Person("Tom", LocalDate.of(1980, 1, 23), Sex.MALE, "tom@bbc.com"));
		result.add(new Person("Mady", LocalDate.of(1989, 1, 23), Sex.FEMALE, "mandy@cnn.com"));
		return result;
	}
}