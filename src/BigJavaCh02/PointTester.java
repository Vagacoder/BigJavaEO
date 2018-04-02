package BigJavaCh02;

import java.awt.*;
import java.awt.geom.*;

public class PointTester {

	public static void main(String[] args) {
		Point a = new Point(3, 4);
		Point b = new Point(-3, -4);
		double a_x = a.getX();
		double a_y = a.getY();
		double b_x = b.getX();
		double b_y = b.getY();
		double distance = Point2D.distance(a_x, a_y, b_x, b_y);
		System.out.println(distance);
		System.out.println("Expected result is:");
		System.out.println("10");

		double distance1 = a.distance(b);
		System.out.println(distance1);
	}

}
