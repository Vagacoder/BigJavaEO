package ch05;

/**
 * This program demonstrates comparisons of numbers and strings.
 */
public class Compare {
	public static void main(String[] args) {
		// Integers

		int m = 2;
		int n = 4;

		if (m * m == n) {
			System.out.println("2 times 2 is four.");
		}

		// Floating-point numbers

		double x = Math.sqrt(2);
		double y = 2.0;

		if (x * x == y) {
			System.out.println("sqrt(2) times sqrt(2) is 2");
		} else {
			System.out.printf("sqrt(2) times sqrt(2) is not four but %.18f\n", x * x);
		}

		final double EPSILON = 1E-14;
		if (Math.abs(x * x - y) < EPSILON) {
			System.out.println("sqrt(2) times sqrt(2) is approximately 2");
		}

		// Strings

		String s = "120";
		String t = "20";

		int result = s.compareTo(t);

		String comparison;
		if (result < 0) {
			comparison = "comes before";
		} else if (result > 0) {
			comparison = "comes after";
		} else {
			comparison = "is the same as";
		}

		System.out.printf("The string \"%s\" %s the string \"%s\"\n", s, comparison, t);

		String u = "1" + t;

		System.out.printf("The strings \"%s\" and \"%s\" are ", s, u);
		if (s != u) {
			System.out.print("not ");
		}
		System.out.print("identical. They are ");
		if (!s.equals(u)) {
			System.out.print("not ");
		}
		System.out.println("equal.");
	}
}
