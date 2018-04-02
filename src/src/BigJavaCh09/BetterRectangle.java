package BigJavaCh09;

import java.awt.*;

public class BetterRectangle extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BetterRectangle(int x, int y, int w, int h) {

		super.setLocation(x, y);
		super.setSize(w, h);

	}

	public double getPerimeter() {

		double perimeter = (width + height) * 2;

		return perimeter;
	}

	public double getArea() {

		double area = width * height;

		return area;
	}
}
