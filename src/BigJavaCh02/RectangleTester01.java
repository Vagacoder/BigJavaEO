package BigJavaCh02;

import java.awt.*;

public class RectangleTester01 {

	public static void main(String[] args) {
		Rectangle box1 = new Rectangle(5, 10, 20, 30);
		// Rectangle box2 = new Rectangle(20, 30, 60, 60);
		// box1.add(box2);
		// System.out.println(box1);

		// Rectangle box3 = box1.getBounds();
		// System.out.println(box3);

		box1.add(0, 0);
		System.out.println("expected rectangle is [x= 0, y=0, width = 25, height =40]");
		System.out.println(box1);

	}

}
