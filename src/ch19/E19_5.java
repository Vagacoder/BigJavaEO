package ch19;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * E19.5  Write a method 
 *      public static <T> String toString(Stream<T> stream, int n) 
 * that turns a Stream<T> into a comma-separated list of its first n elements.

 */
public class E19_5 {
    
    public static <T> String toString(Stream<T> stream, int n){
        return stream.limit(n).map(e -> e.toString()).collect(Collectors.joining(","));
    }

    public static void main(String[] args){
        Stream<Double> doubles = Stream.of(3.0d, 1.5d, 4.0d, 10.2d, 9.0d);
        System.out.println(E19_5.toString(doubles, 4));
    }
}