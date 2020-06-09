package ch19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams4
{
   public static void main(String[] args)
   {
      Stream<String> words = Stream.of(
         "how much wood could a wood chuck chuck".split(" "))
         .filter(w -> w.length() > 4);
      show("Filtering with a simple lambda expression", words);

      words = Stream.of(
         "how much wood could a wood chuck chuck".split(" "))
         .filter((String w) -> w.length() > 4);
      show("Filtering with a lambda expression with parameter type", words);

      Stream<String> distinctWords = Stream.of(
         "how much wood could a wood chuck chuck".split(" "))
         .distinct();
      Stream<String> sortedWords = distinctWords.sorted(
         (s, t) -> s.length() - t.length());
      show("Sorting with a lambda expression with two parameters", sortedWords);
      
      distinctWords = Stream.of(
         "how much wood could a wood chuck chuck".split(" "))
         .distinct();
      sortedWords = distinctWords.sorted(
         (v, w) ->
         {
            int first = v.length();
            int second = w.length();
            return first - second;
         });
      show("Sorting with a complex lambda expression", sortedWords);      
   }

   /**
      Displays the first ten values in a stream, followed by ...
      if there are additional values.
      @param caption the caption preceding the values
      @param stream the stream to be displayed (which is consumed
      in the process)
   */
   public static <T> void show(String caption, Stream<T> stream)
   {
      final int SHOW_LIMIT = 10;
      List<T> values = stream.limit(SHOW_LIMIT + 1).collect(
         Collectors.toList());
      System.out.print(caption + ": ");
      for (int i = 0; i < Math.min(SHOW_LIMIT, values.size()); i++)
      {
         if (i > 0) { System.out.print(", "); }
         System.out.print(values.get(i));
      }
      if (values.size() > SHOW_LIMIT) { System.out.print(", ..."); }
      System.out.println();
   }
}
