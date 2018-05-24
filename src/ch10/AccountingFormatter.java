package ch10;

/**
 * P10.11
 * @author qhu
 *
 */
public class AccountingFormatter implements NumberFormatter {

	@Override
	public String format(int n) {
		if (n < 0) {
			return "(" + Math.abs(n) + ")";
		} else {
			return "" + n;
		}
	}

	public static void main(String[] args) {
		AccountingFormatter af = new AccountingFormatter();
		System.out.println(af.format(-1083));
	}
}
