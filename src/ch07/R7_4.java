package ch07;

import java.util.Scanner;

public class R7_4 {
	
	public static void main(String[] args) {
		
		int[] list = new int[10];
		Scanner in = new Scanner(System.in);
		
		for (int i =0; i <10; i++)
		{
			System.out.print("Please enter a number: ");
			int number = in.nextInt();
			list[i] = number;
			
		}
		
		for (int i = list.length-1; i >=0;  i--)
		{
			System.out.println(list[i]);
		}
		
		in.close();
	}
	
}
