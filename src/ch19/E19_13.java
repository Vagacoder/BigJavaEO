package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

/*
 * E19.3 Read all words from a file and print the one with the maximum number of 
 * vowels. Use a Stream<String> and the max method. Extra credit if you define 
 * the comparator with the Comparator.comparing method described in Special 
 * Topic 19.4.

 ! this is a interesting example. Read special topic 19.4 and understand it.
 */

public class E19_13 {

    public static int countVowels(String w){
        return w.replaceAll("[^aeiou]", "").length();
    }

    public static void main(String[] args) {
        String filename = "data/words.txt";

        try {
            // * Lambda expression
            System.out.println("1. using lambda expression");
            Stream<String> words = Files.lines(Paths.get(filename));

            String result = words.max(
                (v, w) -> countVowels(v) - countVowels(w)
            ).orElse("");

            System.out.println(result);


            // * Comparator
            System.out.println("\n2. using Comparator");
            Comparator<String> comp = (v, w) -> countVowels(v) - countVowels(w);

            words = Files.lines(Paths.get(filename));
            result = words.max(comp).orElse("");

            System.out.println(result);


            // * higher order function
            System.out.println("\n3. using Higher order function");

            words = Files.lines(Paths.get(filename));
            result = words.max(Comparator.comparing(E19_13::countVowels)).orElse("");

            System.out.println(result);
            words.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}