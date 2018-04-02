package BigJavaCh07;

import java.util.*;

public class ArrayTest05 {

	public static void main(String[] args) {

		int[][] grades = { { 1, 80, 75, 89 }, { 2, 90, 92, 97 }, { 3, 76, 65, 45 } };

		System.out.println(Arrays.toString(grades[0]));
		System.out.println(Arrays.toString(grades[1]));
		System.out.println(Arrays.toString(grades[2]));

		// grades[0] = new int[] { 1, 88, 99, 77, 66 };
		grades[0] = new int[6];
		System.out.println(grades[0].length);
		System.out.println(grades[1].length);
		System.out.println(Arrays.toString(grades[0]));
		System.out.println(Arrays.toString(grades[1]));
		System.out.println(Arrays.toString(grades[2]));

	}

}
