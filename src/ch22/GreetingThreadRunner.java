package ch22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
* This program runs two greeting threads in parallel.

* modified to use thread pool
*/
public class GreetingThreadRunner{
   public static void main(String[] args){
      GreetingRunnable r1 = new GreetingRunnable("Hello", 1000);
      GreetingRunnable r2 = new GreetingRunnable("Goodbye", 1000);
      
      // * original implementation
      // Thread t1 = new Thread(r1);
      // Thread t2 = new Thread(r2);
      // t1.start();
      // t2.start();

      // * R22.2
      // r1.run();
      // r2.run();

      // * using thread pool
      // ! but executor does not close by itself after all threads are done
      // ExecutorService pool = Executors.newFixedThreadPool(2);
      // pool.execute(r1);
      // pool.execute(r2);

      // * better thread pool
      ExecutorService pool = Executors.newFixedThreadPool(2);
      Future<?>[] futures = new Future[2];
      futures[0] = pool.submit(r1);
      futures[1] = pool.submit(r2);
      while(true){
         if(futures[0].isDone() && futures[1].isDone()){
            break;
         }
      }
      pool.shutdown();

      
   }
}

