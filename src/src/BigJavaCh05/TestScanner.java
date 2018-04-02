package BigJavaCh05;

import java.util.*;

public class TestScanner {
	
	public static void main(String[] args) {
		
		String newString = "1 2 3 4 0";
		Scanner in = new Scanner(newString);
		//Scanner in = new Scanner(System.in);
		
		int total = 0;
		int value;
		boolean done = false;
		
		while(!done) {
			value = in.nextInt();
			if (value == 0) {
				done = true;
			} else {
				total = total + value;
			}
		}
		System.out.println(total);

		
	}
	
}
