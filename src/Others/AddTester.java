package Others;

import java.awt.Rectangle;

public class AddTester {

	public static void main(String[] args) {
		
	    Rectangle box1 = new Rectangle(5, 10, 20, 30);
	    double offset_x = box1.getX();
	    double offset_y = box1.getY();
	    double width = box1.getWidth();
	    double height = box1.getHeight();
	    
	    double add_x = 0.0;
	    double add_y = 0.0;
	    
	    System.out.println("Expected result is: ");
	    System.out.println(add_x);
	    System.out.println(add_y);
	    System.out.println(width + (offset_x-add_x));
	    System.out.println(height + (offset_y-add_y));
	    	    
	    box1.add(add_x,add_y);
	    System.out.println("add(0,0) gives: "); 
	    System.out.println(box1);

	}

}
