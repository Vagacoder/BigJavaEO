package others;

public class Test14 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
		int index = 5;
		int[] arr2 = new int[arr1.length-1];
		System.arraycopy(arr1, 0, arr2, 0, index-1);
		for (int number : arr2) {
			System.out.println(number);
		}
		System.arraycopy(arr1, index, arr2, index-1, arr1.length-index);
		for (int number : arr2) {
			System.out.println(number);
		}
	}

}
