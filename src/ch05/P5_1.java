package ch05;

import java.util.Scanner;

public class P5_1 {
	
	public static void main(String[] args) {
		
		String horoscope ="";
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your birthday(month and day): ");
		int month = in.nextInt();
		int day = in.nextInt();
		System.out.println(month);
		System.out.println(day);

		if ((month == 3 && day >=21)|| month == 4 && day <=19)
		{
			horoscope = "Aries";
		}
		
		else if (month == 4&& day >=20 || month == 5 && day <=20)
		{
			horoscope = "Taurus";
		}
		else if (month == 5&& day >=21 || month == 6 && day <=20)
		{
			horoscope = "Gemini";
		}
		else if (month == 6&& day >=21 || month == 7 && day <=22)
		{
			horoscope = "Cancer";
		}
		else if (month == 7&& day >=23 || month == 8 && day <=22)
		{
			horoscope = "Leo";
		}
		else if (month == 8&& day >=23 || month == 9 && day <=22)
		{
			horoscope = "Virgo";
		}
		
		
		System.out.println(horoscope);
	}
	
}
