package BigJavaCh04;

public class BoatTester {

	public static void main(String[] args) {
		Boat b = new Boat();
		b.Turn(90);
		b.Move(10);
		b.Turn(-60);
		b.Move(20);
		System.out.println(b.getX());
		System.out.println(b.getY());
		System.out.println(b.getDirection());
	}

}
