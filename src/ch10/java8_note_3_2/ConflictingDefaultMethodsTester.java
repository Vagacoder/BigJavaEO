package ch10.java8_note_3_2;

/*
  This program demonstrates what a class must do when it inherits 
  conflicting default methods from multiple interfaces. 
*/
public class ConflictingDefaultMethodsTester {
    public static void main(String[] args) {
	Named user = new User("Amy", "Smith");
	System.out.println("Name: " + user.name());
	System.out.println("Expected: asmith");
    }
}
