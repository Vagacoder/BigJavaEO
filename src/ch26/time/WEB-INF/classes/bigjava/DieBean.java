package bigjava;

import java.util.Random;

/* 
 * E26.2 Write a JSF application that simulates two rolls of a die, producing an 
 * output such as “Rolled a 4 and a 6”. When the user reloads the page, a new pair 
 * of values should be displayed. Provide a bean that yields random numbers.
 * 
 * E26.3 Enhance Exercise E26.2 by producing a web page that shows images of the 
 * rolled dice. Find GIF images of dice with numbers 1 through 6 on the front, 
 * and generate an HTML page that references the appropriate images. 
 * Hint: Use the tag <h:graphic­­ Image value=imageURL/> and take advantage of the 
 * fact that you can embed a value expression into regular text, such as 
 * "/image#{expression}.gif".
 * 
 */

public class DieBean {
   
    private int r1;
    private int r2;

    public DieBean(){
        
    }
    
    public String getRolls(){
        Random r = new Random();
        r1 = r.nextInt(6) + 1;
        r2 = r.nextInt(6) + 1;
        return "Rolled a " +r1 +" and a " +r2;
    }

    public int getR1(){
        return r1;
    }

    public int getR2(){
        return r2;
    }

}