package ch21;

import java.io.FileInputStream;
import java.io.InputStream;

/*
 * E21.1 Write a program that opens a binary file and prints all ASCII characters 
 * from that file, that is, all bytes with values between 32 and 126. Print a new 
 * line after every 64 characters. What happens when you use your program with \
 * word processor docu­ments? With Java class ­files?

*/
public class E21_1 {


    public static void main(String[] args) {

        try (InputStream instream = new FileInputStream("src/ch21/R21_2.java")) {
            boolean done = false;
            StringBuilder sb = new StringBuilder();
            while (!done) {
                int next = instream.read();
                if(next == -1){
                    done = true;
                }else{
                   sb.appendCodePoint(next);
                }
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}