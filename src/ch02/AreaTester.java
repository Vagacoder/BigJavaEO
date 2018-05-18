package ch02;

import java.awt.*;

public class AreaTester {

	public static void main(String[] args) {

		Rectangle box1 = new Rectangle(10, 20, 40, 60);
		double width = box1.getWidth();
		double height = box1.getHeight();

		double area = width * height;
		System.out.println(area);

	}

}
