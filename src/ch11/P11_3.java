package ch11;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * P11.3
 * @author qhu
 *
 */
public class P11_3 {

	public static void main(String[] args) throws IOException {
		
		URL webUrl = new URL("http://horstmann.com/index.html");
		Scanner in = new Scanner(webUrl.openStream());
		PrintWriter out = new PrintWriter("webpage.html");
		while(in.hasNextLine()){
			String line = in.nextLine();
			out.println(line);
		}
		in.close();
		out.close();
	}

}
