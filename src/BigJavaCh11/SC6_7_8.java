package BigJavaCh11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SC6_7_8 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		/**
		String string1 = "Hello, World!";
		Scanner in = new Scanner(string1);
		String word = in.next();
		String input = in.nextLine();
		
		System.out.println(word);
		System.out.println(input);
		
		String string2 = "995.0 Fred";
		in = new Scanner(string2);
		int number = 0;
		if (in.hasNextInt()) {number = in.nextInt();}
		input = in.next();
		System.out.println(number);
		System.out.println(input);
		*/
		
		/**
		String string3 = "6E6 $6,995.00";
		Scanner in = new Scanner(string3);
		double x1 = in.nextDouble();
		System.out.println(x1);
		double x2 = in.nextDouble();
		System.out.println(x2);
		*/
		File input = new File("input.txt");
		Scanner in = new Scanner(input);
		String temp ="";
		while (in.hasNext())
		{
		if (in.hasNextDouble())
		{
			double value = in.nextDouble();
			System.out.println(value);
		}
		
		
		else if (in.next().equals("N/A"))
		{
			temp = in.next();
		}
		}
		//String remove = in.nextLine();
		//System.out.println(remove);
		System.out.println(temp);
		
	
	}	
}
