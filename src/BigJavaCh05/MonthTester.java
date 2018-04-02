<<<<<<< HEAD
package BigJavaCh05;

import java.util.*;

public class MonthTester {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a month: ");
		int month = in.nextInt();
		Month new_month = new Month(month);
		int days = new_month.getDays();
		System.out.printf("%d days", days);

	}

}
=======
package BigJavaCh05;

import java.util.*;

public class MonthTester {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a month: ");
		int month = in.nextInt();
		Month new_month = new Month(month);
		int days = new_month.getDays();
		System.out.printf("%d days", days);

	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
