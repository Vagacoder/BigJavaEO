package ch06;

public class R6_30 {

	public static void main(String[] args) {

		int height = 3;
		int width = 4;
		int total = height * width;
		for (int i = 1; i <= total; i++) {
			if (i % width == 0) {
				System.out.print("*\n");
			} else {
				System.out.print("*");
			}
		}

	}

}
