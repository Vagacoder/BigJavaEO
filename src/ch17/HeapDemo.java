package ch17;

/*
 * This program demonstrates the use of a heap as a priority queue.
*/

public class HeapDemo {
   public static void main(String[] args) {

      // * Test MinHeap
      System.out.println("1. test MinHeap ...");
      MinHeap q = new MinHeap();
      q.add(new WorkOrder(3, "Shampoo carpets"));
      q.add(new WorkOrder(7, "Empty trash"));
      q.add(new WorkOrder(8, "Water plants"));
      q.add(new WorkOrder(10, "Remove pencil sharpener shavings"));
      q.add(new WorkOrder(6, "Replace light bulb"));
      q.add(new WorkOrder(1, "Fix broken sink"));
      q.add(new WorkOrder(9, "Clean coffee maker"));
      q.add(new WorkOrder(2, "Order cleaning supplies"));

      while (!q.empty()) {
         System.out.println(q.remove());
      }

      // * Test MaxHeap
      System.out.println("\n2. test MaxHeap ...");
      MaxHeap m = new MaxHeap();
      m.add(new WorkOrder(3, "Shampoo carpets"));
      m.add(new WorkOrder(7, "Empty trash"));
      m.add(new WorkOrder(8, "Water plants"));
      m.add(new WorkOrder(10, "Remove pencil sharpener shavings"));
      m.add(new WorkOrder(6, "Replace light bulb"));
      m.add(new WorkOrder(1, "Fix broken sink"));
      m.add(new WorkOrder(9, "Clean coffee maker"));
      m.add(new WorkOrder(2, "Order cleaning supplies"));

      while (!m.isEmpty()) {
         System.out.println(m.removeMax());
      }
   }
}
