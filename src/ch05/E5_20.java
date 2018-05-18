package ch05;

import java.util.*;

public class E5_20 {

	public static void main(String[] args) {

		System.out.print("Please enter 3 numbers: ");
		Scanner in = new Scanner(System.in);
		double firstNumber = in.nextDouble();
		double secondNumber = in.nextDouble();
		double thirdNumber = in.nextDouble();
		double max = 0;
		in.close();

		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			max = firstNumber;
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			max = secondNumber;
		} else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
			max = thirdNumber;
		}

		System.out.printf("The largest is %.1f", max);

	}

}
