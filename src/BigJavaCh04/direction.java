<<<<<<< HEAD
package BigJavaCh04;

import java.util.*;

public class direction {

	public static void main(String[] args) {
		
		int direction = 100;
		Scanner in = new Scanner(System.in);
		System.out.print("please enter the degree for turning: ");
		int turn = in.nextInt();
		
		System.out.println(direction);
		direction = ((direction + turn)%360 + 360)%360;
		System.out.println(direction);
		in.close();
	}

}
=======
package BigJavaCh04;

import java.util.*;

public class direction {

	public static void main(String[] args) {
		
		int direction = 100;
		Scanner in = new Scanner(System.in);
		System.out.print("please enter the degree for turning: ");
		int turn = in.nextInt();
		
		System.out.println(direction);
		direction = ((direction + turn)%360 + 360)%360;
		System.out.println(direction);
		in.close();
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
