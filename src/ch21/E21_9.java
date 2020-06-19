package ch21;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * E21.9 Write a method that, given a Path to a file that doesn’t yet exist, 
 * creates all intermediate directories and the file.

*/
public class E21_9 {

    public static void createFile(Path filepath) {
        ArrayList<Path> paths = new ArrayList<>();
        for (Path p : filepath.toAbsolutePath()) {
            System.out.println(p);
            paths.add(p);
        }

        for (int i = 0; i < paths.size(); i++) {
            String fullpathString = "";
            for (int j = 0; j <= i; j++) {
                fullpathString += (File.separator + paths.get(j).toString());
            }
            System.out.println(fullpathString);

            Path fullpath = Paths.get(fullpathString);
            if (Files.exists(fullpath)) {
                System.out.println("Exists!");
            } else {
                System.out.println("Not exists!!");
                if (i < paths.size() - 1) {
                    System.out.println("Create folder!");
                    try {
                        Files.createDirectory(fullpath);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("Create file!");
                    try {
                        Files.createFile(fullpath);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        createFile(Paths.get("/home/skuller/temp/java/src/Bank.java"));
    }

}