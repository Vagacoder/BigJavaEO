package ch15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// import java.util.Stack;

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

! Note: using queue instead of stack is better to mimic flood behavior.
*/

public class E15_22 {

    public static void main(String[] args) {

        Scanner keyIn = new Scanner(System.in);
        System.out.print("Please enter start row (0-9): ");
        int startRow = keyIn.nextInt();
        System.out.print("Please enter start column (0-9): ");
        int startColumn = keyIn.nextInt();
        keyIn.close();
        if (startRow < 0 || startRow >= 10 || startColumn < 0 || startColumn >= 10) {
            System.out.println("Wrong range");
            System.exit(-1);
        }
        System.out.println();

        // * construct canvas
        int[][] canvas = new int[10][10];
        for (int i = 0; i < 10; i++) {
            canvas[i][0] = 888;
            canvas[i][9] = 888;
        }

        for (int i = 4; i < 7; i++) {
            for (int j = 4; j < 7; j++) {
                canvas[i][j] = 999;
            }
        }

        // Stack<Pair> points = new Stack<>();
        Queue<Pair> pointsQueue = new LinkedList<>();
        int index = 1;
        pointsQueue.add(new Pair(startRow, startColumn));

        while (!pointsQueue.isEmpty()) {
            Pair p = pointsQueue.remove();
            int row = p.row;
            int col = p.col;
            if (canvas[row][col] == 0) {
                canvas[row][col] = index++;

                // * check rounding points
                if (row - 1 >= 0 && canvas[row - 1][col] == 0) {
                    pointsQueue.add(new Pair(row - 1, col));
                }

                if (row + 1 <= 9 && canvas[row + 1][col] == 0) {
                    pointsQueue.add(new Pair(row + 1, col));
                }

                if (col - 1 >= 0 && canvas[row][col - 1] == 0) {
                    pointsQueue.add(new Pair(row, col - 1));
                }

                if (col + 1 <= 9 && canvas[row][col + 1] == 0) {
                    pointsQueue.add(new Pair(row, col + 1));
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%3d]", canvas[i][j]);
            }
            System.out.println();
        }
    }
}