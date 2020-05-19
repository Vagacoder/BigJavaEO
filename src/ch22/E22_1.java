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
		ll.addFirst(1);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(2);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(3);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(4);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(5);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(6);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(7);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(8);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(9);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(10);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(11);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(12);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(13);
		for(int i = 0; i < 10;i++){}
		ll.addFirst(14);
		ll.addFirst(15);
		ll.addFirst(16);
		ll.addFirst(17);
		ll.addFirst(18);
		ll.addFirst(19);
	}

	

	public static void main(String[] args) {
		
		LinkedList<Integer> ll1 = new LinkedList<>();
		E22_1 e1 = new E22_1(ll1);
		E22_1 e2 = new E22_1(ll1);
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		t1.start();
		t2.start();

		// int a = ll1.getFirst();
		//System.out.println(a);
		for(int i = 0; i < 10000000;i++){}
		for (int b : ll1) {
			System.out.println(b);
		}
	}

}
