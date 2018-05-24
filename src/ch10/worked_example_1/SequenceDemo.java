package ch10.worked_example_1;

/**
 * Modified, call display1() for P10.1
 * @author qhu
 *
 */

public class SequenceDemo {
    public static void main(String[] args) {
	LastDigitDistribution dist1 = new LastDigitDistribution();
	FirstDigitDistribution fdist1 = new  FirstDigitDistribution();
	dist1.process(new SquareSequence(), 1000);
	dist1.display();
	System.out.println();
	fdist1.process(new SquareSequence(), 1000);
	fdist1.display();
	//dist1.display1();
	System.out.println();

	//LastDigitDistribution dist2 = new LastDigitDistribution();
	dist1.process(new RandomSequence(), 1000);
	dist1.display();
	//dist2.display1();
	System.out.println();
	
	// display all primes <1000 ===============
//	PrimeSequence primes = new PrimeSequence();
//	for (int i = 0; i < 1000; i++) {
//		System.out.println(primes.next());
//	}
	
	//LastDigitDistribution dist3 = new LastDigitDistribution();
//	dist1.process(new PrimeSequence(), 1000);
//	dist1.display();
	
	MySequence mySeq = new MySequence();
	mySeq.generatData(1000);
	while (mySeq.hasNext()) {
		System.out.println(mySeq.next());
	}
	
	mySeq = new MySequence();
	mySeq.generatData(1000);
	dist1.process(mySeq);
	dist1.display();
    }
}
