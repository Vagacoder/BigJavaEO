package others;

import java.text.DecimalFormat;

public class StringTest01 {

	public static void main(String[] args) {
		String pattern ="###.#";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);

		String format = decimalFormat.format(123456789.0);
		System.out.println(format);

	}

}
