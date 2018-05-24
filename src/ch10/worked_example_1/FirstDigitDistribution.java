package ch10.worked_example_1;

public class FirstDigitDistribution {

	private int[] counters;

	/**
	 * Constructs a distribution whose counters are set to zero.
	 */
	public FirstDigitDistribution() {
		counters = new int[10];
	}
	
	public void process(Sequence seq, int valuesToProcess) {
		counters = new int[10];
		for (int i = 1; i <= valuesToProcess; i++) {
			int value = seq.next();
			int power = (int) Math.floor(Math.log10(value));
			int firstDigit = value/((int)(Math.pow(10, power)));
			counters[firstDigit]++;
		}
	}
	
	public void display() {
		for (int i = 0; i < counters.length; i++) {
			System.out.println(i + ": " + counters[i]);
		}
	}
	
	public static void main(String[] args) {
		int value = 0;
		int power = (int) Math.floor(Math.log10(value));
		System.out.println(power);
		System.out.println(Math.pow(10, power));
		System.out.println(Integer.MIN_VALUE);
		int firstDigit = value/((int)(Math.pow(10, power)));
		System.out.println(firstDigit);
	}
}
