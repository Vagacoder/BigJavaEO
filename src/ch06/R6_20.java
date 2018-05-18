package ch06;

public class R6_20 {

	public static void main(String[] args) {
		int s = 1;
		int n = 1;
		do {
			s = s + n;
			n++;
		} while (s < 10 * n);

		System.out.println(s);
		System.out.println(n);
	}

}
