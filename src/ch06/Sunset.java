package ch06;

import java.awt.*;

public class Sunset {
	public static void main(String[] args) {
		Picture pic = new Picture();
		pic.load("queen-mary.png");
		for (int x = 0; x < pic.getWidth(); x++) {
			for (int y = 0; y < pic.getHeight(); y++) {
				Color original = pic.getColorAt(x, y);
				Color negative = new Color(Math.min(30 + original.getRed(),255), Math.min(255, 30 + original.getGreen()),
						Math.min(255, 30 + original.getBlue()));
				pic.setColorAt(x, y, negative);
			}
		}
	}
}
