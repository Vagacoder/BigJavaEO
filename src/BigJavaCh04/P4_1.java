<<<<<<< HEAD
package BigJavaCh04;

import java.util.*;

public class P4_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the price of new car: ");
		double carPrice = in.nextDouble();
		System.out.print("Please enter the miles driven per year: ");
		double milePerYear = in.nextDouble();
		System.out.print("Please enter the gas price: ");
		double gasPrice = in.nextDouble();
		System.out.print("Please enter the miles per gallon: ");
		double milePerGallon = in.nextDouble();
		System.out.print("Please enter the price of resalePrice after 5 years: ");
		double resalePrice = in.nextDouble();
		
		P4_1CarCost car1 = new P4_1CarCost(carPrice, milePerYear, gasPrice, milePerGallon
				, resalePrice);

		System.out.printf("The cost of 5 year for this car is: $%.2f.\n", car1.getCost());
		in.close();
	}

}
=======
package BigJavaCh04;

import java.util.*;

public class P4_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the price of new car: ");
		double carPrice = in.nextDouble();
		System.out.print("Please enter the miles driven per year: ");
		double milePerYear = in.nextDouble();
		System.out.print("Please enter the gas price: ");
		double gasPrice = in.nextDouble();
		System.out.print("Please enter the miles per gallon: ");
		double milePerGallon = in.nextDouble();
		System.out.print("Please enter the price of resalePrice after 5 years: ");
		double resalePrice = in.nextDouble();
		
		P4_1CarCost car1 = new P4_1CarCost(carPrice, milePerYear, gasPrice, milePerGallon
				, resalePrice);

		System.out.printf("The cost of 5 year for this car is: $%.2f.\n", car1.getCost());
		in.close();
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
