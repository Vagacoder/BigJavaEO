package BigJavaCh03;

public class BalloonTester {

	public static void main(String[] args) {
	
		Balloon newb = new Balloon(10);
		
		System.out.println(newb.getVolumn());
		System.out.println("Expected: " + Math.PI*10*10*10);
		
		newb.inflat(10);
		System.out.println(newb.getVolumn());
		System.out.println("Expected: " + Math.PI*20*20*20);
		

	}

}
