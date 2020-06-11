package ch19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import ch13.Palindromes;

/*
 * E19.14 Read all words from a file into an ArrayList<String>, then turn it into 
 * a parallel stream. Use the dictionary file words.txt provided with the book’s 
 * companion code. Use filters and the findAny method to find any palindrome that 
 * has at least five letters, then print the word. What happens when you run the 
 * program multiple times?
 * 
 */

public class E19_14 {

    public static void main(String[] args) {
        String filename = "data/words.txt";

        ArrayList<String> words = new ArrayList<>();
        try (Scanner fileIn = new Scanner(new File(filename));) {
            
            while(fileIn.hasNextLine()){
                String word = fileIn.nextLine();
                words.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String firstP = words.parallelStream().filter(w -> w.length() >= 5)
                .filter(Palindromes::isPalindrome).findAny().orElse("");
        
        System.out.println(firstP);
    }
}