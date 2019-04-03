package ch22;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StackPushRunnable<T> implements Runnable {

	private LinkedList<T> stack;
	private Lock block = new ReentrantLock();
	private T newNode;

	public StackPushRunnable(LinkedList<T> list, T node) {
		stack = list;
		newNode = node;
	}

	@Override
	public void run() {
		block.lock();
		try {

			stack.addLast(newNode);
			
		}

		finally {
			block.unlock();
		}
	}

}
