package BigJavaCh13;

import java.io.*;

public class FileFinderDemo {
    public static void main(String[] args) {
	File startingDirectory = new File("/home/myname");
	FileFinder finder = new FileFinder(startingDirectory);
	finder.find(".java");
    }
}
