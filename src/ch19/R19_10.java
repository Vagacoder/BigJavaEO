package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

/*
 * R19.10  Suppose you want to find the length of the longest string in a stream. 
 * Describe two approaches: using mapToInt followed by the max method of the 
 * IntStream class, and calling the max method of Stream<String>. What are the 
 * advantages and disadvantages of each approach?

 */
public class R19_10 {

    public static void main(String[] args) {
        String filename = "data/words.txt";

        try {
            Stream<String> words = Files.lines(Paths.get(filename));
            int length = words.mapToInt(w -> w.length()).max().orElse(-1);
            System.out.println("1. Longest: " + length);
            words.close();
            
            Stream<String> words1 = Files.lines(Paths.get(filename));
            length = words1.max(Comparator.comparing(String::length)).orElse("").length();
            System.out.println("2. Longest: " + length);
            words1.close();

            Stream<String> words2 = Files.lines(Paths.get(filename));
            length = words2.max((s1, s2) -> s1.length() - s2.length()).orElse("").length();
            System.out.println("3. Longest: " + length);
            words2.close();            
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}