package ch09;


public class Vehicle
{
   private int numberOfTires;

   public int getNumberOfTires() 
   {
      return numberOfTires; 
   }

   public void setNumberOfTires(int newValue) 
   { 
      numberOfTires = newValue;
   }

   public String getDescription()
   {
      return "A vehicle with " + numberOfTires + " tires";
   }
}
