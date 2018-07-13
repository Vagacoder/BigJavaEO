package ch14;

import java.util.*;

public class E14_16 {

    public static void main(String[] args) {
	Person p1 = new Person("Abe", 12, 12345);
	Person p2 = new Person("Bob", 6, 49122);
	Person p3 = new Person("Charlie", 8, 3189);
	Person p4 = new Person("Deck", 15, 90114);
	Person p5 = new Person("Eddy", 4, 439123);
	Person[] plist = { p1, p2, p3, p4, p5 };
	for (Person p : plist) {
	    System.out.println(p.getName());
	}
	System.out.println();
	Arrays.sort(plist);
	for (Person p : plist) {
	    System.out.println(p.getName());
	}
    }

}
