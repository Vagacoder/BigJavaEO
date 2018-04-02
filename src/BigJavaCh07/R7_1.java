<<<<<<< HEAD
package BigJavaCh07;

public class R7_1 {
	
	public static void main(String[] args) {
		int[] intList = new int[10];
		intList[0] =17;
		intList[intList.length-1] = 29;
		
		for (int i= 1; i < 9; i++)
		{
			intList[i] = -1;
		}
		
		for (int i = 0; i < intList.length; i++)
		{
			intList[i] ++;
		}
		
		for (int i = 0; i < intList.length; i++)
		{
			System.out.println(intList[i]);
		}
		
		for (int i = 0; i< intList.length; i++)
		{
			System.out.print(intList[i] + ", ");
		}
	}
	
}
=======
package BigJavaCh07;

public class R7_1 {
	
	public static void main(String[] args) {
		int[] intList = new int[10];
		intList[0] =17;
		intList[intList.length-1] = 29;
		
		for (int i= 1; i < 9; i++)
		{
			intList[i] = -1;
		}
		
		for (int i = 0; i < intList.length; i++)
		{
			intList[i] ++;
		}
		
		for (int i = 0; i < intList.length; i++)
		{
			System.out.println(intList[i]);
		}
		
		for (int i = 0; i< intList.length; i++)
		{
			System.out.print(intList[i] + ", ");
		}
	}
	
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
