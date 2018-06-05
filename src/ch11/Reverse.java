package ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * E11.10
 * @author qhu
 *
 */
public class Reverse {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = args[0];
		Scanner in = new Scanner(new File(fileName));
		ArrayList<String> newFile = new ArrayList<>();
		while(in.hasNextLine()) {
			StringBuilder line = new StringBuilder(in.nextLine());
			line.reverse();
			newFile.add(line.toString());
		}
		in.close();
		PrintWriter out = new PrintWriter(fileName);
		for (String line : newFile) {
			out.print(line);
		}
		out.close();
	}
	
	

}
