package ch22;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;

/*
* E22.5 Reimplement Exercise E22.4 by using the ArrayBlockingQueue class from the 
standard library.

*/

public class QueueByArrayBlocking {

    private ArrayBlockingQueue<String> queue;
    int maxCapacity = 20;
    int minCapacity = 0;
    int threshold = 10;

    public QueueByArrayBlocking() {
        this.queue = new ArrayBlockingQueue<>(maxCapacity);
    }

    public synchronized void add(String key) throws InterruptedException {
        while (queue.size() == maxCapacity) {
            wait();
        }
        queue.add(key);
        System.out.println("Add: " + key + "; Size: " + queue.size());
        this.notifyAll();
    }

    public synchronized String remove() throws InterruptedException {
        while (queue.size() == minCapacity) {
            wait();
        }
        String result = queue.remove();
        System.out.println("Remove: " + result + "; Size: " + queue.size());
        this.notifyAll();
        return result;
    }

    public static void main(String[] args) {
        int repeat = 100;
        long delay = 1L;
        QueueByArrayBlocking queue = new QueueByArrayBlocking();

        Thread producer = new Thread() {
            public void run() {
                try {
                    for (int i = 0; i < repeat; i++) {
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

        Thread consumer = new Thread(){
            public void run(){
                try {
                    for (int i = 0; i < repeat; i++) {
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