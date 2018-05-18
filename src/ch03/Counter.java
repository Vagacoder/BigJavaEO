package ch03;

/**
   This class models a tally counter.
*/
public class Counter
{
   private int value;
   private int limit;

   /**
      Gets the current value of this counter.
      @return the current value
   */
   public int getValue()
   {
      return value;
   }

   /**
      Advances the value of this counter by 1.
   */
   public void click() 
   {
      value = Math.min(this.limit, value + 1);
   }

   /**
      Resets the value of this counter to 0.
   */
   public void reset()
   {
      value = 0;
   }
   
   public void undo() {
	   
	   value = Math.max(0, value-1);
   }
   
   public void setLimit(int limit) {
	   this.limit = limit;
	   
   }
   
}
