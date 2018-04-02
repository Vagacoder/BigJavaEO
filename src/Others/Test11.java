package Others;

public class Test11 {
	
	public static void main(String[] args) {
		double x = 0;
		double s = 1;
		for (int k = 1; s > 0.01; k++) 
		{
		   s = 1.0 / (k * k);
		   x = x + s;  
		}
		System.out.println(x);
		
	}
	
}
