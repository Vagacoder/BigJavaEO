package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * E19.15  Read all words in a file and group them by length. Print out how many 
 * words of each length are in the file. Use collect and Collectors.groupingBy.

 */

public class E19_15 {

    public static void main(String[] args) {
        String filename = "data/words.txt";

        try {
            Stream<String> words = Files.lines(Paths.get(filename));
            System.out.println(words.collect(Collectors.groupingBy(
                w -> w.length(), 
                Collectors.counting()
                )));
            words.close();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }

}