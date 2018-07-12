package ch14;

public class E14_11 {

	public static int findNumberOfHighestFreq(int[] a) {
		
		int mostFreq = 0;
		int highestFreq = -1;
		
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] == a[i]) {
					count++;
				}	
			}
			
			if (count >= highestFreq) {
				highestFreq = count;
				mostFreq = a[i];
			}
		}
		
		return mostFreq;
	}
	
	public static void main(String[] args) {
		int[] a = {2, 1, 5, 7,2, 1, 3, 9, 8,8, 5, 2, 3, 4,2, 2};
		System.out.println(findNumberOfHighestFreq(a));
	}
}
