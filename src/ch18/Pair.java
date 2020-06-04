package ch18;

/*
 * E18.2 Add a method swap to the Pair class of Exercise E18.1 that swaps the 
 * first and second elements of the pair.
 * 
 */
public class Pair<T, S> {
    T first;
    S second;

    public T getFirst() {
	return first;
    }

    public S getSecond() {
	return second;
    }

	// * E18.2
    public Pair<S, T> swap() {
	Pair<S, T> newPair = new Pair<S, T>();
	newPair.first = second;
	newPair.second = first;
	return newPair;
	}

    public static void main(String[] args) {
	Pair<Integer, String> p = new Pair<>();
	p.first = 123;
	p.second = "abc";

	System.out.println(p.getFirst());
	Pair<String, Integer> newP = p.swap();
	System.out.println(newP.getFirst());
	System.out.println(newP.getSecond());
    }

}
