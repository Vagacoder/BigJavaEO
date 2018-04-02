<<<<<<< HEAD
package BigJavaCh06;

public class E6_19 {

	public static void main(String[] args) {

		int MAX = 4;

		for (int i = 1; i <= MAX; i++) {

			for (int j = 1; j <= MAX * 2 - 1; j++) {
				if (j > MAX - i && j < MAX + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		for (int i = MAX - 1; i >= 1; i--) {

			for (int j = 1; j <= MAX * 2 - 1; j++) {
				if (j > MAX - i && j < MAX + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

}
=======
package BigJavaCh06;

public class E6_19 {

	public static void main(String[] args) {

		int MAX = 4;

		for (int i = 1; i <= MAX; i++) {

			for (int j = 1; j <= MAX * 2 - 1; j++) {
				if (j > MAX - i && j < MAX + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		for (int i = MAX - 1; i >= 1; i--) {

			for (int j = 1; j <= MAX * 2 - 1; j++) {
				if (j > MAX - i && j < MAX + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
