package ch10.sec4;

import java.awt.*;

public class PerimeterMeasurer1 implements Measurer {

	public double measure(Object anObject) {

		Rectangle rec = (Rectangle) anObject;
		double perimeter = (rec.getHeight() + rec.getWidth()) * 2;
		return perimeter;
	}

}
