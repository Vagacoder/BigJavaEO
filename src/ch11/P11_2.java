package ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * P11.2
 * @author qhu
 *
 */
public class P11_2 {

	public static void main(String[] args) {
		
		File inFileName = new File("BabyNames.txt");
		try (Scanner in = new Scanner(inFileName)){
			ArrayList<String> boyNames = new ArrayList<>();
			ArrayList<String> girlNames = new ArrayList<>();
			while(in.hasNextLine()) {
				String line = in.nextLine();
				String[] lineData = line.split("  ");
				boyNames.add(lineData[1]);
				girlNames.add(lineData[4]);
			}
			
			ArrayList<String> commonNames = new ArrayList<>();
			for (String boyName : boyNames) {
				for (String girlName : girlNames) {
					if (boyName.equals(girlName)) {
						commonNames.add(boyName);
					}
				}
			}
			
			for  (String name: commonNames) {
				System.out.println(name);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File does not exist.");
		}

	}

}
