package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * E19.16  Read all words in a file and group them by the first letter (in lowercase). 
 * Print the average word length for each initial letter. 
 * Use collect and Collectors.groupingBy.
 * 
 */
public class E19_16 {

    public static void main(String[] args) throws IOException {
        String filename = "data/words.txt";

        Stream<String> words = Files.lines(Paths.get(filename));

        Map<String, Double> result = words.map(w -> w.toLowerCase()).collect(Collectors.groupingBy(
            w -> w.substring(0,1),
            Collectors.averagingInt(w -> w.length())
        ));

        System.out.println(result);
        words.close();
    }

}