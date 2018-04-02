package BigJavaCh02;

import java.awt.*;

public class RectangleTester02 {

	public static void main(String[] args) {
		Rectangle square1 = new Rectangle(0, 0, 40, 40);
		Rectangle square2 = square1;
		square1.translate(10, 23);
		System.out.println(square1);
		System.out.println(square2);

	}

}
