package BigJavaCh05;

import java.util.*;

public class R5_5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a value for x: ");
		double x = in.nextDouble();
		double y;

		if (x > 0) {
			y = x;
		} else {
			y = 0;
		}

		System.out.printf("y is: %.1f", y);

		in.close();
	}

}
