package BigJavaCh05;

import java.util.*;

public class payCheckTester {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the hours you have worked: ");
		double time = in.nextDouble();

		payCheck newCheck = new payCheck(time);

		newCheck.printCheck();
		in.close();

	}

}
