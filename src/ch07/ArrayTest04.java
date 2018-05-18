package ch07;

import java.util.ArrayList;

public class ArrayTest04 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Bob");
		Student s2 = new Student("Maria");
		ArrayList<Student> dict = new ArrayList<Student>();
		dict.add(s1);
		dict.add(s2);

		ArrayList<Student> newDict = new ArrayList<Student>(dict);

		dict.get(0).setName("Roberto");
		
		for (Student s : dict)
			{
		System.out.println(s.getName());
		}

		for (Student s : newDict)
			{
		System.out.println(s.getName());
		}

		System.out.println(dict.remove(s1));
	}
	
}
