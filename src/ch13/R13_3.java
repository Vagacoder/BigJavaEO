package ch13;

public class R13_3 {

	public static void main(String[] args) {
		int[] arr1 = {53,18,22,10,12,41,8,12,100,95};
		System.out.println(maximum(arr1, 0, arr1.length));


	}
	
	// find the max number of array, (kth smallest is the max of k numbers)
	
	public static int maximum(int[] numbers, int startIndex, int size) {
		if (size <=1) {
			return numbers[startIndex];
		} else {
			int minOfShort = maximum(numbers, startIndex+1, size-1);
			if (numbers[startIndex] < minOfShort) {
				return minOfShort;
			} else {
				return numbers[startIndex];					
			}
		}
	}
	
	
	public static int findKthMin(int[] numbers, int startIndex, int size, int k) {
		
		if (size <= k) {
			return maximum(numbers, startIndex, size);
		} else {
			int maxOfKNumber = maximum(numbers, startIndex, k);
		}
		
		
		
		return 0;
	}

}
