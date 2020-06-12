package ch19;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
   public static void main(String[] args) {
      IntStream stream = IntStream.of(3, 1, 4, 1, 5, 9);
      System.out.println("The sum of a stream of ints: " + stream.sum());

      int[] values = { 3, 1, 4, 1, 5, 9 };
      stream = IntStream.of(values);
      System.out.println("The sum of a stream of ints from an array: " + stream.sum());

      stream = IntStream.range(1, 101);
      System.out.println("The sum of a range: " + stream.sum());

      Random generator = new Random();
      IntStream dieTosses = generator.ints(1, 7);
      System.out.println("Twenty random die tosses: " + Arrays.toString(dieTosses.limit(20).toArray()));

      IntStream codePoints = "Hello".codePoints();
      System.out.println("The Unicode code points of the string Hello: " + Arrays.toString(codePoints.toArray()));

      Stream<String> words = Stream.of("Hello", "World");
      stream = words.mapToInt(w -> w.length());
      System.out.println("Mapping objects to ints: " + Arrays.toString(stream.toArray()));

      stream = IntStream.range(0, 20).map(n -> Math.max(n, 10));
      System.out.println("Mapping ints to ints: " + Arrays.toString(stream.toArray()));

      String river = "Mississippi";
      int n = river.length();
      Stream<String> prefixes = IntStream.range(0, n).mapToObj(i -> river.substring(0, i + 1));
      System.out.println("Mapping ints to objects: " + Arrays.toString(prefixes.toArray(String[]::new)));

      DoubleStream roots = IntStream.range(0, 20).mapToDouble(i -> Math.sqrt(i));
      System.out.println("Mapping ints to doubles: " + Arrays.toString(roots.toArray()));

      words = Stream.of("Goodbye", "World");
      double average = words.mapToInt(w -> w.length()).average().orElse(0);
      System.out.println("Computing an average of ints: " + average);

      int max = "World".codePoints().max().orElse(0);

      System.out.println("Computing a maximum of ints: " + max);
   }
}
