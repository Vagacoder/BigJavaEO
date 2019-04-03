package ch22;

import java.util.LinkedList;

// E22.1 Write a program in which multiple threads add and remove elements from a java.util.LinkedList . Demonstrate that the list is being corrupted.

public class E22_1 implements Runnable{
	
	LinkedList<Integer> ll;
	
	public E22_1(LinkedList llist) {
		ll = llist;
	}
	

	@Override
	public void run() {
		ll.addFirst(1);;
	}

	

	public static void main(String[] args) {
		
		LinkedList<Integer> ll1 = new LinkedList<>();
		E22_1 e1 = new E22_1(ll1);
		E22_1 e2 = new E22_1(ll1);
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		t1.start();
		t2.start();

		//int a = ll1.getFirst();
		//System.out.println(a);
		for (int b : ll1) {
			System.out.println(b);
		}
	}

}
