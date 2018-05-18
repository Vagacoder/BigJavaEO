package ch05;

import java.util.Scanner;

public class E5_3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int number = in.nextInt();
		in.close();
		int numberDigit = (int) Math.log10(number);
		System.out.println(numberDigit+1);
		
	}
	
}

