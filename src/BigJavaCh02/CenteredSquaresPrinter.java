package BigJavaCh02;

import java.awt.*;

public class CenteredSquaresPrinter {

    public static void main(String[] args) {
	Rectangle box = new Rectangle(100, 100, 200, 200);
	box.grow(100, 100);
	System.out.println(box);

    }

}
