package BigJavaCh10.sec4;

import java.awt.*;

/**
 * Objects of this class measure rectangles by area.
 */
public class AreaMeasurer implements Measurer {
	public double measure(Object anObject) {
		Rectangle aRectangle = (Rectangle) anObject;
		double area = aRectangle.getWidth() * aRectangle.getHeight();
		return area;
	}
}
