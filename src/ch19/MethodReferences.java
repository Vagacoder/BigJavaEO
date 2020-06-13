package ch19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferences
{
   public static void main(String[] args)
   {
      Stream<String> words = Stream.of(
         "how much wood could a wood chuck chuck".split(" "))
         .map(w -> w.toUpperCase());
      show("Mapping to uppercase with a lambda expression", words);

      words = Stream.of(
         "how much wood could a wood chuck chuck".split(" "))
         .map(String::toUpperCase);
      show("Mapping to uppercase with a method reference", words);

      words = Stream.of(
         "how much wood could a wood chuck chuck".split(" "))
         .sorted(String::compareTo);
      show("Sorting strings with a method reference", words);

      Stream<Double> numbers = Stream.of(32.0, 54.0, 67.5, 29.0, 35.0, 80.0, 115.0, 44.5, 100.0, 65.0)
         .sorted(Double::compare);
      show("Sorting numbers with a method reference", numbers);

      Stream<BankAccount> accounts = Stream
         .generate(BankAccount::new)
         .limit(5);
      show("Constructing accounts with a constructor reference", accounts);
      
      accounts = Stream
         .iterate(0.0, n -> n + 1000.0)
         .map(BankAccount::new)
         .limit(5);
      show("Mapping with a constructor reference", accounts);

      words = Stream.of(
         "how much wood could a wood chuck chuck".split(" "));
      String[] array = words.toArray(String[]::new);
      System.out.println(
         "Using toArray with an array constructor reference: "
         + Arrays.toString(array));
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
