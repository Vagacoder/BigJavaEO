package BigJavaCh03;

public class Bug {

	private int position;
	private int step = 1;

	public Bug(int initialPosition) {

		position = initialPosition;

	}

	public void turn() {

		this.step = -this.step;
	}

	public void move() {

		position = position + step;
	}

	public int getPosition() {

		return position;
	}

}
