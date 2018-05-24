package ch10.worked_example_1;

import java.util.ArrayList;

public class MySequence implements Sequence {
	
	private ArrayList<Integer> data = new ArrayList<>();
	private int index = 0;
	
	public void generatData(int dataNumber) {
		for (int i=0; i < dataNumber; i++) {
		int number = (int) (Math.random() * Integer.MAX_VALUE);
		data.add(number);
		}
	}

	@Override
	public int next() {

		return data.get(index++);
	}

	@Override
	public boolean hasNext() {
		if (index < data.size()) {
			return true;
		} else {
		return false;}
	}

}
