package ch13;

public class R13_4 {

	public static void main(String[] args) {
		int[] arr1 = {10,31, 4, 5, 22, 8,97,6};
		sortRecursive(arr1, 0, arr1.length);
		for (int number : arr1) {
			System.out.println(number);
		}
	}
	
	// Recursive selection sort
	
	public static int[] sortRecursive(int[] input, int startIndex, int size) {
		
		if (startIndex < input.length) {
		int min = minimum(input, startIndex, size);
		int indexOfMin = findIndex(input, min);
		input[indexOfMin] = input[startIndex];
		input[startIndex] = min;
		sortRecursive(input, startIndex + 1, size-1);}
		return input;
	}

	public static int minimum(int[] numbers, int startIndex, int size) {
		
		if (size <=1) {
			return numbers[startIndex];
		} else {
			int minOfShort = minimum(numbers, startIndex+1, size-1);
			if (numbers[startIndex] > minOfShort) {
				return minOfShort;
			} else {
				return numbers[startIndex];					
			}
		}
	}
	
	// helper to find find index
		public static int findIndex(int[] numbers, int input) {
			int i = 0;
			boolean found = false;
			for (i = 0; i < numbers.length; i++) {
				if (numbers[i] == input) {
					found = true;
					break;
				}
			}
			if (found) {
				return i;
			} else {
				return -1;
			}
		}
}
