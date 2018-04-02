<<<<<<< HEAD
package BigJavaCh11;

import java.io.*;
import java.util.*;

public class E11_1 {

	public static void main(String[] args) throws FileNotFoundException {

		File hello = new File("hello.txt");

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter message: ");
		String message = input.nextLine();

		PrintWriter out = new PrintWriter(hello);
		out.println(message);
		out.close();

		input.close();

		Scanner in = new Scanner(hello);
		System.out.println(in.nextLine());
		in.close();
	}

}
=======
package BigJavaCh11;

import java.io.*;
import java.util.*;

public class E11_1 {

	public static void main(String[] args) throws FileNotFoundException {

		File hello = new File("hello.txt");

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter message: ");
		String message = input.nextLine();

		PrintWriter out = new PrintWriter(hello);
		out.println(message);
		out.close();

		input.close();

		Scanner in = new Scanner(hello);
		System.out.println(in.nextLine());
		in.close();
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
