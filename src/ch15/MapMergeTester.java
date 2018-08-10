package ch15;

import java.util.*;

public class MapMergeTester {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 20);
		map.put(2, 22);
		map.put(3, null);
		System.out.println(map); // {1=1, 2=2, 3=null}

		map.merge(1, 10, (x, y) -> x + y);
		// key 1 is present, so new value 10 will be added to previous value 1
		System.out.println(map); // {1=11, 2=2, 3=null}

		map.merge(2, 10, (x, y) -> x < y ? x : y);
		// Previous value for key=2 is less than new value. So, the old value
		// remains as per the BiFunction
		System.out.println(map); // {1=11, 2=2, 3=null}

		map.merge(3, 10, (x, y) -> x * y);
		// The old value for key=3 is null . But its not null * 3, the value 10
		// will be added for the key
		System.out.println(map); // {1=11, 2=2, 3=10}

		map.merge(4, 10, (x, y) -> x / y);
		// key=4 is not in map. So, BiFunction not evaluated, the element is
		// added to map
		System.out.println(map); // {1=11, 2=2, 3=10, 4=10}

		map.merge(1, 10, (x, y) -> null);
		// Since the BiFunction results in null, the element will be removed
		// from map
		System.out.println(map); // {2=2, 3=10, 4=10}
	}

}
