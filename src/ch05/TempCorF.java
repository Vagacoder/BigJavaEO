package ch05;

import java.util.*;

public class TempCorF {

	public static void main(String[] args) {

		String state;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter C or Celsius, F for Fahrenheit: ");
		String model = in.next();

		System.out.print("Please enter the temperature: ");
		double temp = in.nextDouble();

		if (model.equals("C")) {
			if (temp <= 0) {
				state = "solid";
			} else if (temp >= 100) {
				state = "gaseous";
			} else {
				state = "liquid";
			}
			System.out.printf("It is %s.", state);
		}

		else if (model.equals("F")) {
			if (temp <= 32) {
				state = "solid";
			} else if (temp > 211) {
				state = "gaseous";
			} else {
				state = "liquid";
			}

			System.out.printf("It is %s.", state);

		}

		else {
			System.out.println("Wrong input.");
		}
	}

}
