package ch22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
* P22.1 Write a program Find that searches all files specified on the command line and prints
out all lines containing a reserved word. Start a new thread for each file. For exam­ple,
if you call
java Find Buff report.txt address.txt Homework.java
then the program might print
report.txt: Buffet style lunch will be available at the
address.txt: Buffet, Warren|11801 Trenton Court|Dallas|TX
Homework.java: BufferedReader in;
address.txt: Walters, Winnie|59 Timothy Circle|Buffalo|MI

*/

public class Find implements Runnable{

    // * not used =======================================================
    private String keyword;
    private String filename;

    public Find(String keyword, String filename){
        this.keyword= keyword;
        this.filename = filename;
    }

    @Override
    public void run() {
        try (Scanner fileIn = new Scanner(new File(filename));){
            while(fileIn.hasNextLine()){
                String line = fileIn.nextLine();
                if(line.contains(keyword)){
                    System.out.println(filename + ": " + line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    // * ===============================================================

    public static void main(String[] args) {
        String keyword = args[0];

        for (int i = 1; i < args.length; i++) {
            
            String filename = args[i];

            Thread t = new Thread() {
                public void run() {
                    try (Scanner fileIn = new Scanner(new File(filename));){
                        while(fileIn.hasNextLine()){
                            String line = fileIn.nextLine();
                            if(line.contains(keyword)){
                                System.out.println(filename + ": " + line);
                            }
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                }
            };

            t.start();
        }
    }


}