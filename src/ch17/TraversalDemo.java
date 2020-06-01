package ch17;

import java.util.Iterator;

/*
 * This program demonstrates tree traversal.
 */
public class TraversalDemo {
   public static void main(String[] args) {
      TraversalTree t1 = new TraversalTree("Anne");
      TraversalTree t2 = new TraversalTree("Peter");
      t1.addSubtree(t2);
      TraversalTree t3 = new TraversalTree("Zara");
      t1.addSubtree(t3);
      TraversalTree t4 = new TraversalTree("Savannah");
      t2.addSubtree(t4);

      // Count short names with visitor
      class ShortNameCounter implements TraversalTree.Visitor {
         public int counter = 0;

         public void visit(Object data) {
            System.out.println(data);
            if (data.toString().length() <= 5) {
               counter++;
            }
         }
      }

      ShortNameCounter v = new ShortNameCounter();

      t1.preorder(v);
      System.out.println("Short names: " + v.counter);

      // Count short names with iterator
      Iterator iter = t1.iterator();
      int counter = 0;
      while (iter.hasNext()) {
         Object data = iter.next();
         System.out.println(data);
         if (data.toString().length() <= 5) {
            counter++;
         }
      }
      System.out.println("Short names: " + counter);
   }
}
