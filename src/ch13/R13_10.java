package ch13;

public class R13_10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 64; i++) {
			System.out.println(move(i));
			System.out.println(Math.pow(2, i)-1);
			System.out.println();
		}
	}

	public static long move(long n) {
		if (n == 1) {
			return 1;
		} else {
			return 1 + 2 * move(n - 1);
		}
	}
}
