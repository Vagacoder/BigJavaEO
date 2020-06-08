package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Streams {
   public static void main(String[] args) throws IOException {
      Stream<String> words = Stream.of("Mary", "had", "a", "little", "lamb");
      show("A stream of individually specified words", words);

      Stream<Integer> digits = Stream.of(3, 1, 4, 1, 5, 9);
      show("A stream of individually specified digits", digits);

      Integer[] digitArray = { 3, 1, 4, 1, 5, 9 };
      digits = Stream.of(digitArray);
      show("A stream of digits from an array", digits);

      List<String> wordList = new ArrayList<>();
      // Populate wordList
      wordList.add("Hello");
      wordList.add("World");
      words = wordList.stream();
      show("A stream of words from a list", words);

      try (Stream<String> lines = Files.lines(Paths.get("../countries.txt"))) {
         show("A stream of lines from a file", lines);
      }
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
