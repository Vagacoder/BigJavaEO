package ch18;

/*
 * E18.3 Implement a static generic method PairUtil.swap whose argument is a Pair 
 * object, using the generic class declared in Section 18.2. The method should 
 * return a new pair, with the first and second element swapped.
 *
 */ 
public class PairUtil{
    	
	public static <T, S> Pair<S, T> swap(Pair<T, S> pair){
        Pair<S, T> newPair = new Pair<>();
        newPair.first = pair.getSecond();
        newPair.second = pair.getFirst();
        return newPair;
    }
    
    public static void main(String[] args){
        Pair<String, Integer> p1 = new Pair<>();
        p1.first = "Hello";
        p1.second = 123;
        Pair<Integer, String> p2 = PairUtil.swap(p1);
        System.out.println(p2.getFirst() + " : " + p2.getSecond());
    }
}