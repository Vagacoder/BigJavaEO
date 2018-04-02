<<<<<<< HEAD
package BigJavaCh13;

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
=======
package BigJavaCh13;

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
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
