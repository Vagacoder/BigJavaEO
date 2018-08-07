package ch15;

import java.util.*;

// for E15.4

public class GradeBook {

	private Map<String, String> gradeBook = new TreeMap<>();

	public void add(String student, String grade) {
		if (!gradeBook.containsKey(student)) {
			gradeBook.put(student, grade);
			System.out.println("Adding successfully!");
		} else {
			System.out.println("Student is already in grade book!");
		}	
	}
	
	public void remove(String student) {
		if (gradeBook.containsKey(student)) {
			gradeBook.remove(student);
			System.out.println("Removing successfully!");
		} else {
			System.out.println("Student is not in grade book!");
		}
	}

	public void update(String student, String grade) {
		if (gradeBook.containsKey(student)) {
			gradeBook.put(student, grade);
			System.out.println("Updating successfully!");
		} else {
			System.out.println("Student is not in grade book!");
		}
	}
	
	public void printGrade(String student) {
		if (gradeBook.containsKey(student)) {
			System.out.println(gradeBook.get(student));
		} else {
			System.out.println("Student is not in grade book!");
		}
	}
	
	public void printAll() {
		Set<String> keys = new TreeSet<String>(gradeBook.keySet());
		for (String stu : keys) {
			System.out.printf("%s: %s\n", stu, gradeBook.get(stu));
		}
	}
}
