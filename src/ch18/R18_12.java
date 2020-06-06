package ch18;

import java.util.ArrayList;

/*
 * R18.12 What happens when you pass an ArrayList<String> to a method with an 
 * ArrayList parameter variable? Try it out and explain.
 * 
 * A: String will replace type parameter.
 * 

*/

public class R18_12{

    public static <T> void printArrayList(ArrayList<T> arr){
        for(T t : arr){
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args){
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Hello");
        a1.add("World");
        a1.add("Welcome");
        printArrayList(a1);
    }
}