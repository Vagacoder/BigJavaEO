package ch15;

import java.io.*;

// E15.13

public class E15_13 {

	public static void main(String[] args) throws FileNotFoundException {

		long start = System.nanoTime();
		E15_12.wordsCounterTree("war-and-peace.txt");
		long end = System.nanoTime();
		System.out.printf("TreeSet takes %d mili seconds\n", (end - start) / 1000000);
		start = System.nanoTime();
		E15_12.wordsCounterHash("war-and-peace.txt");
		end = System.nanoTime();
		System.out.printf("HashSet takes %d mili seconds\n", (end - start) / 1000000);

	}

}
