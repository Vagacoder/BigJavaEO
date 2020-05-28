package ch15;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Simulation of customer traffic in a bank.
 */
public class BankSimulation extends Simulation {
   private Customer[] tellers;
   private Queue<Customer> custQueue;

   private int totalCustomers;
   private double totalTime;

   private static final double INTERARRIVAL = 1;
   // average of 1 minute between customer arrivals
   private static final double PROCESSING = 5;
   // average of 5 minutes processing time per customer

   public BankSimulation(int numberOfTellers) {
      tellers = new Customer[numberOfTellers];
      custQueue = new LinkedList<>();
      totalCustomers = 0;
      totalTime = 0;
   }

   /**
    * Adds a customer to the bank.
    * 
    * @param c the customer
    */
   public void add(Customer c) {
      boolean addedToTeller = false;
      for (int i = 0; !addedToTeller && i < tellers.length; i++) {
         if (tellers[i] == null) {
            addToTeller(i, c);
            addedToTeller = true;
         }
      }
      if (!addedToTeller) {
         custQueue.add(c);
      }

      addEvent(new Arrival(getCurrentTime() + expdist(INTERARRIVAL)));
   }

   /**
    * Adds a customer to a teller and schedules the departure event.
    * 
    * @param i the teller number
    * @param c the customer
    */
   private void addToTeller(int i, Customer c) {
      tellers[i] = c;
      addEvent(new Departure(getCurrentTime() + expdist(PROCESSING), i));
   }

   /**
    * Removes a customer from a teller.
    * 
    * @param i teller position
    */
   public void remove(int i) {
      Customer c = tellers[i];
      tellers[i] = null;

      // Update statistics
      totalCustomers++;
      totalTime = totalTime + getCurrentTime() - c.getArrivalTime();

      if (custQueue.size() > 0) {
         addToTeller(i, custQueue.remove());
      }
   }

   /**
    * Displays tellers and queue.
    */
   public void display() {
      for (int i = 0; i < tellers.length; i++) {
         if (tellers[i] == null) {
            System.out.print(".");
         } else {
            System.out.print("C");
         }
      }
      System.out.print("<");
      int q = custQueue.size();
      for (int j = 1; j <= q; j++) {
         System.out.print("W");
      }
      System.out.println();
   }

   /**
    * Displays a summary of the gathered statistics.
    */
   public void displaySummary() {
      double averageTime = 0;
      if (totalCustomers > 0) {
         averageTime = totalTime / totalCustomers;
      }
      System.out.println(totalCustomers + " customers. Average time " + averageTime + " minutes.");
   }
}
