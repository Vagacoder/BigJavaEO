package ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * P11.12
 * @author qhu
 *
 */
public class P11_12 {

	public static void main(String[] args) throws IOException {
		List<String> wholeFile = Files.readAllLines(Paths.get("params.txt"));
		if (wholeFile.size() != 5 ) {
			throw new IllegalArgumentException("File format is not corret!");
		}
		double B = Double.parseDouble(wholeFile.get(0));
		double R = Double.parseDouble(wholeFile.get(1));
		double C = Double.parseDouble(wholeFile.get(2));
		int start = Integer.parseInt(wholeFile.get(3));
		int end = Integer.parseInt(wholeFile.get(4));

		
		if (end < start) {
			throw new IllegalArgumentException("Time is not corret!");
		}
		int time = start;
		PrintWriter out = new PrintWriter("rcout.txt");
		while (time <= end) {
			double v = B*(1-Math.exp(-time/R/C));
			out.printf("%d\t%.5f\n", time, v);
			time += 10;
		}
		out.close();
	}

}
