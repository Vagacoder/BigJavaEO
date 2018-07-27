package ch14;

// P14.5 
// Instead of partitioning as 2 parts: <= and >=
// partitioning as 3 parts: < , == and >
// suggested to partitioning first as 4 parts: ==, <, > and ==; 
// then move 2 parts of == into the middle. (I did not do this :) )

public class QuickSorter2 {

    public static void sort(int[] a) {
	sort(a, 0, a.length - 1);
    }

    public static void sort(int[] a, int from, int to) {
	if (from >= to) {
	    return;
	}
	int p = partition(a, from, to);
	sort(a, from, p);
	sort(a, p + 1, to);
    }

    // modified partition method

    private static int partition(int[] a, int from, int to) {
	// simply choose first element as pivot.
	int pivot = a[from];

	// p is the cursor for the index of first pivot
	// (there may be multiple pivots in array)
	int p = from;

	// i is the cursor which is scanning whole array
	int i = from + 1;
	while (i <= to) {

	    // if element, pointed by i, is smaller than pivot
	    if (a[i] < pivot) {

		// copy element, pointed by i, to temp var.
		int temp = a[i];

		// j is the cursor, which is scanning from i backward to p,
		// and keep moving elements to next index. Then copy element, pointed by
		// i, to p. After done these, p += 1, i +=;
		int j = i - 1;
		while (j >= p && j >= 0) {
		    a[j + 1] = a[j];
		    j--;
		}
		j++;
		a[j] = temp;
		p++;
		i++;

		// if element, pointed by i, equals to pivot
	    } else if (a[i] == pivot) {

		// j is the cursor, which is scanning from i backward to p,
		// and keep moving elements (some may be larger than pivot) to next index.
		// After done these, element, pointed by i, is moved to p (SSSPPLLP ->
		// SSSPPPLL),
		// and i += 1, p dose not change.
		int j = i - 1;
		while (j >= p && j >= 0) {
		    a[j + 1] = a[j];
		    j--;
		}
		i++;
	    }

	    // if element, pointed by i, is larger than pivot
	    // only move i to next position.
	    else {
		i++;
	    }
	}
	return p;
    }
}
