package BigJavaCh05;

public class R5_27 {
	
	public static void main(String[] args) {
		
		boolean p = true;
		boolean q = true;
		boolean r = false;
		
		System.out.println((p&&q)||!r);
		System.out.println((!(p&&(q||!r))));
	}
	
}
