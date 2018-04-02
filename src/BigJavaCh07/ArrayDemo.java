package BigJavaCh07;

import java.util.Scanner;

public class ArrayDemo
{
   public static void main(String[] args)
   {
      // An array of five values, initialized in a loop

      int[] values = new int[5];
      for (int i = 0; i < values.length; i++)
      {
         values[i] = 2 * i;
      }

      // An array of four strings, with initial values specified

      String[] names = { "Fred", "Amy", "Cindy", "Henry" };

      // These loops print the elements in both arrays

      for (int i = 0; i < values.length; i++)
      {
         System.out.print(values[i] + " ");
      }
      System.out.println();

      for (int i = 0; i < names.length; i++)
      {
         System.out.print(names[i] + " ");
      }
      System.out.println();

      // When you copy an array variable, you get another reference 
      // to the same array. (See Section 7.1.2.)

      int[] copy = values;
      values[0] = 42; 
         // We change values[0], which is the same as copy[0]

      for (int i = 0; i < copy.length; i++)
      {
         System.out.print(copy[i] + " ");
      }
      System.out.println();

      // Here, we read numbers into a partially filled array.
      // (See Section 7.1.4.)

      System.out.println("Enter scores, -1 to quit: ");
      Scanner in = new Scanner(System.in);
      boolean done = false;
      int currentSize = 0;
      final int LENGTH = 100;
      int[] scores = new int[LENGTH];

      while (!done && currentSize < LENGTH)
      {
         int score = in.nextInt();
         if (score == -1)
         {
            done = true;
         }
         else
         {
            scores[currentSize] = score;
            currentSize++;
         }
      }

      System.out.println("You entered the following scores:");
      for (int i = 0; i < currentSize; i++)
      {
         System.out.print(scores[i] + " ");
      }
      System.out.println();      
   }
}
