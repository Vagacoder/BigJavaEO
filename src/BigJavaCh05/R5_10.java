package BigJavaCh05;

import java.util.*;

public class R5_10 {
	
	public static void main(String[] args) {

		String color = "";
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter x axis(in small letter): ");
		String x = in.next();
		System.out.print("Please enter y axis(in number): ");
		int y = in.nextInt();

		if (x.equals("a") || x.equals("c") || x.equals("e") || x.equals("g")) 
		{if (y %2 == 0) {color = "white";}
		else if (y%2 == 1) {color = "black";}
		}
		else if (x.equals("b") || x.equals("d") || x.equals("f") || x.equals("h"))
		{if (y%2 == 0) {color = "black";}
		else if (y%2 == 1 ) {color = "white";}
				}
		
		System.out.printf("The gird %s%d is %s", x, y, color);
	}

}
