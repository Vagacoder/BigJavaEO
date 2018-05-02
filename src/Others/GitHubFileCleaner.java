package Others;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class GitHubFileCleaner {

    public static void main(String[] args) throws IOException {
	File workingFolder = new File("C:\\Users\\Skuller\\CS105\\BigJavaEO\\src\\BigJavaCh10");
	File[] listOfFiles = workingFolder.listFiles();

	// cleanFile(listOfFiles[3]);

	for (File file : listOfFiles) {
	    if (!file.isHidden() && !file.isDirectory()) {
		List<String> result = cleanFile(file);
		if (result != null) {
		    PrintWriter out = new PrintWriter(file.getPath());

		    for (String str : result) {
			out.println(str);
		    }

		    out.close();
		}
	    }
	}

	System.out.println("Cleaning complete!");

    }

    public static List<String> cleanFile(File file) throws IOException {

	List<String> fileStrings = Files.readAllLines(Paths.get(file.toURI()));

	// System.out.println(fileStrings.get(1));

	int indexOfHead = 0;
	int indexOfSplit = 0;
	int indexOfEnd = 0;

	for (int i = 0; i < fileStrings.size(); i++) {
	    String line = fileStrings.get(i);
	    if (line.startsWith("<<<<<<<")) {
		indexOfHead = i;
	    } else if (line.startsWith("=======")) {
		indexOfSplit = i;
	    } else if (line.startsWith(">>>>>>>")) {
		indexOfEnd = i;
	    }
	}

	if (indexOfEnd != 0) {

	    for (int i = 0; i <= (indexOfEnd - indexOfSplit); i++) {
		fileStrings.remove(indexOfSplit);
	    }
	    fileStrings.remove(indexOfHead);

	    return fileStrings;
	    // List<String> newFileStrings = new ArrayList<String>();
	    // for (int i = indexOfHead + 1; i < indexOfSplit; i++) {
	    // newFileStrings.add(fileStrings.get(i));
	    // }
	    //
	    // return newFileStrings;

	    // for (String str : newFileStrings) {
	    // System.out.println(str);
	    // }
	}
	// else {
	// System.out.println("Cleaned!");
	// }
	return null;

    }

}
