package BigJavaCh06;

public class E6_1 {

	public static void main(String[] args) {

		double initial = 100000;
		double rate = 0.50;
		int i = 0;
		double amount = initial;

		while (amount < 1_000_000) {
			amount = amount * (1 + rate);
			i++;
		}

		System.out.println(i);
	}
}
