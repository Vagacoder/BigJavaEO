package ch11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FormatOutput {

	public static void main(String[] args) throws IOException {
		String[] items = {"Cookie", "Linguine", "Clams"};
		double[] prices = {3001.2, 2.95, 17.29};
		System.out.printf("%-10s%+0,15.2f", items[0] + ":", prices[0]);
		String fileName = null;
		Files.readAllLines(Paths.get(fileName));
	}

}
