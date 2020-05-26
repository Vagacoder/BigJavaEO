package ch15;

import java.io.*;
import java.util.*;

/**
 * This program checks which words in a file are not present in a dictionary.
 */
public class SpellCheck {
	public static void main(String[] args) throws FileNotFoundException {
		// Read the dictionary and the document

		Set<String> dictionaryWords = readWords("data/words");
		Set<String> documentWords = readWords("data/alice30.txt");

		// Print all words that are in the document but not the dictionary

		for (String word : documentWords) {
			if (!dictionaryWords.contains(word)) {
				System.out.println(word);
			}
		}
	}

	/**
	 * Reads all words from a file.
	 * 
	 * @param filename
	 *            the name of the file
	 * @return a set with all lowercased words in the file. Here, a word is a
	 *         sequence of upper- and lowercase letters.
	 */
	public static Set<String> readWords(String filename) throws FileNotFoundException {
		Set<String> words = new HashSet<>();
		Scanner in = new Scanner(new File(filename));
		// Use any characters other than a-z or A-Z as delimiters
		in.useDelimiter("[^a-zA-Z]+");
		while (in.hasNext()) {
			words.add(in.next().toLowerCase());
		}
		in.close();
		return words;
	}
}
