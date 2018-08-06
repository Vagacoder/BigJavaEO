package ch15;

import java.util.*;

/**
 * A maze has its walls marked by * characters and corridors by spaces. It can
 * classify corridor points as dead ends, intersections, or exits, and it can
 * extend paths from one intersection to another. The maze is assumed not to
 * have any cycles (i.e., paths returning to their own start.)
 */
public class Maze {
	private String[] cells;

	/**
	 * Constructs a maze from a string describing its contents.
	 * 
	 * @param contents strings consisting of * and spaces
	 */
	public Maze(String[] contents) {
		cells = contents;
	}

	/**
	 * Gets all paths emanating from a position in the maze.
	 * 
	 * @param row    the row of the position
	 * @param column the column of the position
	 * @return all paths emanating from the position
	 */
	public ArrayList<Path> pathsFrom(int row, int column) {
		ArrayList<Path> paths = new ArrayList<>();
		if (isValid(row - 1, column)) {
			paths.add(new Path(row, column, Path.NORTH));
		}
		if (isValid(row, column + 1)) {
			paths.add(new Path(row, column, Path.EAST));
		}
		if (isValid(row + 1, column)) {
			paths.add(new Path(row, column, Path.SOUTH));
		}
		if (isValid(row, column - 1)) {
			paths.add(new Path(row, column, Path.WEST));
		}
		for (Path p : paths) {
			extend(p);
		}
		return paths;
	}

	/**
	 * Extends this path to the next exit, intersection, or dead end.
	 * 
	 * @param p the path to extend
	 */
	private void extend(Path p) {
		boolean done = false;
		while (!done) {
			p.move();
			int row = p.getEndingRow();
			int column = p.getEndingColumn();
			if (isExit(row, column) || countNeighbors(row, column) != 2) {
				done = true; // Either a straight path or a turn
			} else {
				row = p.getNextRow();
				column = p.getNextColumn();
				if (!isValid(row, column)) {
					p.turn();
					row = p.getNextRow();
					column = p.getNextColumn();
					if (!isValid(row, column)) {
						p.turn();
						p.turn();
					}
				}
			}
		}
	}

	/**
	 * Checks whether a position is an exit.
	 * 
	 * @param row    the row of the position
	 * @param column the column of the position
	 * @return true if the position is an exit
	 */
	public boolean isExit(int row, int column) {
		return (row == 0 || row == cells.length - 1 || column == 0 || column == cells[row].length() - 1)
				&& cells[row].charAt(column) == ' ';
	}

	/**
	 * Checks whether a position is a dead end.
	 * 
	 * @param row    the row of the position
	 * @param column the column of the position
	 * @return true if the position is a dead end
	 */
	public boolean isDeadEnd(int row, int column) {
		return countNeighbors(row, column) == 1;
	}

	/**
	 * Checks whether a position is within the maze and not a wall.
	 * 
	 * @param row    the row of the position
	 * @param column the column of the position
	 * @return true if the position is valid
	 */
	private boolean isValid(int row, int column) {
		return 0 <= row && row < cells.length && 0 <= column && column < cells[row].length()
				&& cells[row].charAt(column) == ' ';
	}

	/**
	 * Counts the neighbors of a position.
	 * 
	 * @param row    the row of the position
	 * @param column the column of the position
	 * @return the number of neighbors in the four compass directions that are
	 *         within the maze and not walls.
	 */
	private int countNeighbors(int row, int column) {
		int count = 0;
		if (isValid(row - 1, column)) {
			count++;
		}
		if (isValid(row + 1, column)) {
			count++;
		}
		if (isValid(row, column - 1)) {
			count++;
		}
		if (isValid(row, column + 1)) {
			count++;
		}
		return count;
	}
}
