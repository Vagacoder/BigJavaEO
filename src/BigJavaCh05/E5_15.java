package BigJavaCh05;

import java.util.*;

public class E5_15 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the month: ");
		int month = in.nextInt();
		System.out.print("Please enter the day: ");
		int day = in.nextInt();
		
		Month2Season new_date = new Month2Season(month, day);
		
		String season = new_date.getSeason();
		System.out.printf("Month %s day %s is %s", month, day, season);
		

	}

}
