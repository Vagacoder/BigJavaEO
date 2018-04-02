<<<<<<< HEAD
package BigJavaCh04;

import java.util.*;

public class P4_2Easter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter year: ");
		int y = in.nextInt();
		int a = y%19;
		int b = y/100;
		int c = y%100;
		int d = b/4;
		int e = b%4;
		int g = (8*b +13)/25;
		int h = (19*a + b -d -g +15)%30;
		int j = c/4;
		int k = c%4;
		int m = (a+11)*h/319;
		int r = (2*e + 2*j -k -h +m +32 )%7;
		int n = (h - m + r +90) /25;
		int p = (h - m + r + n + 19) %32;
		
		System.out.printf("The Easter Sunday of %d is %d, %d.", y, n, p);
		
		in.close();
	}

}
=======
package BigJavaCh04;

import java.util.*;

public class P4_2Easter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter year: ");
		int y = in.nextInt();
		int a = y%19;
		int b = y/100;
		int c = y%100;
		int d = b/4;
		int e = b%4;
		int g = (8*b +13)/25;
		int h = (19*a + b -d -g +15)%30;
		int j = c/4;
		int k = c%4;
		int m = (a+11)*h/319;
		int r = (2*e + 2*j -k -h +m +32 )%7;
		int n = (h - m + r +90) /25;
		int p = (h - m + r + n + 19) %32;
		
		System.out.printf("The Easter Sunday of %d is %d, %d.", y, n, p);
		
		in.close();
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
