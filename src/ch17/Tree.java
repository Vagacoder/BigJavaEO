package ch17;

import java.util.List;
import java.util.ArrayList;

/*
 * A tree in which each node has an arbitrary number of children.
 * 
 * R17.2 Describe a recursive algorithm for finding the maximum number of siblings 
 * in a tree.
 * 
 * E17.1 Write a method that counts the number of all leaves in a tree.
 *
 * 
 * 
 */
public class Tree {
   private Node root;

   class Node {
      public Object data;
      public List<Node> children;

      /**
       * Computes the size of the subtree whose root is this node.
       * 
       * @return the number of nodes in the subtree
       */
      public int size() {
         int sum = 0;
         for (Node child : children) {
            sum = sum + child.size();
         }
         return 1 + sum;
      }
   }

   /**
    * Constructs an empty tree.
    */
   public Tree() {
      root = null;
   }

   /**
    * Constructs a tree with one node and no children.
    * 
    * @param rootData the data for the root
    */
   public Tree(Object rootData) {
      root = new Node();
      root.data = rootData;
      root.children = new ArrayList<>();
   }

   /**
    * Adds a subtree as the last child of the root.
    */
   public void addSubtree(Tree subtree) {
      root.children.add(subtree.root);
   }

   /**
    * Computes the size of this tree.
    * 
    * @return the number of nodes in the tree
    */
   public int size() {
      if (root == null) {
         return 0;
      } else {
         return root.size();
      }
   }

   // Additional methods will be added in later sections.

   // * E17.1
   public int leafCount() {
      return leafCount(this.root);
   }

   private int leafCount(Node n) {
      if (isLeaf(n)) {
         return 1;
      } else {
         int sum = 0;
         for (Node child : n.children) {
            sum += leafCount(child);
         }
         return sum;
      }
   }

   private boolean isLeaf(Node n) {
      return n.children.size() == 0;
   }

   // * R17.2
   public int maxSibling() {
      return maxSibling(root);
   }

   private int maxSibling(Node n) {
      int max = n.children.size();
      for (Node child : n.children) {
         int maxChildSiblingNumber = maxSibling(child);
         if (maxChildSiblingNumber > max) {
            max = maxChildSiblingNumber;
         }
      }
      return max;
   }
}
