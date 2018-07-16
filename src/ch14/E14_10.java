package ch14;

import java.util.*;

public class E14_10 {

    public static void main(String[] args) {
	int[] a = ArrayUtil.randomIntArray(20000, 100);
	System.out.println(Arrays.toString(a));
	StopWatch sw1 = new StopWatch();
	sw1.start();
	BubbleSorter.sort(a);
	sw1.stop();
	System.out.println(Arrays.toString(a));
	System.out.printf("Bubble sort takes %d milli seconds", sw1.getElapsedTime());

    }

}
