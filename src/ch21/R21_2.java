package ch21;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/*
 * R21.2 Write a few lines of text to a new PrintWriter("output1.txt", "UTF-8") 
 * and the same text to a new  PrintWriter("output2.txt", "UTF-16"). 
 * How do the output files differ?

 ! Open them in a hex editor, such as Bless Hex Editor, to see the difference

 *
*/
public class R21_2 {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        PrintWriter p1 = new PrintWriter("data/utf8out.txt", "UTF-8");
        p1.println("Hello world");
        p1.close();

        PrintWriter p2 = new PrintWriter("data/utf16out.txt", "UTF-16");
        p2.println("Hello world");
        p2.close();

    }
}