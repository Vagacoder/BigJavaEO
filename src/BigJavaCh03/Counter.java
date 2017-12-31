package BigJavaCh03;

public class Counter {

	private int value;

	public Counter() {

		value = 0;

	}

	public Counter(int initial) {

		value = initial;

	}

	public int getValue() {

		return value;

	}

	public void click() {

		value = value + 1;

	}

	public void reset() {

		value = 0;

	}

	public void unclick() {

		value = value - 1;

	}

	public void undo() {

		value = Math.max(value - 1, 0);

	}
}
