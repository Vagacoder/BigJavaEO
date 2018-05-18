package others;

import java.io.*;

public class FilePathTester {

    public static void main(String[] args) {
	File workingFolder = new File("C:\\Users\\Skuller\\CS105\\BigJavaEO\\src\\BigJavaCh03");
	File[] listOfFiles = workingFolder.listFiles();

	File testFile = listOfFiles[3];

	System.out.print(testFile.getPath());

    }

}
