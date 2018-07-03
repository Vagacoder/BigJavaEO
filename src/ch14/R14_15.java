package ch14;

import java.util.Arrays;
import java.util.Collections;

public class R14_15 {

	public static void main(String[] args) {

		// int[] a = {8, 11, 11,3, 21, 54,4, 7, 4,11, 12, 13,22, 99};
		int[] a = ArrayUtil.randomIntArray(100, 30);
		System.out.println(Arrays.toString(a));
		int[] result = removeDup(a);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));

	}

	/**
	 * This method iterate an integer array, if current number has multiple copies, then remove it
	 * @param input
	 * @return
	 */
	public static int[] removeDup(int[] input) {
		int[] result = new int[input.length];
		System.arraycopy(input, 0, result, 0, input.length);
		int index = 0;
		
		while (index < result.length) {
			int numberOfIndex = findNumber(result, result[index]);
			
			if (numberOfIndex > 1) {
				int[] newArr = new int[result.length - 1];
				System.arraycopy(result, 0, newArr, 0, index);
				System.arraycopy(result, index + 1, newArr, index, result.length - index - 1);
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
		for (int i : input) {
			if (i == number) {
				totalNumber++;
			}
		}
		return totalNumber;
	}

}
