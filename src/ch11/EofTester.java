package ch11;

import java.util.Scanner;

public class EofTester {

    // ! in.hasNext(), in.next() block process.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String input = in.next();
            System.out.println(input);
        }
        in.close();
    }
}