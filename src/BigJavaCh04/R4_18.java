package BigJavaCh04;

public class R4_18 {

	public static void main(String[] args) {
		int a = 2734;
		
		double decimal = Math.floor(Math.log10(a));
		System.out.println(decimal);
		int first = a/((int) (Math.pow(10, decimal)));
		System.out.println(first);
		

	}

}
