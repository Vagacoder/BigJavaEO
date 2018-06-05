package ch11;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptions
{  
   public static void main(String[] args)
   {
      try
      {
         int result = readData("fred.txt");
         System.out.println("result: " + result);
      }
      catch (IOException exception) 
      {
         System.out.println(exception.getMessage());
      }
   }

   public static int readData(String filename) throws FileNotFoundException
   {
      File inFile = new File(filename);
      Scanner in = new Scanner(inFile);
      int sum = 0;
      while (in.hasNextInt())
      {
         sum = sum + in.nextInt();
      }
      return sum;
   }
}
