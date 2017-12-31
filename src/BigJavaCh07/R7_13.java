package BigJavaCh07;

public class R7_13 {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, 4 };
		int total = 0;
		boolean first = true;
		for (int i : values) {
			if (first) {
				first = false;
			} else {
				total = total + i;
			}

		}

		System.out.println(total);
	}

}
