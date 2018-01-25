package BigJavaCh06;

public class P6_3 {
	
	public static void main(String[] args) {
		
		int f1 =1;
		int f2 =1;
		int fnew = f1 + f2;
		
		int n = 3;
		
		for (int i = 1; i < n; i++)
		{
			f1 = fnew;
			f2 = f1;
			fnew = f1 + f2;
		}
		System.out.println(fnew);
	}
	
}
