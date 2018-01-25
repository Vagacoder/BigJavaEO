package BigJavaCh06;

public class E6_18 {

	public static void main(String[] args) {

		int side = 7;

		for (int i = 1; i <= side; i++) {
			for (int j = 1; j <= side; j++) {
				System.out.print("*");
			}
			System.out.print(" ");
			if (i == 1 || i == side) {
				for (int j = 1; j <= side; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= side; j++) {
					if (j == 1 || j == side) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}

			System.out.println();
		}
	}

}
