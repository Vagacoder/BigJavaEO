package BigJavaCh05;

import java.util.*;

public class TestScanner1 {
	
	public static void main(String[] args) {
		
		String s1 = "1 2 3 4 5";
		Scanner in = new Scanner(s1);
		
		int i1 = in.nextInt();
		int i2 = in.nextInt();
		int i3 = in.nextInt();
		int i4 = in.nextInt();
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		
	}
	
}
