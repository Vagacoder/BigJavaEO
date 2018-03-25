package BigJavaCh13;

public class SummArraySC8 {

    public static void main(String[] args) {

	double[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	System.out.println(sumArray(arr1));

    }

    public static double sumArray(double[] input) {

	return sumArrayRange(input, 0);
    }

    private static double sumArrayRange(double[] input, int index) {

	if (index == input.length - 1) {
	    return input[index];
	} else {
	    return input[index] + sumArrayRange(input, index + 1);
	}
    }
}
