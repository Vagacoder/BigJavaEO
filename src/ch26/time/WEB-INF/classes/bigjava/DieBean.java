package bigjava;

import java.util.Random;

/* 
 * E26.2 Write a JSF application that simulates two rolls of a die, producing an 
 * output such as “Rolled a 4 and a 6”. When the user reloads the page, a new pair 
 * of values should be displayed. Provide a bean that yields random numbers.
 * 
 */

public class DieBean {
   
    public DieBean(){

    }

    public String getRolls(){
        Random r = new Random();
        int r1 = r.nextInt(6) + 1;
        int r2 = r.nextInt(6) + 1;
        return "Rolled a " +r1 +" and a " +r2;
    }

}