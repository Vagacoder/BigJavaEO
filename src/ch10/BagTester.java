package ch10;

public class BagTester {

	public static void main(String[] args) {

		Bag newBag = new Bag();
		newBag.add("pen");
		newBag.add("pen");
		newBag.add("pen");
		newBag.add("pen");
		newBag.add("pencil");
		System.out.println(newBag.count("pen"));
		System.out.println(newBag.count("pencil"));

	}

}
