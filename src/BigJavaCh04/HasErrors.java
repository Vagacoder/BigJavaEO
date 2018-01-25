package BigJavaCh04;

import java.util.*;

public class HasErrors {
	public static void main(String[] args)
	{
	int x = 0;
	int y = 0;
	Scanner in = new Scanner(System.in);
	System.out.print("Please enter an integer:");
	x = in.nextInt();
	System.out.print("Please enter another integer: ");
	y = in.nextInt();
	System.out.println("The sum is " + x + y);
	
	in.close();
	}

}
