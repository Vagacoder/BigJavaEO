package ch07;

import java.util.Random;

public class R7_8_1 {
	
	public static void main(String[] args) {
		
		int[] list = new int[10];
		
		int len = list.length;
		int i =0;
		while (i<len)
		{
			
			int number = new Random().nextInt(10) +1;
			boolean same = false;
			
			for (int j =0; j<=i; j++)
			{
				if (list[j] == number)
				{
					same = true;
				}
			}
			
			if (!same)
			{
				list[i] = number;
				i++;
			}
		}
		
		for (int index =0; index <10; index++)
		{
			System.out.print(list[index] + ", ");
		}
	}
	
}
