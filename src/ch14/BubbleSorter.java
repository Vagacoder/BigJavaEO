package ch14;

// Bubble Sort

public class BubbleSorter {

    public static void sort(int[] a) {

	boolean done = false;

	while (!done) {
	    done = true;
	    for (int i = 0; i < a.length - 1; i++) {
		if (a[i] > a[i + 1]) {
		    ArrayUtil.swap(a, i, i + 1);
		    done = false;
		}
	    }
	}
    }
}
