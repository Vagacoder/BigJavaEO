
package ch02;

import java.awt.*;

public class GrowSquarePrinter {

    public static void main(String[] args) {

	Rectangle box = new Rectangle(100, 100, 50, 50);
	box.grow(25, 25);
	System.out.println(box);
	box.translate(25, 25);
	System.out.println(box);

    }

}
