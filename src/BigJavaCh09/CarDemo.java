<<<<<<< HEAD
package BigJavaCh09;


public class CarDemo
{
   public static void print(Car c)
   {
      System.out.println(c.getDescription());
      System.out.println("Tires: " + c.getNumberOfTires());
   }

   public static void main(String[] args)
   {
      Car aPlainCar = new Car(); 
      print(aPlainCar); 

      Car aLimo = new Car(); 
      aLimo.setLicensePlateNumber("W00H00"); 
      aLimo.setNumberOfTires(8);
      print(aLimo);
   }
}
=======
package BigJavaCh09;


public class CarDemo
{
   public static void print(Car c)
   {
      System.out.println(c.getDescription());
      System.out.println("Tires: " + c.getNumberOfTires());
   }

   public static void main(String[] args)
   {
      Car aPlainCar = new Car(); 
      print(aPlainCar); 

      Car aLimo = new Car(); 
      aLimo.setLicensePlateNumber("W00H00"); 
      aLimo.setNumberOfTires(8);
      print(aLimo);
   }
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
