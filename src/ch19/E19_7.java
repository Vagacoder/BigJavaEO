package ch19;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * E19.7 Write a lambda expression for a function that turns a string into a string 
 * made of the first letter, three periods, and the last letter, such as "W...d". 
 * (Assume the string has at least two letters.) Then write a program that reads 
 * words into a stream, applies the lambda expression to each element, and prints 
 * the result. Filter out any words with fewer than two letters.

 */
public class E19_7 {
    
    public static void main(String[] args){
        String filename = "data/words.txt";
        try(Stream<String> linestream = Files.lines(Paths.get(filename))){

            List<String> words = linestream.filter(w -> w.length()>=2)
                .map(w -> w.charAt(0) + "..." + w.charAt(w.length()-1))
                .collect(Collectors.toList());
        
            for(String w: words){
                System.out.println(w);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}