package ch22;


import java.util.Date;

/**
   A runnable that repeatedly prints a greeting.
*/
public class GreetingRunnable implements Runnable
{
   private static final int REPETITIONS = 10;
   private static final int DELAY = 1000;

   private String greeting;
   private int delayTime;

   /**
      Constructs the runnable object.
      @param aGreeting the greeting to display
   */
   public GreetingRunnable(String aGreeting, int delay)
   {
      greeting = aGreeting;
      delayTime = delay;
   }

   public void run()
   {
      try
      {
         for (int i = 1; i <= REPETITIONS; i++)
         {
            Date now = new Date();
            System.out.println(now + " " + greeting);
            Thread.sleep(delayTime);         
         }
      }
      catch (InterruptedException exception)
      {
         exception.printStackTrace();
      }
   }
}
