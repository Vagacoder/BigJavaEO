package ch13;

// sc8 and 9

public class SummArraySC8 {

	public static void main(String[] args) {

		double[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(sumArray1(arr1));

	}
	
	// SC8
	public static double sumArray(double[] input) {

		return sumArrayRange(input, 0);
	}

	private static double sumArrayRange(double[] input, int startIndex) {

		if (startIndex == input.length - 1) {
			return input[startIndex];
		} else {
			return input[startIndex] + sumArrayRange(input, startIndex + 1);
		}
	}
	
	
	// SC9
	public static double sumArray1(double[] input) {
		if (input.length == 1) {
			return input[0];
		} else {
			double[] newArray = new double[input.length-1];
			System.arraycopy(input, 1, newArray, 0, input.length-1);
			return input[0] + sumArray1(newArray);
		}
	}
}
