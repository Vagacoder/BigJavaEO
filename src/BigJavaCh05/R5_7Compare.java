<<<<<<< HEAD
package BigJavaCh05;

public class R5_7Compare {

	public static void main(String[] args) {

		int n = 11;

		if (n == 10) {
			System.out.printf("n equals %d.\n", 10);
		} else {
			System.out.printf("n does not equeal %d.\n", 10);
		}

		double x = 11.0;

		final double EPSLON = 1E-14;

		if (Math.abs(x - 10) < EPSLON) {
			System.out.println("x equals to 10.0.");
		} else {
			System.out.println("x does not equal to 10.0.");
		}
	}

}
=======
package BigJavaCh05;

public class R5_7Compare {

	public static void main(String[] args) {

		int n = 11;

		if (n == 10) {
			System.out.printf("n equals %d.\n", 10);
		} else {
			System.out.printf("n does not equeal %d.\n", 10);
		}

		double x = 11.0;

		final double EPSLON = 1E-14;

		if (Math.abs(x - 10) < EPSLON) {
			System.out.println("x equals to 10.0.");
		} else {
			System.out.println("x does not equal to 10.0.");
		}
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
