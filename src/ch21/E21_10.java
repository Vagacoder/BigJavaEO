package ch21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * E21.10 Write a method public static void swap(Path p, Path q) that swaps two 
 * files. Hint: Use a temporary file.
*/

public class E21_10 {

    public static void swap(Path p1, Path p2) {
        try {
            Path temp = Paths.get("/tmp/swapfile.tmp");
            Files.copy(p1, temp);
            Files.delete(p1);
            Files.copy(p2, p1);
            Files.delete(p2);
            Files.copy(temp, p2);
            Files.delete(temp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void swap1(Path p1, Path p2){
        try {
            byte[] bytes1 = Files.readAllBytes(p1);
            byte[] bytes2 = Files.readAllBytes(p2);
            Files.write(p1, bytes2);
            Files.write(p2, bytes1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        swap1(Paths.get("data/p1.txt"), Paths.get("data/p2.txt"));
    }
}