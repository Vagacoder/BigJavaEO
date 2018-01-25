package BigJavaCh07;

public class PrintList {
	
	private double[] list;
	
	public PrintList(double[] list) {
		this.list = list;
	}
	
	public void printAllElement() {
		for (int i = 0; i< list.length; i++)
		{
			System.out.print(list[i]+" ");
		}
	}
}
