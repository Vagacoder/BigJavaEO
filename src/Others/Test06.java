package Others;

import java.awt.*;

public class Test06 {

	public static void main(String[] args) {
		
		Rectangle box1 = new Rectangle(5, 5, 6, 7);
	    Rectangle box2 = new Rectangle(10, 10, 10, 11);
	    
	    double width_box1 = box1.getWidth();
	    double height_box1 = box1.getHeight();
	    double width_box2 = box2.getWidth();
	    double height_box2 = box2.getHeight();
	    
	    System.out.println("The width of box1 is: ");
	    System.out.println(width_box1);
	    System.out.println("The height of box1 is: ");
	    System.out.println(height_box1);
	    System.out.println("The width of box2 is: ");
	    System.out.println(width_box2);
	    System.out.println("The height of bxo2 is: ");
	    System.out.println(height_box2);
	    
	    Rectangle box3 = new Rectangle(5, 10, 20, 30);
	    box3.add(0,0);
	    System.out.println(box3);

	}

}
