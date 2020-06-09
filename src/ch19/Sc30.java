package ch19;

import java.util.Optional;

/*
 * SC 30  Write a method reciprocal that receives a parameter x of type double and returns
an Optional<Double> containing 1 / x if x is not zero.

 */
public class Sc30 {

    public static Optional<Double> reciprocal(double x){
        if(x != 0){
            return Optional.of(1/x);
        }else{
            return Optional.empty();
        }
    }

    public static void main(String[] args){
        System.out.println(reciprocal(0.0d).orElse(Double.POSITIVE_INFINITY));
    }

}
