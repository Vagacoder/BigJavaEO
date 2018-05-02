package BigJavaCh05;

import java.util.*;

public class R5_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a value for x: ");

		if (in.hasNextInt()) {
			double x = in.nextDouble();
			double y;

			if (x >= 0) {
				y = x;
			} else {
				y = -x;
			}

			System.out.printf("y is: %.2f", y);

			in.close();
		} else {
			System.out.println("Wrong input");
		}

	}

}
