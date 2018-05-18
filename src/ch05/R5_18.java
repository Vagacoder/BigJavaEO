package ch05;

import java.util.*;

public class R5_18 {
	
	public static void main(String[] args) {
		
		int month=0, day=0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the month: ");
		if (in.hasNextInt()) {month = in.nextInt();}
		else {System.out.println("Wrong input.");}
		
		System.out.println("Please enter the day: ");
		if (in.hasNextInt()) {day = in.nextInt();}
		else {System.out.println("Wrong input.");}
		
		if (month == 1 && day == 1) {System.out.println("New Year's Day");}
		else if (month == 7 && day == 4) {System.out.println("Independence Day");}
		else if (month == 11 && day == 11) {System.out.println("Veterans Day");}
		else if (month == 12 && day == 25) {System.out.println("Christmas Day");}
		else {System.out.println("It is not a holiday.");}
	}

}
