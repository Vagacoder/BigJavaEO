/**
 * CS 105 Theory and Practice I
 * CRN: 38066
 * Assignment: WaterState
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Qirui Hu
 */

package ch05;

/**
 * Set up several cases to test the WaterState class.
 * 
 * @author qhu
 *
 */

public class WaterStateTester {
	
	public static void main(String[] args) {
		
		/**
		 * 5 cases of Celsius model for testing.
		 */
		WaterState sample1 = new WaterState("100C");
		System.out.printf("\nFor 100C\nExpected: GAS\nActual: ");
		System.out.println(sample1.getState());
		
		WaterState sample2 = new WaterState("50C");
		System.out.printf("\nFor 50C\nExpected: LIQUID\nActual: ");
		System.out.println(sample2.getState());
		
		WaterState sample3 = new WaterState("0C");
		System.out.printf("\nFor 0C\nExpected: SOLID\nActual: ");
		System.out.println(sample3.getState());
		
		WaterState sample4 = new WaterState("110C");
		System.out.printf("\nFor 110C\nExpected: GAS\nActual: ");
		System.out.println(sample4.getState());
		
		WaterState sample5 = new WaterState("-10C");
		System.out.printf("\nFor -10C\nExpected: SOLID\nActual: ");
		System.out.println(sample5.getState());
		
		/**
		 * 5 cases of Fahrenheit model for testing
		 */
		
		WaterState sample6 = new WaterState("212F");
		System.out.printf("\nFor 212F\nExpected: GAS\nActual: ");
		System.out.println(sample6.getState());
		
		WaterState sample7 = new WaterState("32F");
		System.out.printf("\nFor 32F\nExpected: SOLID\nActual: ");
		System.out.println(sample7.getState());
		
		WaterState sample8 = new WaterState("52F");
		System.out.printf("\nFor 52F\nExpected: LIQUID\nActual: ");
		System.out.println(sample8.getState());
		
		WaterState sample9 = new WaterState("250F");
		System.out.printf("\nFor 250F\nExpected: GAS\nActual: ");
		System.out.println(sample9.getState());
		
		WaterState sample10 = new WaterState("10F");
		System.out.printf("\nFor 10F\nExpected: SOLID\nActual: ");
		System.out.println(sample10.getState());
	}
	
}
