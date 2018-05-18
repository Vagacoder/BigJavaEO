package ch07;

import java.util.Random;

public class R7_8 {
	
	public static void main(String[] args) {
		
		int[] list = new int[10];
		
		for (int i =0; i <10; i++)
		{
			int number = new Random().nextInt(10) +1;
			list[i]= number;
		}
		
		for (int i =0; i <10; i++)
		{
			System.out.print(list[i] + ", ");
		}
	}
	
}
