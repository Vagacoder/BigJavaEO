package ch13;

// R13.2 find minimum integer

public class R13_2 {

	public static void main(String[] args) {
		int[] arr1 = {53,18,22,10,12,41,8,12,100,95};
		System.out.println(minimum(arr1, 0, arr1.length));

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

}
