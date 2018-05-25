package ch10;

import java.util.*;

/**
 * E10.14 and E10.15
 * 
 * @author Skuller
 *
 */
public class Grid {

    // inner class
    class Location {
	private int row;
	private int col;

	public Location(int row, int col) {
	    this.row = row;
	    this.col = col;
	}

	public int getRow() {
	    return row;
	}

	public int getCol() {
	    return col;
	}

    }

    String[][] data;

    public Grid(int numRows, int numColumns) {
	data = new String[numRows][numColumns];
    }

    public Grid() {
	data = new String[10][10];
    }

    private void ensureCapacity(int row, int column) {
	int dataRows = data.length;
	int dataCols = data[0].length;

	if (dataRows < row) {
	    String[][] newData = new String[(int) (dataRows * 1.5 + 1)][dataCols];
	    System.arraycopy(data, 0, newData, 0, dataRows);
	    data = newData;
	    dataRows = data.length;
	}

	if (dataCols < column) {
	    String[][] newData1 = new String[dataRows][(int) (dataCols * 1.5 + 1)];
	    for (int i = 0; i < data.length; i++) {
		String[] newRow = new String[(int) (dataCols * 1.5 + 1)];
		System.arraycopy(data[i], 0, newRow, 0, dataCols);
		newData1[i] = newRow;
		data = newData1;
	    }
	}
    }

    public void add(int row, int column, String description) {
	ensureCapacity(row, column);
	data[row][column] = description;
    }

    public String getDescription(int row, int column) {
	if (row >= data.length || column >= data[0].length) {
	    return "Out of range";
	} else {
	    return data[row][column];
	}
    }

    public ArrayList<Location> getDescribedLocations(String description) {
	ArrayList<Location> result = new ArrayList<>();

	for (int i = 0; i < data.length; i++) {
	    String[] rowString = data[i];
	    for (int j = 0; j < rowString.length; j++) {
		if (data[i][j].equals(description)) {
		    Location loc = new Location(i, j);
		    result.add(loc);
		}
	    }
	}
	return result;
    }
}
