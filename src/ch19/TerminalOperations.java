package ch19;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class TerminalOperations {
   public static void main(String[] args) throws IOException {
      Scanner in = new Scanner(new File("data/words.txt"));
      
      List<String> wordList = new ArrayList<>();
      while (in.hasNext()) {
         wordList.add(in.next());
      }

      Stream<String> words = wordList.stream();

      String result = words.parallel().filter(w -> w.length() > 10).filter(w -> w.endsWith("y")).findAny()
            .orElse("None found");
      // Note the use of findAny. Run this program several times
      // and check whether the result changes
      System.out.println("A word ending in y: " + result);

      words = wordList.stream();
      Optional<String> result2 = words.max((v, w) -> v.length() - w.length());
      System.out.print("The longest word: ");
      result2.ifPresent(w -> System.out.println(w));

      words = wordList.stream();
      boolean result3 = words.allMatch(w -> w.contains("e"));

      System.out.println("All words contain an e: " + result3);
   }
}
