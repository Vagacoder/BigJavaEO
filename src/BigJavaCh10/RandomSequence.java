package BigJavaCh10;

public class RandomSequence implements Sequence {
	public int next() {
		return (int) (Integer.MAX_VALUE * Math.random());
	}
}
