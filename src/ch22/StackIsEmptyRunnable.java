package ch22;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StackIsEmptyRunnable<T> implements Runnable{

	private LinkedList<T> stack;
	private Lock block = new ReentrantLock();
	

	public StackIsEmptyRunnable(LinkedList<T> list) {
		stack = list;
	}

	@Override
	public void run() {
		block.lock();
		try {

			stack.isEmpty();
			
		}

		finally {
			block.unlock();
		}
	}
}
