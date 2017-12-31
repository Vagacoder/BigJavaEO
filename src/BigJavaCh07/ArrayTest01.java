package BigJavaCh07;

import java.util.*;

public class ArrayTest01 {

	public static void main(String[] args) {

		int[] list1 = new int[5];
		list1[0] = 1;

		System.out.println(Arrays.toString(list1));

		int[] list2 = new int[] { 1, 0, 0 };

		System.out.println(Arrays.toString(list2));

		list2 = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(list2));

		list2 = Arrays.copyOf(list2, 10);
		System.out.println(Arrays.toString(list2));

		double n1 = 10.0;
		double n2 = 10.1;
		System.out.println(Double.compare(n1, n2));

	}

}
