package ch17;

/**
 * This program tests the binary search tree class.
 */
public class TreeTester {
   public static void main(String[] args) {
      BinarySearchTree t = new BinarySearchTree();
      t.add("D");
      t.add("B");
      t.add("A");
      t.add("C");
      t.add("F");
      t.add("E");
      t.add("I");
      t.add("G");
      t.add("H");
      t.add("J");
      t.remove("A"); // Removing leaf
      t.remove("B"); // Removing element with one child
      t.remove("F"); // Removing element with two children
      t.remove("D"); // Removing root
      t.print();
      System.out.println("Expected: C E G H I J");
   }
}
