package BigJavaCh04;

import java.util.*;

public class R4_23 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the diameter: ");
		double diameter = s.nextDouble();
		System.out.print("Please enter the chord: ");
		double chord = s.nextDouble();

		double radius = diameter / 2.0;

		double height = radius - Math.sqrt(radius * radius - chord * chord / 4.0);

		double area = 2.0 / 3.0 * chord * height + Math.pow(height, 3) / 2.0 / chord;

		System.out.printf("The area of piece is %.2f", area);

	}

}
