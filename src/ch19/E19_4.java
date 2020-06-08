package ch19;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * E19.4  Write a program that reads all words from a file and, using a Stream<String>, 
 * prints all distinct words with at most four letters (in some order).
 * 
 */
public class E19_4 {
    
    public static void main(String[] args){
        // String filename = "data/words.txt";
        String filename = "data/war-and-peace.txt";

        List<String> words = new ArrayList<>();
        try(Scanner fileIn = new Scanner(new File(filename))){
            while(fileIn.hasNext()){
                words.add(fileIn.next());
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        Set<String> distinctWords = words.stream().filter(word -> word.length()<=4).
            collect(Collectors.toSet());

        System.out.println(distinctWords.size());
        // for(String word: distinctWords){
        //     System.out.println(word);
        // }
    }
}