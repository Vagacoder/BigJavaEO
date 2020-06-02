package ch17;

/*
 * A binary tree in which each node has two children.
 * 
 * E17.2 Add a method countNodesWithOneChild to the BinaryTree class.
 * 
 * E17.3 Add a method swapChildren that swaps all left and right children to the 
 * BinaryTree class.
 * 
 */
public class BinaryTree {

   // * inner class
   class Node {
      public Object data;
      public Node left;
      public Node right;
   }

   private Node root;

   /**
    * Constructs an empty tree.
    */
   public BinaryTree() {
      root = null;
   }

   /**
    * Constructs a tree with one node and no children.
    * 
    * @param rootData the data for the root
    */
   public BinaryTree(Object rootData) {
      root = new Node();
      root.data = rootData;
      root.left = null;
      root.right = null;
   }

   /**
    * Constructs a binary tree.
    * 
    * @param rootData the data for the root
    * @param left     the left subtree
    * @param right    the right subtree
    */
   public BinaryTree(Object rootData, BinaryTree left, BinaryTree right) {
      root = new Node();
      root.data = rootData;
      root.left = left.root;
      root.right = right.root;
   }

   /**
    * Returns the height of this tree.
    * 
    * @return the height
    */
    public int height() {
      return height(root);
   }

   /**
    * Returns the height of the subtree whose root is the given node.
    * 
    * @param n a node or null
    * @return the height of the subtree, or 0 if n is null
    */
   private static int height(Node n) {
      if (n == null) {
         return 0;
      } else {
         return 1 + Math.max(height(n.left), height(n.right));
      }
   }

   /**
    * Checks whether this tree is empty.
    * 
    * @return true if this tree is empty
    */
   public boolean isEmpty() {
      return root == null;
   }

   /**
    * Gets the data at the root of this tree.
    * 
    * @return the root data
    */
   public Object data() {
      if(root == null){
         return null;
      }
      return root.data;
   }

   /**
    * Gets the left subtree of this tree.
    * 
    * @return the left child of the root
    */
   public BinaryTree left() {
      BinaryTree result = new BinaryTree();
      result.root = root.left;
      return result;
   }

   /**
    * Gets the right subtree of this tree.
    * 
    * @return the right child of the root
    */
   public BinaryTree right() {
      BinaryTree result = new BinaryTree();
      result.root = root.right;
      return result;
   }

   // * E17.2
   public int countNodesWithOneChild(){
      return countNodesWithOneChild(this.root);
   }

   private int countNodesWithOneChild(Node n){
      if(n == null){
         return 0;
      }

      int sum = countNodesWithOneChild(n.left) + countNodesWithOneChild(n.right);
      if(isOneChild(n)){
         sum++;
      }
      return sum;
   }

   private boolean isOneChild(Node n){
      return (n.left == null && n.right != null)||
         (n.left != null && n.right == null);
   }

   // * E17.3
   public void swapChildren(){
      swapChildren(this.root);
   }

   private void swapChildren(Node n){
      if(n == null){
         return;
      }
      Node temp = n.left;
      n.left = n.right;
      n.right = temp;
      swapChildren(n.left);
      swapChildren(n.right);
   }

   // * E17.8 helper
   public Node getRoot(){
      return this.root;
   }


}
