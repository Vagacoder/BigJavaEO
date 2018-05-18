package ch10.sec4;

import java.awt.*;

/**
 * This program demonstrates the use of a Measurer.
 */
public class MeasurerTester {

	public static void main(String[] args) {

		class PerimeterMeasurer implements Measurer {

			public double measure(Object anObject) {

				Rectangle rec = (Rectangle) anObject;
				double perimeter = (rec.getHeight() + rec.getWidth()) * 2;
				return perimeter;
			}

		}

		Measurer areaMeas = new AreaMeasurer();

		Rectangle[] rects = new Rectangle[] { new Rectangle(5, 10, 20, 30), new Rectangle(10, 20, 30, 40),
				new Rectangle(20, 30, 5, 15) };

		double averageArea = Data.average(rects, areaMeas);
		System.out.println("Average area: " + averageArea);
		System.out.println("Expected: 625");
		Measurer periMeas = new PerimeterMeasurer();
		double averagePerimeter = Data.average(rects, periMeas);
		System.out.println(averagePerimeter);

	}
}
