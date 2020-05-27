package ch15;

/*
* E15.22 In a paint program, a “flood fill” fills all empty pixels of a drawing 
with a given color, stopping when it reaches occupied pixels. In this exercise, 
you will implement a simple variation of this algorithm, flood-filling a 10 × 10 
array of integers that areinitially 0.

    Prompt for the starting row and column.
    Push the (row, column) pair onto a stack.

You will need to provide a simple Pair class.

Repeat the following operations until the stack is empty.
    Pop off the (row, column) pair from the top of the stack.
    If it has not yet been filled, fill the corresponding array location with a 
    number 1, 2, 3, and so on
        (to show the order in which the square is filled).
    Push the coordinates of any unfilled neighbors in the north, east, south, or west direction on the stack.

    When you are done, print the entire array.


*/

public class Pair {
    
    int row;
    int col;
    // int i;

    public Pair(int row, int col){
        this.row = row;
        this.col = col;
        // this.i = index;
    }

}