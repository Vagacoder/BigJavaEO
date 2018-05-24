package ch10.worked_example_1;

/**
 * This class analyzes the distribution of the last digit of values from a
 * sequence.
 */
public class LastDigitDistribution {
	private int[] counters;

	/**
	 * Constructs a distribution whose counters are set to zero.
	 */
	public LastDigitDistribution() {
		counters = new int[10];
	}

	/**
	 * Processes values from this sequence.
	 * 
	 * @param seq
	 *            the sequence from which to obtain the values
	 * @param valuesToProcess
	 *            the number of values to process
	 */
	public void process(Sequence seq, int valuesToProcess) {
		counters = new int[10];
		for (int i = 1; i <= valuesToProcess; i++) {
			int value = seq.next();
			int lastDigit = value % 10;
			counters[lastDigit]++;
		}
	}
	
	/**
	 * Overloaded for P10.3
	 * @param seq
	 * @param valuesToProcess
	 */
	public void process(Sequence seq) {
		counters = new int[10];
		while(seq.hasNext()) {
			int value = seq.next();
			int lastDigit = value % 10;
			counters[lastDigit]++;
		}
	}


	/**
	 * Displays the counter values of this distribution.
	 */
	public void display() {
		for (int i = 0; i < counters.length; i++) {
			System.out.println(i + ": " + counters[i]);
		}
	}
	
	/**
	 * Modified method for P10.1, print * (max40)
	 */
	public void display1() {

		int max = counters[0];
		
		for (int i = 1; i < counters.length; i++) {
			if (counters[i] > max) {
				max = counters[i];
			}
		}
		
		double numberPerStar = max/40.0;
		for (int i = 0; i < counters.length; i++) {
			System.out.print(i + ": ");
			int starNumber = (int) (counters[i]/numberPerStar);
			for (int j = 0; j < starNumber; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
