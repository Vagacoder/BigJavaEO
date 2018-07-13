package ch14;

import java.util.*;

public class R14_21 {

    public static void main(String[] args) {
	int[] a = ArrayUtil.randomIntArray(20, 100);
	System.out.println(Arrays.toString(a));

	BubbleSorter.sort(a);

	System.out.println(Arrays.toString(a));

    }

}
