package cs105final;

public class ArrayStats {

	double average;
	double count;
	double max;
	double min;
	double sum;

	public ArrayStats(double[] array) {

		max = array[0];
		min = array[0];
		sum = 0;
		count = array.length;
		average = 0;
		for (double number : array) {
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
			sum += number;
			if (count != 0) {
				average = sum / count;
			}

		}
	}

	public double getAverage() {

		return average;
	}

	public double getCount() {
		return count;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}

	public double getSum() {
		return sum;
	}
}
