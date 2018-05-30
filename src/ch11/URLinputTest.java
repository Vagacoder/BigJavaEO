
package ch11;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLinputTest {

    public static void main(String[] args) throws IOException {

	String link = "http://www.google.com";
	URL uLink = new URL(link);
	Scanner in = new Scanner(uLink.openStream());

	String line1 = in.nextLine();
	System.out.println(line1);
	String line2 = in.nextLine();
	System.out.println(line2);
	line2 = line2.replaceFirst("</", "REPLACED");
	System.out.println(line2);
	line2 = line2.replaceFirst("TIGER", "REPLACED");
	System.out.println(line2);
	in.close();

    }

}
