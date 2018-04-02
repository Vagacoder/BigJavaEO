<<<<<<< HEAD
package BigJavaCh13;

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
=======
package BigJavaCh13;

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
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
