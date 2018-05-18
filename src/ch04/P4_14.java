package ch04;

import java.util.*;

public class P4_14 {


	public static void main(String[] args) {
		
		final double R0 = 1075;
		final double T0 = 85+273;
		final double BETA = 3969;

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter R: ");
		double r = in.nextDouble();
		
		double temp = (BETA * T0)/(T0 * Math.log(r/R0)+ BETA) -273;
		
		System.out.printf("The temperature is: %.2f.", temp);
		
	}

}
