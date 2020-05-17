package ch22;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* E22.3 Implement a Queue class whose add and remove methods are synchronized. 

Supply one thread, called the producer, which keeps inserting strings into the 
queue as long as there are fewer than ten elements in it. When the queue gets too 
full, the thread waits. As sample strings, simply use time stamps new Date().toString(). 

Supply a sec­ond thread, called the consumer, that keeps removing and printing 
strings from the queue as long as the queue is not empty. When the queue is empty, 
the thread waits. 

Both the consumer and producer threads should run for 100 iterations.

! This is classic problem of CPU process synchronization: Producer-Consumer, or
! Bounded buffer. The queue here, is a buffer with size limit, one producer keeps 
! adding items to buffer, one consumer keeps consume items from buffer.
! See details in Operating System textbook or tutorial

! An interesting example of Synchronized keyword. 
! Synchronized provide built-in lock/condition. No need implement them, either to
! implement lock/try/finally/unlock paradigm.

! Compare this class with BankAccountX class

* E22.4 Enhance the program of Exercise E22.3 by supplying a variable number of 
producer and consumer threads. Prompt the program user for the numbers.

! Note: here # of producer must be same as # of consumer. Because each one repeat
! same time. If there are more consumers than producer, consumers will be always 
! waiting for more elements.


*/

public class Queue {

    private LinkedList<String> queue;
    int maxCapacity = 20;
    int minCapacity = 0;
    int threshold = 10;

    public Queue() {
        this.queue = new LinkedList<>();
    }

    public synchronized void add(String key) throws InterruptedException {
        while (queue.size() >= maxCapacity) {
            this.wait();
        }
        this.queue.addFirst(key);
        System.out.println("Add: " + key + "; Size: " + queue.size());
        // if(queue.size() > threshold){
        this.notifyAll();
        // }
    }

    public synchronized String remove() throws InterruptedException {
        while (queue.size() <= minCapacity) {
            this.wait();
        }
        String result = this.queue.removeLast();
        System.out.println("Remove: " + result + "; Size: " + queue.size());
        // if (queue.size() <= threshold) {
        this.notifyAll();
        // }
        return result;
    }

    public static void main(String[] args) {

        Scanner keyIn = new Scanner(System.in);
        System.out.print("Please enter number of producer: ");
        int pN = Integer.parseInt(keyIn.next());
        System.out.print("Please enter number of consumer: ");
        int cN = Integer.parseInt(keyIn.next());
        keyIn.close();

        int repeat = 100;
        long delay = 1L;
        Queue queue = new Queue();

        for (int i = 0; i < pN; i++) {
            Thread producer = new Thread() {
                public void run() {
                    try {
                        for (int j = 0; j < repeat; j++) {
                            String date = new Date().toString();
                            queue.add(date);
                            Thread.sleep(delay);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            producer.start();
        }

        for (int i = 0; i < cN; i++) {
            Thread consumer = new Thread() {
                public void run() {
                    try {
                        for (int j = 0; j < repeat; j++) {
                            queue.remove();
                            Thread.sleep(delay);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            consumer.start();
        }

    }
}