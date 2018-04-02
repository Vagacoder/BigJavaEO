package BigJavaCh04;

import java.util.*;

public class P4_5_Coin {
	
	private double firstCoinValue;
	private double firstCoinNumber;	
	private double secondCoinValue;
	private double secondCoinNumber;
	private double thirdCoinValue;
	private double thirdCoinNumber;
	private double total;
	
	public P4_5_Coin() {
	
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the value each of 1st coin: ");
		firstCoinValue = in.nextDouble();
		System.out.print("Please enter the number of 1st coin: ");
		firstCoinNumber = in.nextDouble();
		
		System.out.print("Please enter the value each of 2nd coin: ");
		secondCoinValue = in.nextDouble();
		System.out.print("Please enter the number of end coin: ");
		secondCoinNumber = in.nextDouble();
		
		System.out.print("Please enter the value each of 1st coin: ");
		thirdCoinValue = in.nextDouble();
		System.out.print("Please enter the number of 1st coin: ");
		thirdCoinNumber = in.nextDouble();
		
		total = firstCoinValue * firstCoinNumber + secondCoinValue * secondCoinNumber + thirdCoinValue * thirdCoinNumber;
		
		in.close();
	}
	
	public double totalAmount() {
			
		return total;
	}
}
