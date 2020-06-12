package ch19;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * E19.11 Write a program that reads an integer n and then prints all squares of 
 * the integers from 1 to n that are palindromes (that is, their decimal 
 * representation equals its reverse). Use IntStream.range, map, and filter.

 */

public class E19_11 {
    
    public static boolean isPalindrome(String a){
        if(a.length() <=1){
            return true;
        }

        if(a.charAt(0) == a.charAt(a.length()-1)){
            return isPalindrome(a.substring(1, a.length()-1));
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner keyIn = new Scanner(System.in);
        int n = keyIn.nextInt();
        keyIn.close();

        int[] result = IntStream.range(1, n).map(i -> i*i).filter(i -> isPalindrome("" + i))
        .toArray();

        for(int a : result){
            System.out.println("" + (int) Math.sqrt(a) + " : " + a);
        }
    }
}