package ch15;

import java.util.*;

public class E15_1 {

    public static void main(String[] args) {
	LinkedList<String> names = new LinkedList<>();
	names.add("Alex");
	names.add("Bob");
	names.add("Charlie");
	names.add("Deck");
	names.add("Eddy");
	names.add("Finny");
	names.add("Greg");
	names.add("Harry");
	names.add("Iris");
	names.add("Jack");
	names.add("Kate");
	names.add("Larry");
	downsize(names, 3);
	System.out.println(names);

    }

    public static void downsize(LinkedList<String> employeeNames, int n) {
	int count = 1;
	ListIterator<String> it = employeeNames.listIterator();
	while (it.hasNext()) {
	    it.next();
	    if (count % n == 0) {
		it.remove();
	    }
	    count++;
	}
    }

}
