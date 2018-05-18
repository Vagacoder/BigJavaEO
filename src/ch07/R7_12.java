package ch07;

public class R7_12 {
	
	public static void main(String[] args) {
		
		double[] list = {1.2, 4.2, 8.2, 49.9, 10,6};
		
		for (int i = 0; i < list.length; i++)
		{
			list[i] = 2*list[i];
		}
		

		new PrintList(list).printAllElement();
	}
	
}
