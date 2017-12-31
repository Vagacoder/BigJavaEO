package BigJavaCh07;

import java.util.*;

public class R7_33 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		ArrayList<Integer> list2 = new ArrayList<>(list1);

		list2.set(2, 0);
		boolean same = true;
		for (int i = 0; i < list1.size(); i++)
			{
				if (list1.get(i) != list2.get(i))
					{
						same = false;
						break;
					}
			}
		System.out.println(same);
	}

}
