package ch06;

public class E6_11 {
	
	public static void main(String[] args) {
		
		String input = "Happy New Year!";
		String checkList = "AEIOUYaeiouy";
		int count = 0;
		for (int i = 0; i < input.length(); i ++)
		{
			if (checkList.contains("" + input.charAt(i))) 
			{
				count ++;
			}
		}
		System.out.println(count);
	}
	
}
