package BigJavaCh05;

import java.util.Scanner;

public class E5_2 {
	
	public static void main(String[] args) {
		
		final double EPSILON = 1E-14;
		
		System.out.println("Please enter a number: ");
		Scanner in = new Scanner(System.in);
		
		double number = in.nextDouble();
		
		if (Math.abs(number - 0) < EPSILON) {System.out.println("It is zero.");}
		else if (number > EPSILON) {System.out.println("It is positive.");}
		else if (number < -EPSILON) {System.out.println("It is negative.");}
		
		if (1 - Math.abs(number) > EPSILON) {System.out.println("It is small.");}
		if (Math.abs(number) -1000_000 > EPSILON) {System.out.println("It is large.");}
		
		in.close();

	}
	
}
