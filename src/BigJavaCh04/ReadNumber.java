package BigJavaCh04;

import java.util.*;

public class ReadNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer between 1,000 and 99,999: ");
		String number = in.next();
		//String new_number = number.replace(",",	"");
		//System.out.println(new_number);
		
		int length = number.length();
		String new1= number.substring(0, length-4);
		String new2= number.substring(length-3, length);
		System.out.println(new1 + new2);
		
		in.close();
	}

}
