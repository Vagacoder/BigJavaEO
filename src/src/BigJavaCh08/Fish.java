package BigJavaCh08;

public class Fish
{
   private int hungry;
   public static final int NOT_HUNGRY = 0;
   public static final int SOMEWHAT_HUNGRY = 1;
   public static final int VERY_HUNGRY = 2;  
   
   public void eat()
   {
      System.out.println("Yum!");
      hungry = NOT_HUNGRY;      
   }

   public void move()
   {
      if (hungry == VERY_HUNGRY)
      {
	 System.out.println("Looking for food");
      }
      else
      {
	 System.out.println("Looking for love");
         hungry++;
      }
   }
}
