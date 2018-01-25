package BigJavaCh07;

import java.util.Arrays;

public class ArrayTest02 {
	
	public static void main(String[] args) {
		int[] list1 = {1,5,8,10};
		System.out.println(Arrays.toString(list1));
		int[] list2 = Arrays.copyOf(list1, 15);
		System.out.println(Arrays.toString(list2));
		
	}
	
}
