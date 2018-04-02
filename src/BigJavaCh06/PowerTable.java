<<<<<<< HEAD
package BigJavaCh06;

/**
 * This program prints a table of powers of x.
 */
public class PowerTable {
	public static void main(String[] args) {
		final int NMAX = 4;
		final double XMAX = 10;

		// Print table header

		for (int n = 1; n <= NMAX; n++) {
			System.out.printf("%10d", n);
		}
		System.out.println();
		for (int n = 1; n <= NMAX; n++) {
			System.out.printf("%10s", "X ");
		}
		System.out.println();

		// Print table body

		for (double x = 1; x <= XMAX; x++) {
			// Print table row

			for (int n = 1; n <= NMAX; n++) {
				System.out.printf("%10.0f", Math.pow(x, n));
			}
			System.out.println();
		}
	}
}
=======
package BigJavaCh06;

/**
 * This program prints a table of powers of x.
 */
public class PowerTable {
	public static void main(String[] args) {
		final int NMAX = 4;
		final double XMAX = 10;

		// Print table header

		for (int n = 1; n <= NMAX; n++) {
			System.out.printf("%10d", n);
		}
		System.out.println();
		for (int n = 1; n <= NMAX; n++) {
			System.out.printf("%10s", "X ");
		}
		System.out.println();

		// Print table body

		for (double x = 1; x <= XMAX; x++) {
			// Print table row

			for (int n = 1; n <= NMAX; n++) {
				System.out.printf("%10.0f", Math.pow(x, n));
			}
			System.out.println();
		}
	}
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
