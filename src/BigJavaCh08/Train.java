package BigJavaCh08;

public class Train
{
   private double distanceFromTerminus;

   public void move(double distanceMoved)
   {
      distanceFromTerminus = distanceFromTerminus + distanceMoved;
   }

   public double getPosition()
   {
      return distanceFromTerminus;
   }
}
