package ch19;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class HigherOrderFunctions
{
   public static void main(String[] args) throws IOException
   {
      Scanner in = new Scanner(new File("data/countries.txt"));
      List<String> wordList = new ArrayList<>();
      while (in.hasNextLine()) { wordList.add(in.nextLine()); }

      List<String> filtered = filter(wordList, w -> w.length() > 10);
      System.out.println("Long country names: " + filtered);

      filtered = filter(wordList, contains(" and "));
      System.out.println("Countries with and in their name: " + filtered);
   }
   
   public static <T> List<T> filter(List<T> values, Predicate<T> p)
   {
      List<T> result = new ArrayList<>();
      for (T value : values)
      {
         if (p.test(value)) { result.add(value); }
      }
      return result;
   }

   public static Predicate<String> contains(String target)
   {
      return s -> s.indexOf(target) >= 0;
   }
}
