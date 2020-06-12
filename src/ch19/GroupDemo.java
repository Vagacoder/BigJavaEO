package ch19;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class GroupDemo
{
   public static void main(String[] args)
   {
      String[] words = ("how much wood would a woodchuck chuck "
         + "if a woodchuck could chuck wood").split(" ");

      Map<String, List<String>> groups = Stream.of(words)
         .collect(Collectors.groupingBy(
            w -> w.substring(0, 1)));
      System.out.println("Lists by first letter: " + groups);

      Map<String, Set<String>> groupOfSets = Stream.of(words)
         .collect(Collectors.groupingBy(
            w -> w.substring(0, 1), // The function for extracting the keys
            Collectors.toSet())); // The group collector
      System.out.println("Sets by first letter: " + groupOfSets);

      Map<String, Long> groupCounts = Stream.of(words)
         .collect(Collectors.groupingBy(
            w -> w.substring(0, 1),
            Collectors.counting()));
      System.out.println("Counts by first letter: " + groupCounts);

      Map<String, Optional<String>> groupLongest = Stream.of(words)
         .collect(
            Collectors.groupingBy(
               w -> w.substring(0, 1), // The function for extracting the keys
               Collectors.maxBy(
                  (v, w) -> v.length() - w.length()))); 
                  // The comparator function
      System.out.println("Longest word by first letter: " + groupLongest);
   }
}
