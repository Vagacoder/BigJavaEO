package ch14;

public class E14_13 {

    public static void main(String[] args) {

	int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	int index = search(a, 0, 9, 0);
	System.out.println(index);
	int index0 = search(a, 0, 9, 1);
	System.out.println(index0);
	int index1 = search(a, 0, 9, 2);
	System.out.println(index1);
	int index2 = search(a, 0, 9, 10);
	System.out.println(index2);
	int index3 = search(a, 0, 9, 11);
	System.out.println(index3);
	int[] b = { 1, 2, 4 };
	int index10 = search(b, 0, 2, 4);
	System.out.println(index10);
    }

    /**
     * modified method from BinarySearcher class. This method returns -k - 1, where
     * k is the position before which the element should be inserted.
     * 
     * @param a
     * @param low
     * @param high
     * @param value
     * @return
     */
    public static int search(int[] a, int low, int high, int value) {
	if (low <= high) {
	    int mid = (low + high) / 2;

	    if (a[mid] == value) {
		return mid;
	    } else if (a[mid] < value) {
		return search(a, mid + 1, high, value);
	    } else {
		return search(a, low, mid - 1, value);
	    }
	} else {
	    return -low - 1;
	}
    }
}
