<<<<<<< HEAD
package BigJavaCh06;

import java.util.Scanner;

public class DataSetTester {
	
	public static void main(String[] args) {
		
		DataSet ds = new DataSet();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number (enter Q for finish): ");
		while (in.hasNextDouble())
		{
			double number = in.nextDouble();
			ds.add(number);	
		}
		System.out.printf("Average is %.2f\n", ds.getAverage());
		System.out.printf("Smallest is %.2f\n", ds.getSmallest());
		System.out.printf("Largest is %.2f\n", ds.getLargest());
		System.out.printf("Range is %.2f\n", ds.getRange());
		
	}
	
}
=======
package BigJavaCh06;

import java.util.Scanner;

public class DataSetTester {
	
	public static void main(String[] args) {
		
		DataSet ds = new DataSet();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number (enter Q for finish): ");
		while (in.hasNextDouble())
		{
			double number = in.nextDouble();
			ds.add(number);	
		}
		System.out.printf("Average is %.2f\n", ds.getAverage());
		System.out.printf("Smallest is %.2f\n", ds.getSmallest());
		System.out.printf("Largest is %.2f\n", ds.getLargest());
		System.out.printf("Range is %.2f\n", ds.getRange());
		
	}
	
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
