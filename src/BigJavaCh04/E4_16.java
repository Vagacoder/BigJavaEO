<<<<<<< HEAD
package BigJavaCh04;

import java.util.Scanner;

public class E4_16 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int number = in.nextInt();
		int first = number % 10;
		number = number /10;
		int second = number %10;
		number = number /10;
		int third = number %10;
		number = number /10;
		int fourth = number %10;
		number = number /10;
		int fifth = number %10;
		
		System.out.print(fifth + " "); 
		System.out.print(fourth + " ");
		System.out.print(third + " ");
		System.out.print(second + " ");
		System.out.print(first);
		
		in.close();
	}

}
=======
package BigJavaCh04;

import java.util.Scanner;

public class E4_16 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int number = in.nextInt();
		int first = number % 10;
		number = number /10;
		int second = number %10;
		number = number /10;
		int third = number %10;
		number = number /10;
		int fourth = number %10;
		number = number /10;
		int fifth = number %10;
		
		System.out.print(fifth + " "); 
		System.out.print(fourth + " ");
		System.out.print(third + " ");
		System.out.print(second + " ");
		System.out.print(first);
		
		in.close();
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
