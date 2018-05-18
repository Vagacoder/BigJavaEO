
package ch11;

import java.io.*;

public class OutputTester {

    public static void main(String[] args) throws FileNotFoundException {

	PrintWriter out = new PrintWriter("output.txt");
	out.println("Hello, World!");

    }

}
