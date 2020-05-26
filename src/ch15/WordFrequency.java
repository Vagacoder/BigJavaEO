package ch15;

import java.io.*;
import java.util.*;

/**
 * This program prints the frequencies of all words in "Alice in Wonderland".
 */
public class WordFrequency {
	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> frequencies = new TreeMap<>();
		Scanner in = new Scanner(new File("data/alice30.txt"));
		while (in.hasNext()) {
			String word = clean(in.next());

			// Get the old frequency count

			Integer count = frequencies.get(word);

			// If there was none, put 1; otherwise, increment the count

			if (count == null) {
				count = 1;
			} else {
				count = count + 1;
			}

			frequencies.put(word, count);
		}

		// Print all words and counts

		for (String key : frequencies.keySet()) {
			System.out.printf("%-20s%10d\n", key, frequencies.get(key));
		}
	}

	/**
	 * Removes characters from a string that are not letters.
	 * 
	 * @param s a string
	 * @return a string with all the letters from s
	 */
	public static String clean(String s) {
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				r = r + c;
			}
		}
		return r.toLowerCase();
	}
}
