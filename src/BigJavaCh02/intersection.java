package BigJavaCh02;

import java.awt.*;

public class intersection {

	public static void main(String[] args) {
		Rectangle box1 = new Rectangle(10, 10, 10, 10);
		Rectangle box2 = new Rectangle(30, 30, 70, 50);
		
		Rectangle box3 = box1.intersection(box2);
		System.out.println(box3);
		double box3_x = box3.getWidth();
		double box3_y = box3.getHeight();
		System.out.println(box3_x);
		System.out.println(box3_y);
		// if box3_x or box3_y < 0, two rectangles are not intersected.

	}

}
