package ch14;

/**
 * R14.15 remove duplicates in an integer array the algorithm check the number
 * of ith element in array, if number > 1, remove it. O(n^2)
 * 
 * @author Skuller
 *
 */

public class DupRemover {

    public static int[] removeDup(int[] a) {
	int[] result = a.clone();
	int index = 0;

	while (index < result.length) {
	    int numberAtIndex = a[index];
	    int number = 0;
	    for (int i : result) {
		if (i == numberAtIndex) {
		    number++;
		}
	    }
	    if (number > 1) {
		result = remove(index, result);
	    } else {
		index++;
	    }
	}
	return result;
    }

    public static int[] remove(int index, int[] a) {
	int[] result = new int[a.length - 1];
	System.arraycopy(a, 0, result, 0, index);
	System.arraycopy(a, index + 1, result, index, a.length - index - 1);
	return result;
    }
}
