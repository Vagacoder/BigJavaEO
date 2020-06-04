package ch18;

/*
 * SC9 Write a method roots with a Double parameter variable x that returns both 
 * the positive and negative square root of x if x ≥ 0 or null otherwise.

 */
public class Roots {
    
    public static Pair<Double, Double> roots(Double x){
        if(x < 0){
            return null;
        }

        double root = Math.sqrt(x);
        Pair<Double, Double> result = new Pair<>();
        result.first = root;
        result.second = -root;
        return result;
    }

    public static void main(String[] args){
        Pair<Double, Double> root = roots(2.0);
        System.out.printf("%.5f and %.5f", root.getFirst(), root.getSecond());
    }
}