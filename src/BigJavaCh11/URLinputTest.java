<<<<<<< HEAD
package BigJavaCh11;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class URLinputTest {
	
	public static void main(String[] args) throws IOException {

		String link = "http://www.google.com";
		URL uLink = new URL(link);
		Scanner in = new Scanner(uLink.openStream());
		
		String line1 = in.nextLine();
		System.out.println(line1);
		
		in.close();
		
	}
	
}
=======
package BigJavaCh11;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class URLinputTest {
	
	public static void main(String[] args) throws IOException {

		String link = "http://www.google.com";
		URL uLink = new URL(link);
		Scanner in = new Scanner(uLink.openStream());
		
		String line1 = in.nextLine();
		System.out.println(line1);
		
		in.close();
		
	}
	
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
