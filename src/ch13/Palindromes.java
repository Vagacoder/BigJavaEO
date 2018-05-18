package ch13;

public class Palindromes {
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
	int length = text.length();

	// Separate case for shortest strings.
	if (length <= 1) {
	    return true;
	} else {
	    // Get first and last characters, converted to lowercase.
	    char first = Character.toLowerCase(text.charAt(0));
	    char last = Character.toLowerCase(text.charAt(length - 1));

	    if (Character.isLetter(first) && Character.isLetter(last)) {
		// Both are letters.
		if (first == last) {
		    // Remove both first and last character.
		    String shorter = text.substring(1, length - 1);
		    return isPalindrome(shorter);
		} else {
		    return false;
		}
	    } else if (!Character.isLetter(last)) {
		// Remove last character.
		String shorter = text.substring(0, length - 1);
		return isPalindrome(shorter);
	    } else {
		// Remove first character.
		String shorter = text.substring(1);
		return isPalindrome(shorter);
	    }
	}
    }
}
