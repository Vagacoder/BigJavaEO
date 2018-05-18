package ch13;

public class E13_14 {

    public static void main(String[] args) {
	// substringGeneratorLoop("rum");

	// ArrayList<String> re = subStringGenerator("rum");
	// for (String str : re) {
	// System.out.println(str);
	// }
	// System.out.println(re.size());

	// subStringGenerator("rum");
	subStringGenerator2("rum", 0, 1);
    }

    public static void substringGeneratorLoop(String input) {

	for (int i = 0; i <= input.length(); i++) {

	    for (int j = i + 1; j <= input.length(); j++) {
		System.out.println(input.substring(i, j));
	    }
	}
    }

    public static String subStringGenerator(String input) {

	// ArrayList<String> results = new ArrayList<String>();
	//
	// if (input.length() == 0) {
	// results.add(input);
	// return results;
	// } else {
	// for (int i = 0; i < input.length(); i++) {
	//
	// String shorter = input.substring(i + 1);
	// ArrayList<String> shorters = subStringGenerator(shorter);
	// shorters.add(shorters.get(shorters.size() - 1) + input.charAt(i));
	// results = shorters;
	// // for (String str : shorters) {
	// // results.add(input.charAt(i) + str);
	// //
	// // }
	// }
	// return results;
	// }

	String result = "";
	for (int i = 0; i < input.length(); i++) {
	    String current = input.substring(i);
	    System.out.println(current);
	    if (current.length() == 0) {
		result = current;
	    } else {
		String shorter = subStringGenerator(current.substring(0, current.length() - 1));
		result = shorter;
	    }
	}

	return result;
    }

    public static void subStringGenerator2(String input, int start, int end) {
	if (start == input.length() && end == input.length()) {
	    // System.out.println("");
	    // return;
	} else if (end == input.length() + 1) {
	    subStringGenerator2(input, start + 1, start + 1);
	} else {
	    System.out.println(input.substring(start, end));
	    subStringGenerator2(input, start, end + 1);
	}
    }
}
