package ch18;

public class PairDemo {
    public static void main(String[] args) {
	String[] names = { "Tom", "Diana", "Harry" };
	Pair<String, Integer> result = firstContaining(names, "a");
	System.out.println(result.getFirst());
	System.out.println("Expected: Diana");
	System.out.println(result.getSecond());
	System.out.println("Expected: 1");
    }

    /**
     * Gets the first String containing a given string, together with its index.
     * 
     * @param strings
     *            an array of strings
     * @param sub
     *            a string
     * @return a pair (strings[i], i) where strings[i] is the first strings[i]
     *         containing str, or a pair (null, -1) if there is no match.
     */
    public static Pair<String, Integer> firstContaining(String[] strings, String sub) {
	Pair<String, Integer> result = new Pair<>();
	for (int i = 0; i < strings.length; i++) {
	    if (strings[i].contains(sub)) {
		result.first = strings[i];
		result.second = i;
		return result;
	    }
	}
	result.first = null;
	result.second = -1;
	return result;
    }
}
