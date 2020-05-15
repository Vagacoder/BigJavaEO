package ch22;

/*
* E22.7 Write a program WordCount that counts the words in one or more files. 
Start a new thread for each file.

* E22.8 Enhance the program of Exercise E22.7 so that the last active thread also 
prints a combined count. Use locks to protect the combined word count and a counter 
of active threads.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WordCountX implements Runnable {

	static int totalCount = 0;
	private Lock totalCountLock;

	File inFile;
	Scanner in;
	int count = 0;

	public WordCountX(String fileName, Lock totalCountLock) throws FileNotFoundException {
		inFile = new File(fileName);
		in = new Scanner(inFile);
		this.totalCountLock = totalCountLock;
	}

	@Override
	public void run() {
		while (in.hasNext()) {
			String a = in.next();
			// System.out.println(a);
			count++;
		}
		in.close();
		System.out.println(inFile.getName() + ": " + count);

		totalCountLock.lock();
		try{
			totalCount += count;
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			totalCountLock.unlock();
		}
	}

	public static int getTotalCount(){
		return totalCount;
	}

	public static void main(String[] args) throws FileNotFoundException {

		// ? Is this correct way to implement Lock?
		// ? all thread / runnable are using same Lock instance
		Lock totalCountLock = new ReentrantLock();

		WordCountX w1 = new WordCountX("alice30.txt", totalCountLock);
		WordCountX w2 = new WordCountX("data.txt", totalCountLock);
		WordCountX w3 = new WordCountX("babynames.txt", totalCountLock);
		// Thread t1 = new Thread(w1);
		// Thread t2 = new Thread(w2);
		// Thread t3 = new Thread(w3);
		// t1.start();
		// t2.start();
		// t3.start();

		ExecutorService pool = Executors.newFixedThreadPool(3);
		Future<?>[] futures = new Future[3];
		futures[0] = pool.submit(w1);
		futures[1] = pool.submit(w2);
		futures[2] = pool.submit(w3);
		while(true){
			if(futures[0].isDone() && futures[1].isDone() && futures[2].isDone()){
				break;
			}
		}
		pool.shutdown();
		System.out.println("Total count is: " + getTotalCount());
	}
}
