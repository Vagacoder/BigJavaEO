package ch17;

import java.util.Scanner;

/*
 * E17.4 Implement the animal guessing game described in Section 17.2.1. Start 
 * with the tree in Figure 4, but present the leaves as “Is it a(n) X?” If it 
 * wasn’t, ask the user what the animal was, and ask for a question that is true 
 * for that animal but false for X. For example,
  
      Is it a mammal? Y
      Does it have stripes? N
      Is it a pig? N
      I give up. What is it? A hamster
      Please give me a question that is true for a hamster and false for a pig.
      Is it small and cuddly?
      
 * In this way, the program learns additional facts.
 
 */

public class E17_4 {
    
    public static void main(String[] args){

        Scanner keyIn = new Scanner(System.in);

        // * test 1
        // BinaryTree tree = new BinaryTree("mammal");
        // System.out.println("Is it a " + tree.data() + "?");
        // String answer = keyIn.nextLine().toLowerCase();
        // BinaryTree q2y = new BinaryTree("stripes");
        // BinaryTree q2n = new BinaryTree("");
        // tree = new BinaryTree(tree.data(), q2y, q2n);
        // if(answer.equals("y")){
        //     System.out.println("Does it have " + tree.left().data());
        // }
        // answer = keyIn.nextLine().toLowerCase();
        // if(answer.equals("n")){
        //     System.out.println("I give up.");
        // }

        // * test 2 
        BinaryTree pig = new BinaryTree("pig");
        BinaryTree stripe = new BinaryTree("stripe", new BinaryTree(), pig);
        BinaryTree mammal = new BinaryTree("mammal", stripe, new BinaryTree());

        BinaryTree cur = mammal;
        BinaryTree parent = null;
        String answer = "";
        String question = "";
        while (cur.data() != null){
            question = "" + cur.data();
            System.out.print("Is is a " + question + "? ");
            answer = keyIn.nextLine().toLowerCase();
            if(answer.equals("y")){
                parent =cur;
                cur = cur.left();
            }else{
                parent = cur;
                cur = cur.right();
            }
        }

        System.out.println("I give up");
        System.out.println("what is that?");
        String nextLeft = keyIn.nextLine();
        System.out.printf("Please give me a question that is true for a %s and false for a %s.\n", nextLeft, question);
        String left = keyIn.nextLine();
        BinaryTree newQuestion = new BinaryTree(left, new BinaryTree(nextLeft), new BinaryTree());
        parent = new BinaryTree(parent.data(), newQuestion, parent.right());
        keyIn.close();
    }
}