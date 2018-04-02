<<<<<<< HEAD
package BigJavaCh06;

public class E6_12 {
	
	public static void main(String[] args) {
		String word = "rum";
		int len = word.length();
		
		for (int i =0; i <len ; i++)
		{
			for (int j = 0; j < len-i; j++)
			{
				String output = word.substring(j, j+1+i);
				System.out.println(output);
			}
		}
		
	}
	
}
=======
package BigJavaCh06;

public class E6_12 {
	
	public static void main(String[] args) {
		String word = "rum";
		int len = word.length();
		
		for (int i =0; i <len ; i++)
		{
			for (int j = 0; j < len-i; j++)
			{
				String output = word.substring(j, j+1+i);
				System.out.println(output);
			}
		}
		
	}
	
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
