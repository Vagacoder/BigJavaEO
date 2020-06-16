package ch21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * P21.1 Random monoalphabet cipher. The Caesar cipher, which shifts all letters 
 * by a fixed amount, is far too easy to crack. Here is a better idea. For the key, 
 * don’t use num­bers but words. Suppose the keyword is FEATHER. Then first remove 
 * duplicate let­ters, yielding FEATHR, and append the other letters of the alphabet 
 * in reverse order. 
 * Write a program that encrypts or decrypts a file using this cipher. The keyword 
 * is specified with the -k command line option. The -d command line option specifies 
 * decryption. 
  
 ! usage:

 ?  java src/ch21/RandomCipher -e -k FEATHER data/hello.txt data/ehello.txt

 ?  java src/ch21/RandomCipher -d -k FEATHER data/ehello.txt data/dhello.txt
 
 * decrypts a file using the keyword FEATHER. It is an error not to supply a keyword.
 
 ! Did not implement arguments checking, so that must exactly follow format above.
*/
public class RandomCipher {

    private static String removeDup(String input) {
        String result = "";

        Out: for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == c) {
                    continue Out;
                }
            }
            result += c;
        }
        return result;
    }

    private static void encryptStream(InputStream inS, OutputStream outS, boolean isEncryption, String key)
            throws IOException {

        String letterList = getEncryptionList(key);
        // System.out.println(letterList);

        boolean done = false;
        if (isEncryption) {
            while (!done) {
                int next = inS.read();
                if (next == -1) {
                    done = true;
                } else if (next >= 97 && next <= 122) {
                    outS.write(letterList.charAt(next - 97));
                } else if (next >= 65 && next <= 90) {
                    outS.write(letterList.charAt(next - 65));
                } else {
                    outS.write(next);
                }
            }
        }else{
            while (!done){
                int next = inS.read();
                if (next == -1) {
                    done = true;
                } else if(next >= 65 && next <= 90){
                    StringBuilder sb = new StringBuilder();
                    sb.appendCodePoint(next);
                    int indexInList = letterList.indexOf(sb.toString());
                    outS.write(indexInList+65);
                }else {
                    outS.write(next);
                }
            }
        }
    }

    private static String getEncryptionList(String key) {
        String fullList = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

        for (int i = 0; i < key.length(); i++) {
            String c = "" + key.charAt(i);
            // System.out.println(c);
            fullList = fullList.replace(c, "");
        }

        return key + fullList;
    }

    public static void main(String[] args) {

        String method = args[0];
        boolean encryption = false;
        if (method.equals("-e")) {
            encryption = true;
        } else if (method.equals("-d")) {
            encryption = false;
        } else {
            System.out.println("First argument must be -e or -d");
            System.exit(1);
        }

        String key = args[2];

        String sourceFilename = args[3];
        String outputFilename = args[4];

        key = removeDup(key.toUpperCase());
        System.out.println(key);

        try (InputStream sourceStream = new FileInputStream(sourceFilename);
                OutputStream outputStream = new FileOutputStream(outputFilename)) {
            encryptStream(sourceStream, outputStream, encryption, key);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}