package BigJavaCh07;

public class ArrayTest04 {

	public static void main(String[] args) {
		int[] values = { 10, 24, 3, 64 };
		int position = 0;
		for (int i = 1; i < values.length; i++)
			if (values[i] > values[position])
				position = i;
		System.out.print(position);

	}

}
