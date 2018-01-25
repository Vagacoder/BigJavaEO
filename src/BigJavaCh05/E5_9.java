package BigJavaCh05;

import java.util.Scanner;

public class E5_9 {
	
	public static void main(String[] args) {
		
		final double BASICANGLE = 22.5;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the degree: ");
		double degree = in.nextDouble();
		String direction = "";
		
		if ((degree <= BASICANGLE*1 && degree>= 0)||(degree <= 360 && degree >= BASICANGLE*15))
		{direction = "N";}
		else if (degree > BASICANGLE*1 && degree < BASICANGLE *3) {direction = "NE";}
		else if (degree >= BASICANGLE*3 && degree <= BASICANGLE*5) {direction = "E";}
		else if (degree > BASICANGLE*5 && degree < BASICANGLE*7) {direction = "SE";}
		else if (degree >= BASICANGLE*7 && degree <= BASICANGLE*9) {direction = "S";}
		else if (degree > BASICANGLE *9 && degree < BASICANGLE*11) {direction = "SW";}
		else if (degree >= BASICANGLE*11 && degree <= BASICANGLE*13) {direction = "W";}
		else if (degree > BASICANGLE*13 && degree < BASICANGLE*15) {direction = "NW";}
		
		System.out.printf("The direction is %s", direction);
				
	}
	
}
