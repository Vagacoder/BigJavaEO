package BigJavaCh03;

public class SquareTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square box1 = new Square(5);
		
		System.out.println(box1.getArea());
		
		box1.grow();
		
		System.out.println(box1.getArea());
		
	}

}
