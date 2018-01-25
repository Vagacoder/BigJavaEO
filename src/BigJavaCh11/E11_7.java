package BigJavaCh11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E11_7 {
	
	public static void main(String[] args) throws FileNotFoundException {
		File inputText = new File("text.txt");
		Scanner in = new Scanner(inputText);
		
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			lineCount ++;
			
			Scanner inputLine = new Scanner(line);
			
			while (inputLine.hasNext())
			{
				String word = inputLine.next();
				wordCount ++;
				
				charCount += word.length();

			}
		}
		
		System.out.printf("There are %d lines\n", lineCount);
		System.out.printf("There are %d words\n", wordCount);
		System.out.printf("There are %d characters\n", charCount);
	}
	
	
}
