package ch15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// E15.5

public class FindJavaIdentifier {
	
	HashMap<String, List<String>> idMap = new HashMap<>();

	public FindJavaIdentifier() {
	}

	public void importJavaFile(String javaFile) {
		try {
			Scanner in = new Scanner(new File(javaFile));
			while(in.hasNextLine()) {
				String line = in.nextLine();
				String[] ids = line.split("[^A-za-z0-9_]+");
				for(String id : ids) {
					if (idMap.containsKey(id)) {
						List<String> oldList = idMap.get(id);
						oldList.add(line);
						idMap.put(id, oldList);
					} else {
						List<String> newList = new LinkedList<>();
						newList.add(line);
						idMap.put(id, newList);
					}
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

	}
	
	public void printIdLines(String id) {
		if (idMap.containsKey(id)) {
			System.out.println(idMap.get(id));
		} else {
			System.out.println("Not such identifier!");
		}
	}

	public void printAllIdLInes() {
		for (String key : idMap.keySet()) {
			System.out.printf("%s: ", key);
			System.out.println(idMap.get(key));
		}
	}
}
