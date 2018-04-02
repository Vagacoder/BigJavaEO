package BigJavaCh08;

import java.io.File;
import java.io.FileNotFoundException;

import BigJavaCh07.*;

public class P8_5 {

	public static void main(String[] args) throws FileNotFoundException {

		File inputFile = new File("data.txt");
		java.util.Scanner in = new java.util.Scanner(inputFile);
		ReadCSV csv = new ReadCSV();

		while (in.hasNextLine()) {
			String line = in.nextLine();
			csv.addLine(line);
			System.out.println(csv.rows());
			System.out.println(csv.columns());
		}
		in.close();

		// new java.util.Random().nextInt(10);
	}

}
