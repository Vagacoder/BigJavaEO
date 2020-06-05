package ch17;

import java.util.ArrayList;
import java.util.Random;

import ch10.Measurable;

/* 
 * SC 17 Modify the min method to compute the minimum of an array list of elements 
 * that implements the Measurable interface.

 * SC 20 How would you implement the generic average method for arrays?
 * 
 * SC 21 Is it necessary to use a generic average method for arrays of measurable 
 * objects?
*/

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil {
   private static Random generator = new Random();

   /**
    * Creates an array filled with random values.
    * 
    * @param length the length of the array
    * @param n      the number of possible random values
    * @return an array filled with length numbers between 0 and n - 1
    */
   public static int[] randomIntArray(int length, int n) {
      int[] a = new int[length];
      for (int i = 0; i < a.length; i++) {
         a[i] = generator.nextInt(n);
      }

      return a;
   }

   /**
    * Swaps two entries of an array.
    * 
    * @param a the array
    * @param i the first position to swap
    * @param j the second position to swap
    */
   public static void swap(int[] a, int i, int j) {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }

   // * SC 17
   public static <E extends Comparable<E>> E min(ArrayList<E> a){
      if(a.size() == 0){
         return null;
      }
      E min = a.get(0);
      for(int i = 0;i<a.size();i++){
         if(a.get(i).compareTo(min) < 0){
            min = a.get(i);
         }
      }
      return min;
   }

   // * SC20 
   public static <E extends Measurable> double average(E[] a){
      if(a.length == 0){
         return 0.0;
      }else{
         double sum = 0.0;
         for(int i=0; i < a.length; i++){
            sum += a[i].getMeasure();
         }
         return sum/a.length;
      }

   }

   // * SC21
   public static double average(Measurable[] a, int useless){
      if(a.length == 0){
         return 0.0;
      }else{
         double sum = 0.0;
         for(int i = 0; i<a.length; i++){
            sum += a[i].getMeasure();
         }
         return sum/a.length;
      }
   }

}
