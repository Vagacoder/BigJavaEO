package ch10;

/**
 * P10.11
 * @author qhu
 *
 */
public class DefaultFormatter implements NumberFormatter {

	@Override
	public String format(int n) {
		return ""+ n;
	}

}
