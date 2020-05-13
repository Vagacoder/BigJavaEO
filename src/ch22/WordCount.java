package ch22;

/*
* E22.7 Write a program WordCount that counts the words in one or more files. 
Start a new thread for each file.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount implements Runnable {

	File inFile;
	Scanner in;
	int count = 0;

	public WordCount(String fileName) throws FileNotFoundException {
		inFile = new File(fileName);
		in = new Scanner(inFile);
	}

	@Override
	public void run() {
		while (in.hasNext()) {
			String a = in.next();
			// System.out.println(a);
			count++;
		}
		System.out.println(inFile.getName() + ": " + count);
		in.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		WordCount w1 = new WordCount("alice30.txt");
		WordCount w2 = new WordCount("data.txt");
		WordCount w3 = new WordCount("babynames.txt");
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w2);
		Thread t3 = new Thread(w3);
		t1.start();
		t2.start();
		t3.start();
	}
}
