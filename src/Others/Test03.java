package Others;

import java.awt.Rectangle;

public class Test03 {
	
	public static void main(String[] args) {
		String hello = "Hello, world!";
		String hello_large = hello.toUpperCase();
		String hello2 = hello.replace("H", "h");
		String hello3 = hello.replace(",", "");
		
		System.out.println(hello_large);
		System.out.println(hello2);
		System.out.println(hello3);
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println(box);
		Rectangle box2 = new Rectangle (25, 10, 20,30);
			
		Rectangle box1 = new Rectangle(90, 90, 20, 20);
		
		//PrintStream out = new PrintStream("output.txt");
		
		Rectangle box3 = new Rectangle(10, 20, 40,40);
		box3 = new Rectangle(20, 20, 40, 40);
		System.out.println(box3);
		
		
	}

}
