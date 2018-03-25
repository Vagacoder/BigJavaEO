package BigJavaCh13;

public class E13_5 {

    public static void main(String[] args) {
	System.out.println(reverseString("Hello!"));
	System.out.println(reverseString1("Hello!"));

    }

    public static String reverseString(String input) {

	if (input.length() <= 1) {
	    return input;
	} else {
	    return reverseString(input.substring(1)) + input.charAt(0);
	}

    }

    public static String reverseString1(String input) {
	return reverseStringRange(input, 0, input.length() - 1);
    }

    private static String reverseStringRange(String input, int startIndex, int endIndex) {

	if (startIndex >= endIndex) {
	    return input.substring(startIndex);
	} else {
	    return reverseStringRange(input, startIndex + 1, endIndex) + input.charAt(startIndex);
	}

    }
}
