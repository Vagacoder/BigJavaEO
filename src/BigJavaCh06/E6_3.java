<<<<<<< HEAD
package BigJavaCh06;

import java.util.ArrayList;
import java.util.Scanner;

public class E6_3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int smallest=0 ;
		int largest=0;
		int sum = 0;

		boolean duplicate = false;
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		
		
		System.out.print("Please enter integers (Q for finish): ");
		int number = in.nextInt();
		smallest = number;
		largest = number;
		int previous = number -1;
		sum += number;
		sums.add(sum);
		
		System.out.print("Please enter integers (Q for finish): ");
		while (in.hasNextInt())
		{
		
		number = in.nextInt();

		
		if (number < smallest) {smallest = number;}
		if (number > largest) {largest = number;}
			sum += number;
			sums.add(sum);
		
		
		if (previous == number && duplicate == false)
		{
			duplicate = true;
			duplicates.add(previous);
		}
		else if (previous != number) 
		{duplicate = false;}
		
		previous = number;
		System.out.print("Please enter integers (Q for finish): ");
		}
		
		
		System.out.printf("The smallest is %d.\n", smallest);
		System.out.printf("The largest is %d.\n", largest);
		System.out.printf("The sum is %d.\n", sum);
		
		for (int digit : sums)
		{
			System.out.print(digit + " ");
		}
		System.out.println();
		for (int digit : duplicates)
		{
			System.out.print(digit + " ");
		}
		in.close();
	}
	
}
=======
package BigJavaCh06;

import java.util.ArrayList;
import java.util.Scanner;

public class E6_3 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int smallest=0 ;
		int largest=0;
		int sum = 0;

		boolean duplicate = false;
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		
		
		System.out.print("Please enter integers (Q for finish): ");
		int number = in.nextInt();
		smallest = number;
		largest = number;
		int previous = number -1;
		sum += number;
		sums.add(sum);
		
		System.out.print("Please enter integers (Q for finish): ");
		while (in.hasNextInt())
		{
		
		number = in.nextInt();

		
		if (number < smallest) {smallest = number;}
		if (number > largest) {largest = number;}
			sum += number;
			sums.add(sum);
		
		
		if (previous == number && duplicate == false)
		{
			duplicate = true;
			duplicates.add(previous);
		}
		else if (previous != number) 
		{duplicate = false;}
		
		previous = number;
		System.out.print("Please enter integers (Q for finish): ");
		}
		
		
		System.out.printf("The smallest is %d.\n", smallest);
		System.out.printf("The largest is %d.\n", largest);
		System.out.printf("The sum is %d.\n", sum);
		
		for (int digit : sums)
		{
			System.out.print(digit + " ");
		}
		System.out.println();
		for (int digit : duplicates)
		{
			System.out.print(digit + " ");
		}
		in.close();
	}
	
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
