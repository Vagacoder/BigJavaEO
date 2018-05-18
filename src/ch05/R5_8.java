package ch05;

import java.util.*;

public class R5_8 {
	
	public static void main(String[] args) {
		int x1 = 0, x2 = 0 , y1 = 0, y2 =0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the x1, y1, x2, y2: ");
		if (in.hasNextInt()) {x1 = in.nextInt();
			if (in.hasNextInt()) {y1 = in.nextInt();
				if (in.hasNextInt()) {x2 = in.nextInt();
					if (in.hasNextInt()) {y2 = in.nextInt();}
					else {System.out.println("Wrong input");}}
				else {System.out.println("Wrong input");}}
			else {System.out.println("Wrong input");}}
		else {System.out.println("Wrong input");}
			
		//System.out.printf("%d, %d, %d, %d", x1, y1, x2, y2);
		double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		if (x1 == x2 && y1 == y2) {System.out.println("These 2 points are same.");}
		else if (distance < 5) {System.out.println("They are very close to each other.");}
		
		System.out.printf("The distance between (%d, %d) and (%d, %d) is %.2f", x1, y1, x2, y2, distance);
	}
	
}
