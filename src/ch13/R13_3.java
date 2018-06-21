package ch13;

public class R13_3 {

	public static void main(String[] args) {
		int[] arr1 = { 53, 18, 22, 10, 12, 41, 8, 12, 100, 95 };
		// int[] arr1 = { 18, 22, 31, 41, 99, 86};
		System.out.println(maximum(arr1, 0, arr1.length));
		System.out.println(findKthMin(arr1, 0, arr1.length, 3));

	}

	// find the max number of array, (kth smallest is the max of k numbers)

	public static int maximum(int[] numbers, int startIndex, int size) {
		if (size <= 1) {
			return numbers[startIndex];
		} else {
			int minOfShort = maximum(numbers, startIndex + 1, size - 1);
			if (numbers[startIndex] < minOfShort) {
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

	public static int findKthMin(int[] numbers, int startIndex, int size, int k) {

		if (size <= k) {
			return maximum(numbers, startIndex, size);
		} else {
			int maxOfArray = maximum(numbers, startIndex, size);
			int indexOfMax = findIndex(numbers, maxOfArray);
			int[] newArray = new int[size - 1];
			System.arraycopy(numbers, 0, newArray, 0, indexOfMax);
			System.arraycopy(numbers, indexOfMax + 1, newArray, indexOfMax, size - indexOfMax - 1);
			return findKthMin(newArray, startIndex, size - 1, k);
		}

	}

}
