
package ch13;

public class Square {

	private int width;

	public Square(int width) {
		this.width = width;
	}

	public int getArea() {

		if (width <= 0) {
			return 0;
		} else {
			Square smaller = new Square(width - 1);
			return smaller.getArea() + width * 2 - 1;
		}

	}

}
