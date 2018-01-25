package BigJavaCh04;

public class PyramidTester
{
   public static void main(String[] args)
   {
      Pyramid sample = new Pyramid(10, 10);
      System.out.println(sample.getVolume());
      System.out.println("Expected: 333.33");
      System.out.println(sample.getSurfaceArea());
      System.out.println("Expected: 224");

      Pyramid gizeh = new Pyramid(146, 230);
      System.out.println(gizeh.getVolume());
      /* 
         The following estimate is from 
         http://en.wikipedia.org/wiki/Great_Pyramid_of_Giza, citing
         Levy, Janey (2005). The Great Pyramid of Giza: 
         Measuring Length, Area, Volume, and Angles. Rosen 
         Publishing Group. ISBN 1404260595.
      */
      System.out.println("Expected: 2500000");
   }
}
