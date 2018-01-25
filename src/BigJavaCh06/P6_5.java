package BigJavaCh06;

import java.util.Scanner;

public class P6_5 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int number = in.nextInt();

		for (int i = 2; i<=number; i++)
		{	
			int count =0;
			for (int j = 2; j <= i; j ++)
			{	
				if (i%j == 0) {count ++;}
			}
			if (count <=2) {System.out.println(i);}
		}
		in.close();
	}
	
}
