package ch10.worked_example_1;

public class RandomSequence implements Sequence {
    public int next() {
	return (int) (Integer.MAX_VALUE * Math.random());
    }
}
