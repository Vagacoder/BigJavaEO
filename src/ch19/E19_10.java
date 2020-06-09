package ch19;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * E19.10  Write a method 
 * 
 *    public static Optional<Integer> smallestProperDivisor(int n)
 * 
 * that returns the smallest proper divisor of n or, if n is a prime number, a 
 * value indicating that no result is present.

 */
public class E19_10 {
    
    public static Optional<Integer> smallestProperDivisor(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i <=n/2; i++){
            list.add(i);
        }

        return list.stream().filter(i -> n%i == 0).findFirst();
    }

    public static void main(String[] args){
        Optional<Integer> result = smallestProperDivisor(31);
        if(result.isPresent()){
            System.out.println(result.get());
        }else{
            System.out.println("It is a prime number");
        }
    }
}