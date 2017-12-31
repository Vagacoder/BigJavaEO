package BigJavaCh09;

import java.awt.*;

public class BetterRectangle1 extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3812583895072013554L;

	public BetterRectangle1(int x, int y, int w, int h) {

		super();
		this.setBounds(x, y, w, h);
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
