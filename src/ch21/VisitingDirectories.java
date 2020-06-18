package ch21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VisitingDirectories
{
   public static void main(String[] args) throws IOException
   {
      Path startingDirectory = Paths.get("VisitingDirectories.java").toAbsolutePath();
      Path grandParent = startingDirectory.getParent().getParent();
      try (Stream<Path> entries = Files.list(grandParent))
      {
         List<Path> paths = entries.collect(Collectors.toList());
         System.out.println("Entries in " + grandParent + ": " + paths);
      }
   
      try (Stream<Path> entries = Files.list(grandParent))
      {
         List<String> result = entries
            .map(p -> p.getFileName().toString())
            .filter(s -> s.contains("section_"))
            .map(s -> s.replace("section_", "Section ").replace("_", "."))
            .collect(Collectors.toList());
         System.out.println("Sections with sample code: " + result);
      }
   }
}
