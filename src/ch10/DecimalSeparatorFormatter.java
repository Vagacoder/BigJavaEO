package ch10;

/**
 * P10.11
 * @author qhu
 *
 */
public class DecimalSeparatorFormatter implements NumberFormatter {

	@Override
	public String format(int n) {
		String sign = "";
		int input;
		if (n<0) {
			input = -n; sign = "-";
		} else {input =n;}
		int count =1;
		String number = ""+input;
		StringBuilder result = new StringBuilder();
		for (int i = number.length()-1; i>= 0; i--) {
			result.append(number.charAt(i));
			if (count%3 == 0 && i != 0) {
				result.append(",");
			}
			count++;
		}
		return sign + result.reverse().toString();
	}
	
	public static void main(String[] args) {
		DecimalSeparatorFormatter dsf = new DecimalSeparatorFormatter();
		System.out.println(dsf.format(-105860590));
		
//		int n = -900;
//		String str = "" + n;
//		StringBuilder result = new StringBuilder(str); 
//		System.out.println(result.toString());
	}
}
