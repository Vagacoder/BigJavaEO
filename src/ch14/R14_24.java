package ch14;

import java.util.*;

public class R14_24 {

    public static void main(String[] args) {

	Random generator = new Random();
	int[] a = new int[20];
	for (int i = 0; i < a.length; i++) {
	    a[i] = generator.nextInt(256) - 128;
	}

	System.out.println(Arrays.toString(a));

	ByteSorter.sort(a);

	System.out.println(Arrays.toString(a));

    }

}
