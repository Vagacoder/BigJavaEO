package BigJavaCh05;

public class E5_22 {

	public static void main(String[] args) {

		double num1 = 2.0;
		double num2 = 1.989991;

		if (num1 - num2 < 0.01) {
			System.out.println("They are same up to two decimal.");
		} else {
			System.out.println("They are different.");
		}

	}

}
