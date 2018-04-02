<<<<<<< HEAD
package BigJavaCh03;

public class Square {

	private int sideLength;
	private int area;

	public Square(int initialLength) {
		sideLength = initialLength;
		
	}

	public int getArea() {
		area = sideLength * sideLength;
		return area;
	}

	public void grow() {
		sideLength = 2 * sideLength;
	}
=======
package BigJavaCh03;

public class Square {

	private int sideLength;
	private int area;

	public Square(int initialLength) {
		sideLength = initialLength;
		
	}

	public int getArea() {
		area = sideLength * sideLength;
		return area;
	}

	public void grow() {
		sideLength = 2 * sideLength;
	}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
}