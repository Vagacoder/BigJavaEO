package ch19;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo
{
   public static void main(String[] args)
   {
      Stream<String> words = Stream.of("Zimbabwe", "Namibia",
         "Uganda", "Botswana", "Madagascar", "Mozambique",
         // "Ivory Coast",
         "Swaziland", "Togo");
      Optional<String> optResult = words.filter(w -> w.length() > 10).findFirst();

      // Using orElse
      String first = optResult.orElse("(None)");
      System.out.println("The first country with more than ten characters: " + first);

      // Using ifPresent
      optResult.ifPresent(v -> System.out.println(
            "The first country with more than ten characters: " + v));

      // Using isPresent/get
      if (optResult.isPresent())
      {
         System.out.println("The first country with more than ten characters: " + optResult.get());
      }
      else
      {
         System.out.println("None of these countries has more than ten characters");
      }
   }
}
