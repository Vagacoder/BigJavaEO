package ch11;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ClosingResources
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File inFile = new File("test1.txt");
      File outFile = new File("output.txt");
      try (Scanner in = new Scanner(inFile); PrintWriter out = new PrintWriter(outFile))
      {
         while (in.hasNextLine())
         {
            String result = process(in.nextLine());
            out.println(result);
         }
      } // Both in.close() and out.close() are called here
   }

   public static String process(String line)
   {
      int value = Integer.parseInt(line);
      value++;
      return "" + value;
   }
}
