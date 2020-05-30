package ch17;

import java.util.HashMap;
import java.util.Map;

public class HuffmanDemo {
   public static void main(String[] args) {
      Map<Character, Integer> frequencyMap = new HashMap<>();
      frequencyMap.put('A', 2089);
      frequencyMap.put('E', 576);
      frequencyMap.put('H', 357);
      frequencyMap.put('I', 671);
      frequencyMap.put('K', 849);
      frequencyMap.put('L', 354);
      frequencyMap.put('M', 259);
      frequencyMap.put('N', 660);
      frequencyMap.put('O', 844);
      frequencyMap.put('P', 239);
      frequencyMap.put('U', 472);
      frequencyMap.put('W', 74);
      frequencyMap.put('\'', 541);
      HuffmanTree tree = new HuffmanTree(frequencyMap);

      Map<Character, String> encodingMap = tree.getEncodingMap();
      String encoded = encode("ALOHA", encodingMap);
      System.out.println(encoded);
      String decoded = tree.decode(encoded);
      System.out.println(decoded);
   }

   public static String encode(String toEncode, Map<Character, String> encodingMap) {
      String result = "";
      for (int i = 0; i < toEncode.length(); i++) {
         char ch = toEncode.charAt(i);
         result = result + encodingMap.get(ch);
      }
      return result;
   }
}
