package ch13;

import java.util.*;

public class E13_15 {

    public static void main(String[] args) {

	for (String str : subSetGenerator("rum")) {
	    System.out.println(str);
	}
	System.out.println(subSetGenerator("rum").size());
    }

    public static HashSet<String> subSetGenerator(String input) {
	HashSet<String> results = new HashSet<>();

	if (input.length() == 0) {
	    results.add(input);
	} else {
	    for (int i = 0; i < input.length(); i++) {
		HashSet<String> shorter = subSetGenerator(input.substring(i + 1));
		for (String str : shorter) {
		    results.add(input.charAt(i) + str);
		    results.add(str);
		}
	    }
	}
	return results;
    }
}
