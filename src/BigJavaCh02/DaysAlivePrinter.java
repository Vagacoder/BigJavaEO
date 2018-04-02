package BigJavaCh02;

public class DaysAlivePrinter
{
   public static void main(String[] args)
   {
      Day jamesGoslingsBirthday = new Day(1955, 5, 19);
      Day today = new Day();
      System.out.print("Today: ");
      System.out.println(today.toString());
      int daysAlive = today.daysFrom(jamesGoslingsBirthday);
      System.out.print("Days alive: ");
      System.out.println(daysAlive);
   }
}
