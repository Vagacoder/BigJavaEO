package ch11;

import java.util.Scanner;

/**
 * E11.13
 * @author qhu
 *
 */
public class E11_13 {

	public static void main(String[] args) {
		System.out.println("Please enter float number: ");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		int errorCount = 0;
		double sum = 0;
		while(!input.equals("Q") && errorCount < 1) {
			try {
			double inputNumber = Double.parseDouble(input);
			sum +=inputNumber;
			}
			catch(IllegalArgumentException e){
				System.out.println("Wrong input, please try again.");
				errorCount ++;
			}
			input = in.next();
		}
		in.close();
		System.out.println("Sum is: " + sum);
		
	}

}
