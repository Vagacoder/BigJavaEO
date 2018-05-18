package ch07;

public class R7_6 {
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
		
		int total = 0;
		for (int i = 0; i < 10; i++) { total = a[i] - total; }
		
		System.out.print(total);
	}
	
}
