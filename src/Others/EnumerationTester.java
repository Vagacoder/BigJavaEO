package Others;

import java.util.Scanner;

public class EnumerationTester {
	
	enum Weekday{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}
	
	public static void main(String[] args) {
		Weekday day;
//		System.out.println("" + day);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a day of the week: ");
		String value = scanner.nextLine().toUpperCase();
		day = Weekday.valueOf(value);
		System.out.println("You specified: " + day.toString());
//		String dayString = day.toString();
//		if(dayString.equals(value)) {
//			System.out.println("SUCCESS!");
//		} else {
//			System.out.println("NOT " + day);
//		}
//		System.out.println("dayString length is " + dayString.length());
//		System.out.println("value length is " + value.length());
		scanner.close();
	}
	
}
