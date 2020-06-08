package ch19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/*
 * R19.1  Provide expressions that compute the following information about a Stream<String>. 
 *  a. How many elements start with the letter a?
 *  b. How many elements of length greater than ten start with the letter a?
 *  c. Are there at least 100 elements that start with the letter a? (Don’t count them all 
 *      if there are more.)
 * 
 * R19.2  How can you collect five long words (that is, with more than ten letters) 
 * from an ArrayList<String> without using streams? Compare your solution with the 
 * code fragment in Section 19.1. Which is easier to understand? Why?
 * 

 */
public class R19_1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File("data/countries.txt"));
        List<String> list = new ArrayList<>();
        while(fileIn.hasNextLine()){
            String line = fileIn.nextLine().toLowerCase();
            // System.out.println(line);
            list.add(line);
        }

        System.out.println("a: " + list.stream().filter(w -> w.startsWith("a")).count());
        System.out.println("b: " + list.stream().filter(w -> w.startsWith("a") && w.length() > 10).count());
        System.out.println("c: " + list.stream().filter(w -> w.startsWith("a")).limit(100).count());

        int count = 0;
        for(String s : list){
            if(s.length() == 5){
                count++;
            }
        }
        System.out.println("R19.2: " + count);
    }
}