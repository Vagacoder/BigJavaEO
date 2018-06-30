package ch14;

/**
 * R14.16 This class is based on MergeSorter.java. To remove the duplicates in
 * an integer array
 */
public class DupRemover1 {

    /**
     * 
     * @param a
     */
    public static int[] removeDup(int[] a) {
	if (a.length <= 1) {
	    return a;
	}
	int[] first = new int[a.length / 2];
	int[] second = new int[a.length - first.length];
	// Copy the first half of a into first, the second half into second
	for (int i = 0; i < first.length; i++) {
	    first[i] = a[i];
	}
	for (int i = 0; i < second.length; i++) {
	    second[i] = a[first.length + i];
	}
	int[] a1 = removeDup(first);
	int[] a2 = removeDup(second);
	return merge(a1, a2);

    }

    private static int[] merge(int[] first, int[] second) {
	int iFirst = 0;
	int iSecond = 0;

	int[] result = new int[first.length + second.length];
	int j = 0;

	while (iFirst < first.length && iSecond < second.length) {
	    if (first[iFirst] == second[iSecond]) {
		iFirst++;
		int[] newOne = new int[result.length - 1];
		System.arraycopy(result, 0, newOne, 0, newOne.length - 1);
		result = newOne;
	    } else if (first[iFirst] < second[iSecond]) {
		result[j] = first[iFirst];
		iFirst++;
		j++;
	    } else {
		result[j] = second[iSecond];
		iSecond++;
		j++;
	    }
	}

	while (iFirst < first.length) {
	    result[j] = first[iFirst];
	    iFirst++;
	    j++;
	}
	while (iSecond < second.length) {
	    result[j] = second[iSecond];
	    iSecond++;
	    j++;
	}

	return result;
    }

}
