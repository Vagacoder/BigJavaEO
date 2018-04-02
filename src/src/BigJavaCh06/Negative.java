package BigJavaCh06;

import java.awt.*;

public class Negative {
	public static void main(String[] args) {
		Picture pic = new Picture();
		pic.load("queen-mary.png");
		for (int x = 0; x < pic.getWidth(); x++) {
			for (int y = 0; y < pic.getHeight(); y++) {
				Color original = pic.getColorAt(x, y);
				Color negative = new Color(255 - original.getRed(), 255 - original.getGreen(),
						255 - original.getBlue());
				pic.setColorAt(x, y, negative);
			}
		}
	}
}
