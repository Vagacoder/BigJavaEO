package ch10;

/**
 * P10.12
 * @author qhu
 *
 */

public class NumberFormatterTester {

	public static void main(String[] args) {
		
		int[] numbers = {1000, 40435, -59681, 94598, -82910, 243850};
		DecimalSeparatorFormatter dsf = new DecimalSeparatorFormatter();
		BaseFormatter bf = new BaseFormatter(16);
		integerPrinter(bf, numbers);
		

	}
	
	public static void integerPrinter(NumberFormatter nf, int[] numbers) {
		for (int number: numbers) {
			String numberString = nf.format(number);
			System.out.printf("%20s\n", numberString);
		}
	}

}
