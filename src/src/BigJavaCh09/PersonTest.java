package BigJavaCh09;

import java.time.*;

public class PersonTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Alex");
		s1.setDOB(LocalDate.of(1990, 1, 2));
		s1.setMajor("Computer");

		Instructor i1 = new Instructor();
		i1.setName("Paul");
		i1.setDOB(LocalDate.of(1970, 6, 25));
		i1.setSalary(70000);

		Person s2 = new Student();
		s2.setName("Bob");
		s2.setDOB(LocalDate.of(1992, 3, 5));
		Student s2_1 = (Student) s2;
		s2_1.setMajor("Biology");

		Person i2 = new Instructor();
		i2.setName("Jack");
		i2.setDOB(LocalDate.of(1966, 9, 30));
		System.out.println(i2 instanceof Instructor);
		((Instructor) i2).setSalary(10000);
		Instructor i2_1 = (Instructor) i2;
		i2_1.setSalary(100000);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s2_1.toString());
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		System.out.println(i2_1.toString());
	}
}
