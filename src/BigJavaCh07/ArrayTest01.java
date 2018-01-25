package BigJavaCh07;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest01 {
	
	public static void main(String[] args) {

		ArrayList<int[]> list1 = new ArrayList<>();
		
		int[] row1 = {1,23,4,6};
		int[] row2 = {4,2,64,12};
		
		list1.add(row1);
		list1.add(row2);
		
		System.out.println(Arrays.toString(list1.get(1)));
		
		//
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a2.add(5);
		a2.add(6);
		a2.add(7);
		
		
		
		ArrayList<ArrayList<Integer>> table1 = new ArrayList<>();
		table1.add(a1);
		table1.add(a2);
		
		System.out.println(table1.get(1).toString());
		
		//ArrayList[] list4 = {a1, a2};
		
		
	}
	
}
