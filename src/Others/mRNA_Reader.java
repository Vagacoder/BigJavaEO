package Others;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class mRNA_Reader {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File input = new File("hSOX2-NCBI.txt");
		Scanner in = new Scanner(input);
		String textWithSpace = "";
		String text = "";
		String readableText = "";
		
		
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			textWithSpace += line;
		}
		
		Scanner in1 = new Scanner(textWithSpace);
		
		while (in1.hasNext())
			{
				String word = in1.next();
				text +=word;
				
			}
		
		//System.out.println(text);
		//System.out.println(text.length());
		
		for (int i =0; i< text.length(); i++)
			{
				char bps = text.charAt(i);
				readableText += (bps+"\n");
			}
		
		System.out.println(readableText);
		System.out.println(readableText.length());
		
		PrintWriter out = new PrintWriter("hSOX2.txt");
		out.print(readableText);
		in.close();in1.close();out.close();
		
		
	}
	
}
