package Others;

import java.util.*;

public class R4_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter turn: ");
		int turn = sc.nextInt();
		int direction = 180;
		
		direction = (direction + turn)%360;
		
		System.out.println(direction);
		

	}

}
