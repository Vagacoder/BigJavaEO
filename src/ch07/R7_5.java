package ch07;

public class R7_5 {
	
	public static void main(String[] args) {
		
		int[] list = new int[10];
		
		for (int i=0; i<list.length; i++)
		{
			if (i%5 == 0) {list[i] = 0;}
			else if (i%5 ==1) {list[i] =1;}
			else if (i%5 ==2) {list[i] =2;}
			else if (i%5 ==3) {list[i] =3;}
			else if (i%5 ==4) {list[i] =4;}
		}
		
		for (int i=0; i<list.length; i++)
		{
			System.out.print(list[i] + "   ");;
		}
	}
}
