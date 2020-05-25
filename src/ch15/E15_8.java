package ch15;

import java.util.Scanner;
import java.util.Stack;

/*
* E15.8 
* Use a stack to reverse the words of a sentence. Keep reading words until you have a
word that ends in a period, adding them onto a stack. When you have a word with a
period, pop the words off and print them. Stop when there are no more words in the
input. For example, you should turn the input
Mary had a little lamb. Its fleece was white as snow.
into
Lamb little a had mary. Snow as white was fleece its.
Pay attention to capitalization and the placement of the period.

*/


public class E15_8{

    public static void main(String[] args){
    
        Stack<String> stack = new Stack<>();
        Scanner keyIn = new Scanner(System.in);
        String result = "";
        while(keyIn.hasNext()){
            String input = keyIn.next();
            if(!input.equals(".") && !input.endsWith(".")){
                stack.push(input);
            }else{
                if(!input.equals(".") && input.endsWith(".")){
                    stack.push(input.substring(0, input.length()-1));
                }
                while(!stack.isEmpty()){
                    result += (" " + stack.pop());
                }
                result += ".";
            }
        }
        System.out.println(result.trim());
    }
}