package ch13;

public class E13_7 {

    public static void main(String[] args) {
	System.out.println(reverseString("Hello!"));

    }

    public static String reverseString(String input) {
	String result = "";
	for (int i = input.length() - 1; i >= 0; i--) {
	    char lastChar = input.charAt(i);
	    result += lastChar;
	}
	return result;
    }
}
