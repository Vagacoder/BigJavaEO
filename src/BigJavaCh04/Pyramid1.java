package BigJavaCh04;

/**
   This class describes pyramids with a square base.
*/
public class Pyramid1
{
   private double height;
   private double baseLength;

   /**
      Constructs a pyramid with a given height and baselength.
      @param theta the angle of ground and line of 2 surfaces. 
      @param baseLength the length of one of the sides of the square base
   */
   public Pyramid1(double theta, double baseLength)
   {
      this.height = baseLength * Math.sqrt(2) /2 * Math.tan(theta);
      this.baseLength = baseLength;
   }

   /**
      Gets the volume of this pyramid.
      @return the volume
   */
   public double getVolume()
   {
      return height * baseLength * baseLength / 3;
   }

   /**
      Gets the surface area of this pyramid.
      @return the surface area, not including the base
   */
   public double getSurfaceArea()
   {
      double sideLength = Math.sqrt(height * height 
         + baseLength * baseLength / 4);
      return 2 * baseLength * sideLength;
   }
}
