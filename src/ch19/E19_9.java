package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/*
 * E19.9 Write a program that reads in words from a file and prompts the user for 
 * another word. Print the longest word from the file that contains the given word, 
 * or "No match" if the word does not occur in the file. Use the max method of 
 * Stream<String>.
 * 
 * 
 */

public class E19_9 {

    public static void main(String[] args) {
        String filename = "data/words.txt";

        try {
            Stream<String> words = Files.lines(Paths.get(filename));

            Scanner keyIn = new Scanner(System.in);
            System.out.print("please enter a word: ");
            String inputWord = keyIn.next();
            keyIn.close();

            System.out.println(words.filter(w -> w.contains(inputWord))
                                .max((a, b)-> a.length() - b.length())
                                .orElse("No match")
                                );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}