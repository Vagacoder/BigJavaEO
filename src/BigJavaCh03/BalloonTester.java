<<<<<<< HEAD
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
=======
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
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
