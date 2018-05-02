package BigJavaCh04;

import java.util.*;

public class FilePath {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the Drive: ");
		String drive = in.next();
		
		System.out.print("Please enter the path: ");
		String path = in.next();
		
		System.out.print("Please enter the file name: ");
		String file = in.next();
		
		System.out.println(drive + ":" + path + "\\" + file);
		
		in.close();

	}

}
