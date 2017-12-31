package BigJavaCh04;

import java.util.*;

public class R4_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter an integer: ");
		int number = scan.nextInt();
		int lengthOfNumber = (int) Math.floor(Math.log10(number));

		System.out.println(Math.log10(number));
		System.out.println(lengthOfNumber);

		int firstDigit = (int) (number / Math.pow(10, lengthOfNumber));
		int lastDigit = number % 10;

		System.out.println("The first digit is: " + firstDigit);
		System.out.println("The last digit is: " + lastDigit);

	}

}
