package ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * E11.11
 * 
 * @author qhu
 *
 */
public class ReverseLine {

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length < 2) {
			throw new IllegalArgumentException("Wrong arguments!");
		}
		String fileName = args[0];
		Scanner in = new Scanner(new File(fileName));
		ArrayList<String> newFile = new ArrayList<>();
		while (in.hasNextLine()) {
			String line = in.nextLine();
			newFile.add(line.toString());
		}
		in.close();

		String outFileName = args[1];
		PrintWriter out = new PrintWriter(outFileName);
		for (int i = newFile.size() - 1; i > 0; i--) {
			out.print(newFile.get(i));
		}
		out.close();

	}

}
