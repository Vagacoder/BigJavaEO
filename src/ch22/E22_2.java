package ch22;

import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.locks.Lock;

// E22.2 Implement a stack as a linked list in which the push , pop , and isEmpty methods can be safely accessed from multiple threads.

public class E22_2 {


	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>(); 

		StackPushRunnable<Integer> push1 = new StackPushRunnable<>(l1, 2);
		StackPushRunnable<Integer> push2 = new StackPushRunnable<>(l1, 5);
		
	    Thread t1 = new Thread(push1);
	    Thread t2 = new Thread(push2);
	    
	    t1.start();
	    t2.start();
	    
	    System.out.println(l1.getLast());
	    StackPopRunnable<Integer> pop1 = new StackPopRunnable<>(l1);
	    Thread t3 = new Thread(pop1);
	    t3.start();
	    
	    System.out.println(l1.getLast());
	}
}
