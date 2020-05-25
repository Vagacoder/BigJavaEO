package ch15;

import java.util.Scanner;
import java.util.Stack;

/*
* E15.9 Your task is to break a number into its individual digits, for example, to turn 1729
into 1, 7, 2, and 9. It is easy to get the last digit of a number n as n % 10. But that gets
the numbers in reverse order. Solve this problem with a stack. Your program should
ask the user for an integer, then print its digits separated by spaces.

*/

public class E15_9 {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();
        Scanner keyIn = new Scanner(System.in);

        while(keyIn.hasNextInt()){
            int input = keyIn.nextInt();
            while(input != 0){
                int r = input % 10;
                stack.push(r);
                input = input / 10;
            }
        }
        
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

        System.out.println();

    }
}