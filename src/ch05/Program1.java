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

import java.util.*;

import ch05.*;

public class Program1 {

	public static void main(String[] args) {

		IntegerPairs1 string1 = new IntegerPairs1();

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter four positive integers: ");
		String input = in.next();
		in.close();

		string1.setPairString(input);

		System.out.printf("Test result: %b\n", string1.hasTwoPairs());

	}

}
