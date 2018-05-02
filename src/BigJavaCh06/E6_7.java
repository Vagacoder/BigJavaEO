package BigJavaCh06;

import java.util.Scanner;

public class E6_7 {
	
	public static void main(String[] args) {
		boolean first = true;
		double min=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Plesae enter a number: ");
		while (in.hasNextDouble())
		{
			double number = in.nextDouble();
			if (first == true) {first = false; min = number;}
			else if (number < min)
			{
				min = number;
			}
			
			System.out.print("Plesae enter a number (Q for finish): ");
		}
		in.close();
		System.out.println(min);
	}
	
}
