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

package ch05;

/**
 * This program will take one string of four positive, single-digit integers,
 * and test to see if there are two pairs present in the string.
 * 
 * @author Qirui Hu
 *
 */

import java.util.*;

public class IntegerPairs {
	
	private int firstDigit;
	private int secondDigit;
	private int thirdDigit;
	private int forthDigit;
	
	/**
	 * COnstructor.
	 */
	
	public IntegerPairs() {
		
	}
	
	
	public void setPairString(String str) {
		
		String temp = str;
		Scanner in = new Scanner(temp);
		
		firstDigit = in.nextInt();
		secondDigit = in.nextInt();
		thirdDigit = in.nextInt();
		forthDigit = in.nextInt();
						
		in.close();
	}
	
	/**
	 * Check whether the string contains two pairs.
	 * 
	 * @return "true" for there are two pairs of integers, "false" for there is no
	 *         integer pair.
	 * 
	 */
	
	public boolean hasTwoPairs() {
		
		boolean paired = false;
		
		if (firstDigit == secondDigit && thirdDigit == forthDigit) {paired = true;}
		else if (firstDigit == thirdDigit && secondDigit == forthDigit) {paired = true;}
		else if (firstDigit == forthDigit && secondDigit == thirdDigit) {paired = true;}
		
		return paired;
	}
}
