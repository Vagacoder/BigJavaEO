package ch15;

import java.util.*;

public class IteratorTester01 {

    // test set() method
    public static void main(String[] args) {

	// test on Linked list
	LinkedList<String> a = new LinkedList<>();
	a.add("Alex");
	a.add("Bob");
	a.add("Charlie");
	a.add("Deck");
	a.add("Eddy");

	ListIterator<String> iter = a.listIterator();

	// iter returns Alex
	System.out.println(iter.next());
	// set() set Alex to Jack
	iter.set("Jack");
	System.out.println(iter.next());
	System.out.println();
	while (iter.hasNext()) {
	    System.out.println(iter.next());
	}

	System.out.println();

	// the first element of list is Jack now
	for (String i : a) {
	    System.out.println(i);
	}

	System.out.println();

	// test on Array list
	ArrayList<String> days = new ArrayList<>();
	days.add("Sun");
	days.add("Mon");
	days.add("Tue");
	days.add("Thu");
	days.add("Fri");
	days.add("Sat");
	ListIterator<String> iterator = days.listIterator();
	while (iterator.hasNext()) {
	    System.out.println(iterator.next());
	}

	// set last returned element, "Sat", to "None"
	iterator.set("None");
	System.out.println("After set : ");

	// the last element is "None" now
	for (String item : days) {
	    System.out.println(item);
	}
    }

}
