package ch03;

public class MothTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Moth aMoth = new Moth(10);
		aMoth.moveToLight(20);
		aMoth.moveToLight(-30);
		aMoth.moveToLight(60);

		System.out.println(aMoth.getPosition());
		System.out.println("Expected: 26.75");

	}

}
