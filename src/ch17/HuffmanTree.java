package ch17;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * A tree for decoding Huffman codes.
 */
public class HuffmanTree {

   class Node implements Comparable<Node> {
      public char character;
      public int frequency;
      public Node left;
      public Node right;

      public int compareTo(Node other) {
         return frequency - other.frequency;
      }

      public void fillEncodingMap(Map<Character, String> map, String prefix) {
         if (left == null) // it's a leaf
         {
            map.put(character, prefix);
         } else {
            left.fillEncodingMap(map, prefix + "0");
            right.fillEncodingMap(map, prefix + "1");
         }
      }
   }

   private Node root;

   /**
    * Constructs a Huffman tree from given character frequencies.
    * 
    * @param frequencies a map whose keys are the characters to be encoded and
    *                    whose values are the frequencies of the characters
    */
   public HuffmanTree(Map<Character, Integer> frequencies) {
      PriorityQueue<Node> nodes = new PriorityQueue<>();
      for (char ch : frequencies.keySet()) {
         Node newNode = new Node();
         newNode.character = ch;
         newNode.frequency = frequencies.get(ch);
         nodes.add(newNode);
      }

      while (nodes.size() > 1) {
         Node smallest = nodes.remove();
         Node nextSmallest = nodes.remove();
         Node newNode = new Node();
         newNode.frequency = smallest.frequency + nextSmallest.frequency;
         newNode.left = smallest;
         newNode.right = nextSmallest;
         nodes.add(newNode);
      }

      root = nodes.remove();
   }

   /**
    * Decodes an encoded string.
    * 
    * @param input a string made up of 0 and 1
    */
   public String decode(String input) {
      String result = "";
      Node n = root;
      for (int i = 0; i < input.length(); i++) {
         char ch = input.charAt(i);
         if (ch == '0') {
            n = n.left;
         } else {
            n = n.right;
         }
         if (n.left == null) // n is a leaf
         {
            result = result + n.character;
            n = root;
         }
      }
      return result;
   }

   public Map<Character, String> getEncodingMap() {
      Map<Character, String> map = new HashMap<>();
      if (root != null) {
         root.fillEncodingMap(map, "");
      }
      return map;
   }


}
