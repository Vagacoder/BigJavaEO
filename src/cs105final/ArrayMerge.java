package cs105final;

public class ArrayMerge {

	double[] mergedArray;
	ArrayStats stats;

	public void arrayMerger(double[] array1, double[] array2) {

		int len1 = array1.length;
		int len2 = array2.length;
		int newLen = Math.max(len1, len2);
		mergedArray = new double[newLen];

		for (int i = 0; i < newLen; i++) {
			if (i < len1 && i < len2) {
				if (Double.compare(array1[i], array2[i]) <= 0) {
					mergedArray[i] = array1[i];
				} else {
					mergedArray[i] = array2[i];
				}
			} else if (i >= len1) {
				mergedArray[i] = array2[i];
			} else {
				mergedArray[i] = array1[i];
			}
		}

		stats = new ArrayStats(mergedArray);
	}

	public double[] getMergedArray() {

		return mergedArray;
	}

	public ArrayStats getStatistics() {
		return stats;
	}
}
