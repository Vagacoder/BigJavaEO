package ch14;

// for R14.24
// sort method in this class will sort an array of n bytes (number from -128 to 127).
// O(n) algorithm

public class ByteSorter {

    public static void sort(int[] a) {

	int[] b = new int[256];
	for (int i : a) {
	    b[i + 128]++;
	}

	int index = 0;
	for (int i = 0; i < 256; i++) {
	    int number = b[i];
	    for (int j = 0; j < number; j++) {
		a[index] = i - 128;
		index++;
	    }
	}
    }

}
