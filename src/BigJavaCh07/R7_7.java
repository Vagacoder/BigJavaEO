package BigJavaCh07;

public class R7_7 {
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
		
		for (int i = 1; i < 5; i++) { a[i] = a[9 - i]; }
		
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + ", ");;
		}
	}
	
}
