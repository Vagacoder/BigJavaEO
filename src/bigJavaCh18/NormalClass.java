package bigJavaCh18;

import java.util.*;

public class NormalClass {

    public <T> String getString(T input) {

	String result = input.toString();
	return result;
    }

    public <T> T getInput(T input) {
	return input;
    }

    public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<>(10);
	System.out.println(a);
	fill(a, "*");
	// fill(a, 42);
	System.out.println(a);
	System.out.println();

	String[] b = new String[10];
	fill1(b, 42);
    }

    public static <T> void fill(ArrayList<T> lst, T value) {
	for (int i = 0; i < 10; i++) {
	    lst.add(value);
	}
    }

    public static <T> void fill1(T[] arr, T value) {
	for (int i = 0; i < arr.length; i++) {
	    arr[i] = value;
	}
    }
}
