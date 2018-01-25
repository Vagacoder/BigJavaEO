package BigJavaCh06;

public class E6_4 {
	
	public static void main(String[] args) {
		
		String s1 = "We are students of Computer Science.";
		
		/**for (int i = 0; i< s1.length(); i++)
		{
			char chart = s1.charAt(i);
			if (Character.isUpperCase(chart))
			{
				System.out.print(chart +" ");
			}
		}*/
		
		/**
		for (int i = 0; i< s1.length(); i++)
		{
			char chart = s1.charAt(i);
			if (i%2 == 0)
			{
				System.out.print(chart);
			}
		}
		*/
		
		
		String s2 = "";
		String vowels = "AEIOUYaeiouy";
		int vowelsNumber = 0;
		
		for (int i = 0; i< s1.length(); i++)
		{
			char chart = s1.charAt(i);
			if (vowels.indexOf(chart) >=0)
			{
				s2 += "_";
				vowelsNumber ++;
				System.out.println(i);
			}
			else
			{
				s2 +=chart;
			}
		}
		
		System.out.println(s2);
		System.out.println(vowelsNumber);
		
	}
	
}
