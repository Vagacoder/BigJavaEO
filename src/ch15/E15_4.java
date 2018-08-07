package ch15;

// E15.4 Grade book for students

public class E15_4 {

	public static void main(String[] args) {
		
		GradeBook gb = new GradeBook();
		gb.add("Carl", "B");
		gb.add("Joe", "C");
		gb.add("Sarah", "A");
		gb.add("Carl", "B+");
		gb.update("Car", "B+");
		gb.update("Carl", "B+");
		gb.printGrade("Car");
		gb.printGrade("Carl");
		gb.printAll();
		gb.remove("Jack");
		gb.remove("Joe");
		
	}

}
