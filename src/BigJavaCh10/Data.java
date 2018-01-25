package BigJavaCh10;

public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }
   
   public static Measurable max(Measurable[] objects){
	   
	   int index = 0;
	   double max = objects[0].getMeasure();
	   for (int i = 0 ; i < objects.length; i++) {
		   
		   if (objects[i].getMeasure() > max) {
			   max = objects[i].getMeasure();
			   index = i;
		   }
	   }
	   return objects[index];
   }
}
