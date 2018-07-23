package others;

import java.util.*;

public class Test15 {

    public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<>();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	System.out.println(a1);

	Object[] b;
	b = a1.toArray();
	System.out.println(b.toString());
	System.out.println(Arrays.toString(b));
	for (Object o : b) {
	    System.out.println(o);
	}

    }

}
