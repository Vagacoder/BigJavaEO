package BigJavaCh03;

public class BugTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bug smallBug = new Bug(10);
		smallBug.move();
		smallBug.turn();
		smallBug.move();
		smallBug.turn();
		smallBug.move();
		smallBug.move();
		smallBug.move();

		System.out.println(smallBug.getPosition());
		System.out.println("Expected: 13");
	}

}
