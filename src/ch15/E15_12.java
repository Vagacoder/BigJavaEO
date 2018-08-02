package ch15;

import java.io.*;
import java.util.*;

// E15.12

public class E15_12 {

	public static void main(String[] args) {
		try {
			wordsCounterTree("alice30.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			;
		}

	}

	public static void wordsCounterTree(String filename) throws FileNotFoundException {
		Scanner in = new Scanner(new File(filename));
		TreeSet<String> words = new TreeSet<>();
		while (in.hasNextLine()) {
			String line = in.nextLine();
			// String[] lineToWords = line.split("[\\p{Punct}\\s]+");
			String[] lineToWords = line.split("[\\.,\\s!;?:\"'()*-`#$%~]+");
			for (String str : lineToWords) {
				words.add(str);
			}

		}
		// System.out.println(words.toString());
		System.out.println(words.size());
		in.close();
	}

	public static void wordsCounterHash(String filename) throws FileNotFoundException {
		Scanner in = new Scanner(new File(filename));
		HashSet<String> words = new HashSet<>();
		while (in.hasNextLine()) {
			String line = in.nextLine();
			// String[] lineToWords = line.split("[\\p{Punct}\\s]+");
			String[] lineToWords = line.split("[\\.,\\s!;?:\"'()*-`#$%~]+");
			for (String str : lineToWords) {
				words.add(str);
			}

		}
		// System.out.println(words.toString());
		System.out.println(words.size());
		in.close();
	}

}
