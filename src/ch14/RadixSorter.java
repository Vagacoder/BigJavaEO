package ch14;

import java.util.*;

public class RadixSorter {

    public static void sort(int[] a) {

	// find max decimal number
	int maxDigits = 0;

	for (int i : a) {
	    int digits = (int) Math.floor(Math.log10(i));
	    if (digits > maxDigits) {
		maxDigits = digits;
	    }
	}
	maxDigits++;

	// set up 10 auxiliary int[]
	ArrayList<Integer> a0 = new ArrayList<>();
	ArrayList<Integer> a1 = new ArrayList<>();
	ArrayList<Integer> a2 = new ArrayList<>();
	ArrayList<Integer> a3 = new ArrayList<>();
	ArrayList<Integer> a4 = new ArrayList<>();
	ArrayList<Integer> a5 = new ArrayList<>();
	ArrayList<Integer> a6 = new ArrayList<>();
	ArrayList<Integer> a7 = new ArrayList<>();
	ArrayList<Integer> a8 = new ArrayList<>();
	ArrayList<Integer> a9 = new ArrayList<>();

	//
	for (int i = 0; i < maxDigits; i++) {

	    // add elements in a into aux arrays
	    for (int j : a) {
		if (j / (int) (Math.pow(10, i)) % 10 == 0) {
		    a0.add(j);
		} else if (j / (int) (Math.pow(10, i)) % 10 == 1) {
		    a1.add(j);
		} else if (j / (int) (Math.pow(10, i)) % 10 == 2) {
		    a2.add(j);
		} else if (j / (int) (Math.pow(10, i)) % 10 == 3) {
		    a3.add(j);
		} else if (j / (int) (Math.pow(10, i)) % 10 == 4) {
		    a4.add(j);
		} else if (j / (int) (Math.pow(10, i)) % 10 == 5) {
		    a5.add(j);
		} else if (j / (int) (Math.pow(10, i)) % 10 == 6) {
		    a6.add(j);
		} else if (j / (int) (Math.pow(10, i)) % 10 == 7) {
		    a7.add(j);
		} else if (j / (int) (Math.pow(10, i)) % 10 == 8) {
		    a8.add(j);
		} else {
		    a9.add(j);
		}
	    }

	    int index = 0;
	    for (int j : a0) {
		a[index] = j;
		index++;
	    }
	    for (int j : a1) {
		a[index] = j;
		index++;
	    }
	    for (int j : a2) {
		a[index] = j;
		index++;
	    }
	    for (int j : a3) {
		a[index] = j;
		index++;
	    }
	    for (int j : a4) {
		a[index] = j;
		index++;
	    }
	    for (int j : a5) {
		a[index] = j;
		index++;
	    }
	    for (int j : a6) {
		a[index] = j;
		index++;
	    }
	    for (int j : a7) {
		a[index] = j;
		index++;
	    }
	    for (int j : a8) {
		a[index] = j;
		index++;
	    }
	    for (int j : a9) {
		a[index] = j;
		index++;
	    }

	    a0.clear();
	    a1.clear();
	    a2.clear();
	    a3.clear();
	    a4.clear();
	    a5.clear();
	    a6.clear();
	    a7.clear();
	    a8.clear();
	    a9.clear();
	}

    }

}
