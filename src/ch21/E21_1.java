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
        // try (InputStream instream = new FileInputStream("data/document1.docx")) {
            boolean done = false;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (!done) {
                int next = instream.read();

                // * print ascII from 32 to 126
                if(next == -1){
                    done = true;
                    continue;
                }else if(next >= 32 && next <= 126){
                   sb.appendCodePoint(next);
                }

                // * print new line every 64 chars
                if(i != 0 && i%64 == 0){
                    sb.append("\n");
                }
                i++;
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}