package BigJavaCh10;

import java.util.*;

public class PersonTester {

	public static void main(String[] args) {
		Person p1 = new Person("Alex", 1.90);
		Person p2 = new Person("Bob", 1.55);
		Person p3 = new Person("Charlie", 1.78);
		Person p4 = new Person("Dave", 1.68);

		Person[] persons = { p1, p2, p3, p4 };
		System.out.println(persons[3].getName());
		Arrays.sort(persons);
		System.out.println(persons[3].getName());

	}

}
