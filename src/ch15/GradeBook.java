package ch15;

import java.util.*;

// for E15.4

public class GradeBook {

	private Map<String, String> gradeBook = new TreeMap<>();

	public void add(String student, String grade) {
		gradeBook.put(student, grade);

	}

}
