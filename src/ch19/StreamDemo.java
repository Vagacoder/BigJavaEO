package ch19;

import java.io.*;
import java.util.*;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(new File("data/countries.txt"));
	// Scanner in = new Scanner(new File("data/data.txt"));

	// Scanner in1 = new Scanner(System.in);

	// This file contains one country name per line
	List<String> wordList = new ArrayList<>();
	while (in.hasNextLine()) {
	    wordList.add(in.nextLine());
	}
	// Now wordList is a list of country names

	// Traditional loop for counting the long words
	long count = 0;
	for (String w : wordList) {
	    if (w.length() > 10) {
		count++;
	    }
	}

	System.out.println("Long words: " + count);

	// The same computation with streams
	count = wordList.stream().filter(w -> w.length() > 10).count();

	System.out.println("Long words: " + count);

	in.close();
	// in1.close();
    }
}
