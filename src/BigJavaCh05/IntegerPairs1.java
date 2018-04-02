<<<<<<< HEAD
/**
 * CS 105 Theory and Practice I
 * CRN: 38066
 * Assignment: IntegerPairs
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Qirui Hu
 */

package BigJavaCh05;

/**
 * This program will take one string of four positive, single-digit integers,
 * and test to see if there are two pairs present in the string.
 * 
 * @author Qirui Hu
 *
 */

public class IntegerPairs1 {
	
	private String input;
	
	/**
	 * COnstructor.
	 */
	
	public IntegerPairs1() {
		
	}
	
	/**
	 * Set a new string of four positive integers for testing.
	 * 
	 * @param str
	 *            input a string of four positive integers.
	 */
	
	public void setPairString(String str) {
		
		input = str;
		
	}
	
	/**
	 * Check whether the string contains two pairs.
	 * 
	 * @return "true" for there are two pairs of integers, "false" for there is no
	 *         integer pair.
	 * 
	 */
	
	public boolean hasTwoPairs() {
		
		boolean pair = false;
		/**
		 * New constructed object is not two pairs. Since length = 0 will be judged as
		 * two pair below(line 84), exclude potential input whose length = 0 here.
		 */
		if (input == null || input.length() == 0) {
			pair = false;
		} else
		
		{
			String newString = input.replaceAll(" ", ""); // Remove all space in input string.
			String firstDigit = newString.substring(0, 1); // Find the first number in truncated string.
			newString = newString.replaceAll(firstDigit, "");// Remove all number matched with first number, in
																// truncated string.
			
			/**
			 * for truncated string, if length = 1 or 3, there is not chance to be two
			 * paired; if length = 0, all 4 digits are same, and it is two pairs; if length
			 * =2, need a further test whether other 2 digits are paired (if paired, they
			 * should be same).
			 */
			if (newString.length() == 0) {
				pair = true;
			} else if (newString.length() == 2) {
				if (newString.substring(0, 1).equals(newString.substring(1))) {
					pair = true;
				}
			}
		}
		return pair;
	}
}
=======
/**
 * CS 105 Theory and Practice I
 * CRN: 38066
 * Assignment: IntegerPairs
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Qirui Hu
 */

package BigJavaCh05;

/**
 * This program will take one string of four positive, single-digit integers,
 * and test to see if there are two pairs present in the string.
 * 
 * @author Qirui Hu
 *
 */

public class IntegerPairs1 {
	
	private String input;
	
	/**
	 * COnstructor.
	 */
	
	public IntegerPairs1() {
		
	}
	
	/**
	 * Set a new string of four positive integers for testing.
	 * 
	 * @param str
	 *            input a string of four positive integers.
	 */
	
	public void setPairString(String str) {
		
		input = str;
		
	}
	
	/**
	 * Check whether the string contains two pairs.
	 * 
	 * @return "true" for there are two pairs of integers, "false" for there is no
	 *         integer pair.
	 * 
	 */
	
	public boolean hasTwoPairs() {
		
		boolean pair = false;
		/**
		 * New constructed object is not two pairs. Since length = 0 will be judged as
		 * two pair below(line 84), exclude potential input whose length = 0 here.
		 */
		if (input == null || input.length() == 0) {
			pair = false;
		} else
		
		{
			String newString = input.replaceAll(" ", ""); // Remove all space in input string.
			String firstDigit = newString.substring(0, 1); // Find the first number in truncated string.
			newString = newString.replaceAll(firstDigit, "");// Remove all number matched with first number, in
																// truncated string.
			
			/**
			 * for truncated string, if length = 1 or 3, there is not chance to be two
			 * paired; if length = 0, all 4 digits are same, and it is two pairs; if length
			 * =2, need a further test whether other 2 digits are paired (if paired, they
			 * should be same).
			 */
			if (newString.length() == 0) {
				pair = true;
			} else if (newString.length() == 2) {
				if (newString.substring(0, 1).equals(newString.substring(1))) {
					pair = true;
				}
			}
		}
		return pair;
	}
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
