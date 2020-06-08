package ch19;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * E19.3 Write a program that reads all lines from a file and, using a Stream<String>, 
 * prints all lines containing the word “the”.
 * 
*/

public class E19_3 {

    public static void main(String[] args) throws FileNotFoundException {
        // String filename = "data/war-and-peace.txt";
        String filename = "data/words.txt";
        
        try(Stream<String> lineStream = Files.lines(Paths.get(filename))){
            List<String> lines =lineStream.filter(l -> l.contains("the")).collect(Collectors.toList());

            System.out.println(lines.size());
            // for(String line : lines){
            //     System.out.println(line);
            // }

        }catch(Exception e){
            e.printStackTrace();
        }

        

        
    }
}