package BigJavaCh13;

public class E13_9 {

    public static void main(String[] args) {

	System.out.println(indexOf("Mississippi", "sip"));

    }

    public static int indexOf(String text, String str) {

	return findIndex(text, str, 0);
    }

    private static int findIndex(String input, String find, int index) {

	if (index > input.length() - find.length()) {
	    return -1;
	} else {
	    if (input.substring(index).startsWith(find)) {
		return index;
	    } else {
		return findIndex(input, find, index + 1);
	    }
	}
    }
}
