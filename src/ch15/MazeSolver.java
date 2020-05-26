package ch15;

import java.util.*;

/**
 * This program uses a stack to find a path from a position in a maze to an
 * exit. It is assumed that the maze has no circular paths, and that there is at
 * least one exit.
 */
public class MazeSolver {

	/**
	 * Traverses a maze, printing out a path to the exit.
	 * 
	 * @param maze  the maze
	 * @param param the row of the starting position
	 * @param param the column of the starting position
	 */
	public static void solve(Maze maze, int row, int column) {
		Stack<Path> s = new Stack<>();
		for (Path p : maze.pathsFrom(row, column)) {
			s.push(p);
		}

		while (s.size() > 0) {
			Path p = s.pop();
			System.out.println("Following " + p);
			int r = p.getEndingRow();
			int c = p.getEndingColumn();
			if (maze.isExit(r, c)) {
				System.out.println("Exit!");
				return;
			} else if (maze.isDeadEnd(r, c)) {
				System.out.println("Dead end");
			} else {
				for (Path p2 : maze.pathsFrom(r, c)) {
					if (!p2.isOpposite(p)) {
						s.push(p2);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Maze maze = new Maze(new String[] { 
			"*****************************", 
			"** ***                      *",
			"** *** * ********************", 
			"** *** *         *          *", 
			"** *** * *******   **** *****",
			"**     * ************** *****", 
			"****** ******* *******  *****", 
			"******         ******* ******",
			"*      ******* ******* ******", 
			"* **** ******* **           *", 
			"*    ********* ******* ******",
			"* ****         ***     ******", 
			"************** **************" });

		solve(maze, 5, 8);
	}
}
