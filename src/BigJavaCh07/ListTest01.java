package BigJavaCh07;

import java.util.ArrayList;

public class ListTest01 {
	
	public static void main(String[] args) {

		ArrayList<String> dict1 = new ArrayList<String>();
		dict1.add("hello");
		dict1.add("thing");
		dict1.add("crazy");
		dict1.add("goodbye");
		
		ArrayList<String> dict2 = new ArrayList<String>(dict1);
		
		dict1.set(0, "nihao");
		
		String d1 = dict1.get(0);
		d1 += "1234";
		dict1.remove("goodbye");
		dict1.clear();
		System.out.println();
		
		
	}
	
}
