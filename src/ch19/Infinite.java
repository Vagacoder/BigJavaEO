package ch19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Infinite
{
   public static void main(String[] args)
   {
      Stream<Integer> ones = Stream.generate(() -> 1);
      show("An infinite stream of ones", ones);

      Stream<Integer> dieTosses =
         Stream.generate(() -> 1 + (int)(6 * Math.random()));
      show("An infinite stream of random numbers", dieTosses);

      Stream<Integer> integers = Stream.iterate(0, n -> n + 1);
      show("An infinite stream of integers", integers);

      integers = Stream.iterate(0, n -> n + 1);
      Stream<Integer> primes = integers.filter(n -> isPrime(n));
      show("An infinite stream of primes", primes);      
   }
   
   public static boolean isPrime(int number)
   {
      return Stream.iterate(1, n -> n + 1)
         .limit(number)
         .filter(n -> number % n == 0)
         .count() == 2;
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
