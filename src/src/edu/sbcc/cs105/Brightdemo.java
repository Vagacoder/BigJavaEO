package edu.sbcc.cs105;

import java.awt.*;

public class Brightdemo {

	public static void main(String[] args) {

		// Rectangle box1 = new Rectangle(5, 10, 20, 30);
		Color item1 = new Color(50, 100, 150);
		System.out.println(item1);
		// item1.brighter();
		System.out.println(item1.brighter());
		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println(box);
		box.setSize(30, 40);
		System.out.println(box);

		Rectangle box1 = new Rectangle(5, 10, 30, 40);
		box.setLocation(40, 50);
		box1.translate(40, 50);
		System.out.println(box);
		System.out.println(box1);

	}

}
