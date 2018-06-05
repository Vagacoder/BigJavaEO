package ch11;


import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CatchingExceptions
{
   public static void main(String[] args)
   {
      try
      {
         String filename = "test1.txt";
         Scanner in = new Scanner(new File(filename));
         int sum = 0;
         while (in.hasNext())
         {
            String input = in.next();
            int value = Integer.parseInt(input);
            sum = sum + value;
         }
         System.out.println("Sum: " + sum);
      }
      catch (IOException exception)
      {
         exception.printStackTrace();
      }
      catch (NumberFormatException exception)
      {
         System.out.println(exception.getMessage());
      }
   }
}
