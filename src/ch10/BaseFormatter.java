package ch10;

/**
 * P10.11
 * 
 * @author qhu
 *
 */
public class BaseFormatter implements NumberFormatter {

	private int base;

	public BaseFormatter(int base) {
		this.base = base;
	}

	@Override
	public String format(int n) {
		int number;
		String sign;
		if (n < 0) {
			number = -n;
			sign = "-";
		} else {
			number = n;
			sign = "";
		}

		StringBuilder result = new StringBuilder();
		while (number > 0) {
			int a = number % base;
			if (a > 9) {
				a = a - 9 + 64;
				char b = (char) a;
				// result.append(b);
				result.insert(0, b);
			} else {
				result.append(a);
			}
			number = number / base;
		}
		return sign + result.reverse().toString();
	}

	public static void main(String[] args) {
		BaseFormatter bf = new BaseFormatter(32);
		System.out.println(bf.format(106));
	}
}
