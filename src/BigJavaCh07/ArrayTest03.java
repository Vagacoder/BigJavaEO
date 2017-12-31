package BigJavaCh07;

import java.util.*;

public class ArrayTest03 {

	public static void main(String[] args) {
		int cnt = 0;
		int[][] numarray = new int[2][3];
		for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 2; j++)
					{
						numarray[j][i] = cnt;
						cnt++;
					}
			}

		System.out.println(Arrays.toString(numarray[0]));
		System.out.println(Arrays.toString(numarray[1]));

	}

}
