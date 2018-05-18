package ch03;

public class CounterDemo
{
   public static void main(String[] args)
   {
      Counter tally = new Counter();
      tally.click();
      tally.click();
      int result = tally.getValue(); // Sets result to 2
      System.out.print("result: ");
      System.out.println(result);
   }
}
