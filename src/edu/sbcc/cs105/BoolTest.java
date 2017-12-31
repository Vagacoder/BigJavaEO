package edu.sbcc.cs105;

public class BoolTest {

	public static void main(String[] args) {

		System.out.println(getStateA() || getStateB() && (getStateC() || getStateD()));

	}

	public static boolean getStateA() {
		System.out.println("A");
		return true;
	}

	public static boolean getStateB() {
		System.out.println("B");
		return true;
	}

	public static boolean getStateC() {
		System.out.println("C");
		return true;
	}

	public static boolean getStateD() {
		System.out.println("D");
		return false;
	}
}
