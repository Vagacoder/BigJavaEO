package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class GroupDemo2
{
   public static void main(String[] args) throws IOException
   {
      try (Stream<String> lines = Files.lines(Paths.get("data/population.txt")))
      {
         Stream<Country> countries
            = lines.map(line -> Country.parse(line));

         Map<String, Long> groupSum = countries.collect(
            Collectors.groupingBy(
               c -> c.getContinent(), // The function for extracting the keys
               Collectors.summingLong(
                  c -> c.getPopulation()))); // The function for getting the summands

         System.out.println("Population per continent: "
            + groupSum);
      }
   }
}
