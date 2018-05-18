
package ch13;

public class RectangleArea {

	public static void main(String[] args) {
		System.out.println(getRectangleArea(4, 3));
	}

	public static int getRectangleArea(int width, int hight) {

		if (width <= 0) {
			return 0;
		} else {
			return hight + getRectangleArea(width - 1, hight);
		}
	}
}
