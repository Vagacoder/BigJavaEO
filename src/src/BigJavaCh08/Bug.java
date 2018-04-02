package BigJavaCh08;

public class Bug
{
   private int row;
   private int column;
   private int direction; // 0 = North, 1 = East, 2 = South, 3 = West
   
   public void moveOneUnit()
   {
      final int NORTH = 0;
      final int EAST = 1;
      final int SOUTH = 2;
      final int WEST = 3;
      
      if (direction == NORTH) { row--; }
      else if (direction == EAST) { column++; }
      else if (direction == SOUTH) { row++; }
      else if (direction == WEST) { column--; }
   }

   public void turnRight() 
   {
      int DIRECTIONS = 4;

      direction++;
      if (direction == DIRECTIONS) { direction = 0; }
   }

   public int getRow() { return row; }
   public int getColumn() { return column; }
}
