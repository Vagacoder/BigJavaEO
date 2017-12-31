package BigJavaCh09;

import java.awt.*;

public class LabeledPoint extends Point {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String label;

	public LabeledPoint(int x, int y, String label) {
		super(x, y);
		this.label = label;

	}

	public String toString() {

		return "X is " + super.getX() + ", Y is " + super.getY() + "; " + label;
		// return super.toString() + " " + label;
	}
}
