package ch19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams3 {
   public static void main(String[] args) {
      Stream<String> words = Stream.of("A", "Tale", "of", "Two", "Cities");
      Stream<String> lowerCaseWords = words.map(w -> w.toLowerCase());
      show("Mapping to lowercase: ", lowerCaseWords);

      lowerCaseWords = Stream.of("A", "Tale", "of", "Two", "Cities").map(w -> w.toLowerCase());

      Stream<String> consonantsOnly = lowerCaseWords.map(w -> w.replaceAll("[aeiou]", ""));
      show("Removing vowels", consonantsOnly);

      consonantsOnly = Stream.of("A", "Tale", "of", "Two", "Cities").map(w -> w.toLowerCase())
            .map(w -> w.replaceAll("[aeiou]", ""));

      Stream<Integer> consonantCount = consonantsOnly.map(w -> w.length());
      show("Counting consonants", consonantCount);

      words = Stream.of("how much wood could a wood chuck chuck".split(" "));
      Stream<String> cWords = words.filter(w -> w.substring(0, 1).equals("c"));
      show("Words with c", cWords);

      words = Stream.of("how much wood could a wood chuck chuck".split(" "));
      Stream<String> distinctWords = words.distinct();
      show("Distinct words", distinctWords);

      distinctWords = Stream.of("how much wood could a wood chuck chuck".split(" ")).distinct();
      Stream<String> sortedWords = distinctWords.sorted();
      show("Sorted words", sortedWords);
   }

   /**
    * Displays the first ten values in a stream, followed by ... if there are
    * additional values.
    * 
    * @param caption the caption preceding the values
    * @param stream  the stream to be displayed (which is consumed in the process)
    */
   public static <T> void show(String caption, Stream<T> stream) {
      final int SHOW_LIMIT = 10;
      List<T> values = stream.limit(SHOW_LIMIT + 1).collect(Collectors.toList());
      System.out.print(caption + ": ");
      for (int i = 0; i < Math.min(SHOW_LIMIT, values.size()); i++) {
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(values.get(i));
      }
      if (values.size() > SHOW_LIMIT) {
         System.out.print(", ...");
      }
      System.out.println();
   }
}
