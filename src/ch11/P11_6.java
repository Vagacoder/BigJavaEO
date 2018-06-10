package ch11;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * P11.6 web crawler
 * 
 * @author Skuller
 *
 */

public class P11_6 {

    Queue<String> links = new LinkedList<>();
    int linkNumber = 0;
    int maxLinkNumber;

    /**
     * constructor
     * 
     * @param maxLinkNumber
     *            max link number will be printed
     */
    public P11_6(int maxLinkNumber) {
	this.maxLinkNumber = maxLinkNumber;
    }

    // testing main method
    public static void main(String[] args) throws IOException {

	P11_6 finder = new P11_6(20);
	finder.printHyperLinks("http://swirlstats.com/");
	finder.printHyperLinks("http://dict.cn/");
    }

    /**
     * find the hyperlink (format: a href="http) in link and its all sub-links
     * 
     * @param link
     * @throws IOException
     */
    public void printHyperLinks(String link) throws IOException {
	linkNumber = 0;
	links.add(link);
	do {
	    URL web = new URL(links.remove());
	    Scanner input = new Scanner(web.openStream());
	    while (input.hasNextLine() && linkNumber < maxLinkNumber) {
		String line = input.nextLine();
		// System.out.println(line);
		if (line.contains("a href=\"http")) {
		    int startIndex = line.indexOf("href=\"http") + "href=".length() + 1;
		    int endIndex = line.indexOf("\"", startIndex);
		    String newLink = line.substring(startIndex, endIndex);
		    linkNumber++;
		    System.out.println(linkNumber + ": " + newLink);
		    links.add(newLink);
		}
	    }
	    input.close();
	} while (!links.isEmpty() && linkNumber < maxLinkNumber);

    }

}
