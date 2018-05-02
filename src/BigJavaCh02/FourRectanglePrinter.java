
package BigJavaCh02;

import java.awt.*;

public class FourRectanglePrinter {

    public static void main(String[] args) {

	Rectangle box = new Rectangle(10, 10, 40, 60);
	System.out.println(box);
	box.translate(40, 0);
	System.out.println(box);
	box.translate(0, 60);
	System.out.println(box);
	box.translate(-40, 0);
	System.out.println(box);

    }

}
