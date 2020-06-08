package ch19;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/*
 * E19.1 Write a program that reads all lines from a file and, using a Stream<String>, 
 * prints how many of them contain the word “the”.
 * 
 * E19.2 Write a program that reads all words from a file and, using a Stream<String>, 
 * prints how many of them are the word “the”.
 * 
 * 
*/

public class E19_1 {

    public static void main(String[] args) {
        String filename = "data/war-and-peace.txt";

        try (Stream<String> lineStream = Files.lines(Paths.get(filename))) {
            long lines = lineStream.filter(line -> line.contains("the")).count();
            System.out.println("E19.1 lines: " + lines);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<String> words = new ArrayList<>();
        try (Scanner fileIn = new Scanner(new File(filename))){
            while(fileIn.hasNext()){
                String word = fileIn.next();
                words.add(word);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("E19.2 words: " + words.stream().filter(w -> w.contains("the")).count());

    }
}