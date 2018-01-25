package BigJavaCh07;

import java.awt.List;
import java.util.Arrays;
import java.util.Random;

public class E7_7 {
	
	public static void main(String[] args) {

		int[] candidate = {1,2,3,4,5,6,7,8,9,10};
		int[] list = new int[10];
		int currentSize = 10;
		for (int i = 0; i <10; i++)
		{
			int index = new Random().nextInt(currentSize);
			list[i] = candidate[index];
			candidate[index] = candidate[currentSize-1];
			currentSize --;
		}
		
		System.out.println(Arrays.toString(list));
		
	}
	
}
