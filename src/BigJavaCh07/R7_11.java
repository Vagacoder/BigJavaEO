package BigJavaCh07;

public class R7_11 {
	
	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,5,-6,7,8,9,-10};
		
		int max = list[0];
		int negaCount = 0;
		for (int i : list)
		{
			System.out.print(i + " ");
			if (i > max) {max= i;}
			if (i <0) {negaCount++;}
		}
		
		System.out.println();
		System.out.println(max);
		System.out.println(negaCount);
	}
	
}
