package BigJavaCh07;

import java.util.Random;

public class E7_1 {
	
	public static void main(String[] args) {
		
		int[] list = new int[10];
		
		for (int i =0; i <10; i++)
		{
			int number = new Random().nextInt(10) +1;
			list[i]= number;
		}
		
		int len = list.length;
		
		for (int i =0; i <10; i++)
		{
			System.out.print(list[i] + ", ");
		}
		
		System.out.println();
		
		for (int i = 0; i< len; i++)
		{
			if (i%2 == 0) {System.out.print(list[i] + " ");}
		}
		
		System.out.println();
		
		for (int i = 0; i< len; i++)
		{
			if (list[i]%2 == 0) {System.out.print(list[i] + " ");}
		}
		
		System.out.println();
		
		for (int i = len-1; i >=0; i--)
		{
			System.out.print(list[i] + ", ");
		}
		
		System.out.println();
		System.out.print(list[0]+" " + list[len-1]);
	}
	
}
