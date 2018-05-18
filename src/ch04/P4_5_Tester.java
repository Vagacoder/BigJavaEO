package ch04;

import java.util.*;

public class P4_5_Tester {

	public static void main(String[] args) {
		
		P4_5_CashRegister register = new P4_5_CashRegister();
		
		Scanner in = new Scanner(System.in); 
		
		System.out.print("Please enter your payment: ");
		register.recordPurchase(in.nextDouble());
		register.receivePayment();
		System.out.printf("Your change is $%.2f.\n", register.giveChange());
		
		in.close();
	}

}
