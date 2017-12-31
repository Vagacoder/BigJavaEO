package BigJavaCh08;

import java.io.*;
import java.util.*;

public class R8_30 {

	public R8_30() {

	}

	public String readFile() throws FileNotFoundException {
		File inputFile = new File("a.txt");
		Scanner in = new Scanner(inputFile);
		String a = in.next();
		System.out.println(a);
		in.close();
		return a;

	}
}
