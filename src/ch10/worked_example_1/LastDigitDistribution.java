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
	for (int i = 1; i <= valuesToProcess; i++) {
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
}
