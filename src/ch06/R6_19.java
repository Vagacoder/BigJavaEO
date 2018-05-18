package ch06;

public class R6_19 {

	public static void main(String[] args) {
		int n = 1;
		double x = 0;
		double s = 1.0 / (1 + n * n);
		while (s > 0.01) {
			n++;
			s = 1.0 / (1 + n * n);
			x = x + s;

		}
		System.out.println(x);
		System.out.println(s);
	}

}
