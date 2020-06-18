package ch21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsefulFileOperations {
   public static void main(String[] args) throws IOException {
      // Getting the size of a file
      Path input = Paths.get("UsefulFileOperations.java");
      long size = Files.size(input);
      System.out.println("Size of " + input + ": " + size + " bytes");

      // Reading all lines
      List<String> lines = Files.readAllLines(input);
      System.out.println("Line 11: " + lines.get(10));

      // Reading all bytes
      byte[] bytes = Files.readAllBytes(input);
      byte[] firstTen = Arrays.copyOf(bytes, 10);
      System.out.println("First ten bytes: " + Arrays.toString(firstTen));
      // Writing lines
      Collections.sort(lines);
      Path output1 = Paths.get(input + ".sorted");
      Files.write(output1, lines);
      System.out.println("Sorting the lines of " + input + " yields " + output1);

      // Writing bytes
      for (int i = 0; i < bytes.length; i++) {
         bytes[i] = (byte) (bytes[i] + 3);
      }
      Path output2 = Paths.get(input + ".caesar");
      Files.write(output2, bytes);
      System.out.println("The Caesar encryption of " + input + " is in " + output2);

      // Reading a file into a string
      String contents = new String(Files.readAllBytes(input), "UTF-8");
      // Writing a string to a file
      Path output3 = Paths.get(input + ".lowercase");
      contents = contents.toLowerCase();
      Files.write(output3, contents.getBytes("UTF-8"));
      System.out.println("The lowercase of " + input + " is in " + output3);

      String target = ";";
      final int MAX_LINES = 10;
      List<String> result = null;
      try (Stream<String> lineStream = Files.lines(input)) {
         result = lineStream.filter(s -> s.contains(target)).limit(MAX_LINES).collect(Collectors.toList());
      }
      System.out.println("The first ten lines containing a semicolon: " + result);

      // Copying and moving
      Path output4 = Paths.get(input + ".copied");
      if (Files.exists(output4)) {
         Files.delete(output4);
      }
      Files.copy(input, output4);
      Path output5 = Paths.get(output4 + ".moved");
      if (Files.exists(output5)) {
         Files.delete(output5);
      }
      Files.move(output4, output5);
      System.out.println(input + " was copied to " + output4 + " which was moved to " + output5);
   }
}
