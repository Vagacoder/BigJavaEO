package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams2 {
   public static void main(String[] args) {
      Stream<String> stream = Stream.of("Mary", "had", "a", "little", "lamb").filter(w -> w.contains("a"));

      String[] result1 = stream.toArray(String[]::new);
      System.out.println("Converting to an array: " + Arrays.toString(result1));

      stream = Stream.of("Mary", "had", "a", "little", "lamb").filter(w -> w.contains("a"));

      List<String> result2 = stream.collect(Collectors.toList());
      System.out.println("Collecting to a list: " + result2);

      stream = Stream.of("Mary", "had", "a", "little", "lamb").filter(w -> w.contains("a"));

      Set<String> result3 = stream.collect(Collectors.toSet());
      System.out.println("Collecting to a set: " + result3);

      stream = Stream.of("Mary", "had", "a", "little", "lamb").filter(w -> w.contains("a"));
      String result4 = stream.collect(Collectors.joining(", "));
      System.out.println("Joining with commas: " + result4);
   }
}
