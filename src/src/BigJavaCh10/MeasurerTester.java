package BigJavaCh10;

import java.awt.*;

/**
 * This program demonstrates the use of a Measurer.
 */
public class MeasurerTester {
	public static void main(String[] args) {
		Measurer areaMeas = new AreaMeasurer();

		Rectangle[] rects = new Rectangle[] { new Rectangle(5, 10, 20, 30), new Rectangle(10, 20, 30, 40),
				new Rectangle(20, 30, 5, 15) };

		double averageArea = Data.average(rects, areaMeas);
		System.out.println("Average area: " + averageArea);
		System.out.println("Expected: 625");

		Rectangle rec1 = new Rectangle(5, 10, 20, 30);
		Rectangle rec2 = new Rectangle(20, 30, 5, 15);
		Rectangle rec = (Rectangle) Data.max(rec1, rec2, areaMeas);
		System.out.println(rec.getWidth());
		System.out.println(rec.getHeight());
	}
}
