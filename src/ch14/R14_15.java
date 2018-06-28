package ch14;

import java.util.Arrays;

public class R14_15 {

	public static void main(String[] args) {
		
		int[] a = {4, 7, 11, 4, 9, 5, 11, 7, 3, 5};
		System.out.println(Arrays.toString(a));
		int[] result = removeDup(a);
		System.out.println(Arrays.toString(result));

	}
	
	public static int[] removeDup(int[] input) {
		int[] result = new int[input.length];
		System.arraycopy(input, 0, result, 0, input.length);
		int index = 0;
		while (index < result.length) {
			int numberOfIndex = findNumber(result, result[index]);
			if (numberOfIndex > 1) {
				int indexToRemove = findFirstIndex(result, result[index]);
				int[] newArr = new int[result.length];
				System.arraycopy(result, 0, newArr, 0, indexToRemove);
				System.arraycopy(result, indexToRemove+1, newArr, indexToRemove, result.length-indexToRemove -1);
				result = newArr;
			} else {
				index++;
			}
		}
		
		return result;
	}
	
	private static int findFirstIndex(int[] input, int number) {
		int index;
		for (index = 0; index < input.length; index++) {
			if (input[index] == number) {
				break;
			}
		}
		return index;
	}

	public static int findNumber(int[] input, int number) {
		int totalNumber = 0;
		for (int i: input) {
			if (i == number) {
				totalNumber ++;
			}
		}
		return totalNumber;
	}

}
