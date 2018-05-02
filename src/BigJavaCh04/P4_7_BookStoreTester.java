package BigJavaCh04;

import java.util.*;

public class P4_7_BookStoreTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the total price of books: ");
		double price = in.nextDouble();
		System.out.print("Please enter the number of boos: ");
		int number = in.nextInt();
		in.close();
		
		P4_7_BookStore newOrder = new P4_7_BookStore(price, number);
		newOrder.printOrder();
		
	}

}
