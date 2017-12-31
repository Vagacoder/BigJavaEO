package BigJavaCh07;

public class ArrayTest02 {

	public static void main(String[] args) {
		String[] arr = { "aaa", "bbb", "ccc" };
		mystery(arr);
		System.out.println(arr[0] + " " + arr.length);
	}

	public static void mystery(String[] arr) {
		arr = new String[5];
		arr[0] = "ddd";

	}

}
