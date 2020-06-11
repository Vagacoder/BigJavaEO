package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
 * SC 31 Rewrite the example for the findAny operation at the beginning of this 
 * section so that the filter method is only called once.
 * 
 * SC 32 How can you check whether any words start with the letter q and end with 
 * the letter y without calling findAny?
 * 

 */
public class Sc31 {

    public static void main(String[] args) {

        try {

            // * SC 31
            System.out.println("SC 31");
            Stream<String> words = Files.lines(Paths.get("data/words.txt"));
            String result = words.parallel().filter(w -> w.length() > 5 && w.contains("a"))
            .findAny().orElse("");

            System.out.println(result);

            // * SC 32
            System.out.println("\nSC 32");
            words = Files.lines(Paths.get("data/words.txt")); 
            System.out.println(words.anyMatch(w -> w.startsWith("q")&& w.endsWith("y")));

            words.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}