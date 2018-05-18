package others;

import java.awt.Rectangle;

public class Test04 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5, 10, 15, 20);
		double width = new Rectangle(5,10,45,20).getWidth();
		double width2 = r.getWidth();
		System.out.println(width);
		System.out.println(width2);
		
		System.out.println(r);
		r.translate(15, 25);
		System.out.println(r);
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println("Before: " + box.getX());
		box.translate(25, 40);
		System.out.println("After: " + box.getX());

	}

}
