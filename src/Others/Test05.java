package Others;

import java.awt.*;


public class Test05 {

	public static void main(String[] args) {
		Rectangle box = new Rectangle(10,20, 40, 40);
		box.translate(10, 0);
		Rectangle box1 = box;
		
		System.out.println(box);
		System.out.println(box1);

	}

}
