package BigJavaCh04;

import java.util.*;

public class CircleAndSphere {

	public static void main(String[] args) {

		Scanner rRead = new Scanner(System.in);
		System.out.print("Please enter the radius: ");
		double radius = rRead.nextDouble();

		double circum = Math.PI * 2.0 * radius;
		double area = Math.PI * radius * radius;

		double surface = Math.PI * 4.0 * radius * radius;
		double volumn = 4.0 / 3.0 * Math.PI * radius * radius * radius;

		System.out.printf("For a circle, the circumference is %.2f amd the area is %.2f.\n", circum, area);
		System.out.printf("For a sphere, the surafce area is %.2f amd the volumn is %.2f.\n", surface, volumn);

	}

}
