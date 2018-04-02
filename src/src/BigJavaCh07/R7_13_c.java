package BigJavaCh07;

public class R7_13_c {

	public static void main(String[] args) {
		int[] values = { 4, 2, 1, 6, 7, 5, 3, 6 };
		int target = 3;
		int total = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == target) {
				System.out.println(i);
			}
		}

		int count = 0;
		for (int i : values) {
			if (i == target) {
				System.out.println(count);
			} else {
				count++;
			}
		}
	}

}
