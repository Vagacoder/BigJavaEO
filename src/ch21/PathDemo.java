package ch21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
   public static void main(String[] args) {
      Path inputPath = Paths.get("data/input.txt");
      System.out.println("Relative path: " + inputPath);

      Path absolutePath = inputPath.toAbsolutePath();
      System.out.println("Absolute path: " + absolutePath);

      Path parent = absolutePath.getParent();
      System.out.println("Its parent: " + parent);

      Path sibling = parent.resolve("output.txt");
      System.out.println("A sibling: " + sibling);

      Path fileName = sibling.getFileName();
      System.out.println("The sibling's file name: " + fileName);

      System.out.print("The sibling's path components: ");
      for (Path p : sibling) {
         System.out.print(p + " ");
      }
      System.out.println();

      Path changedExtension = sibling.getParent().resolve(
         sibling.getFileName().toString().replace(".txt", ".bak"));
      System.out.println("Changing the extension: " + changedExtension);
   }
}
