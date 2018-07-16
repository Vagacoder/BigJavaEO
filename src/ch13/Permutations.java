package ch13;

import java.util.*;

/**
 * This program computes permutations of a string.
 */
public class Permutations {
    public static void main(String[] args) {
	for (String s : permutations("beat")) {
	    System.out.println(s);
	}

	// permutations("eat");
    }

    /**
     * Gets all permutations of a given word.
     * 
     * @param word
     *            the string to permute
     * @return a list of all permutations
     */
    public static ArrayList<String> permutations(String word) {
	ArrayList<String> result = new ArrayList<String>();

	// The empty string has a single permutation: itself;;; 1 or 0 is same.
	if (word.length() == 1) {
	    result.add(word);
	    return result;
	} else {
	    // Loop through all character positions
	    for (int i = 0; i < word.length(); i++) {
		// Form a shorter word by removing the ith character
		String shorter = word.substring(0, i) + word.substring(i + 1);

		// Generate all permutations of the simpler word
		ArrayList<String> shorterPermutations = permutations(shorter);

		// Add the removed character to the front of
		// each permutation of the simpler word,
		for (String s : shorterPermutations) {
		    result.add(word.charAt(i) + s);
		}
	    }
	    // Return all permutations
	    return result;
	}
    }
}
