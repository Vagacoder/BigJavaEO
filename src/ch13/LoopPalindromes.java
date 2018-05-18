package ch13;

public class LoopPalindromes {
    public static void main(String[] args) {
	String sentence1 = "Madam, I'm Adam!";
	System.out.println(sentence1);
	System.out.println("Palindrome: " + isPalindrome(sentence1));
	String sentence2 = "Sir, I'm Eve!";
	System.out.println(sentence2);
	System.out.println("Palindrome: " + isPalindrome(sentence2));
    }

    /**
     * Tests whether a text is a palindrome.
     * 
     * @param text
     *            a string that is being checked
     * @return true if text is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String text) {
	int start = 0;
	int end = text.length() - 1;
	while (start < end) {
	    char first = Character.toLowerCase(text.charAt(start));
	    char last = Character.toLowerCase(text.charAt(end));
	    if (Character.isLetter(first) && Character.isLetter(last)) {
		// Both are letters.
		if (first == last) {
		    start++;
		    end--;
		} else {
		    return false;
		}
	    }
	    if (!Character.isLetter(last)) {
		end--;
	    }
	    if (!Character.isLetter(first)) {
		start++;
	    }
	}
	return true;
    }
}
