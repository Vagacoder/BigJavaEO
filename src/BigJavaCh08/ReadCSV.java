<<<<<<< HEAD
package BigJavaCh08;

public class ReadCSV {
	
	private int row;
	private int column;
	
	public ReadCSV() {
		row =0;
		column =0;
	}
	
	public void addLine(String line) {
		
		row ++;
		column = 1;
		
		for (int i = 0; i< line.length(); i++)
		{
			char character = line.charAt(i);
			if (character == ',') {column++;}
		}
		
	}
	
	public int rows() {
		return row;
	}
	
	public int columns() {
		return column;
	}

}
=======
package BigJavaCh08;

public class ReadCSV {
	
	private int row;
	private int column;
	
	public ReadCSV() {
		row =0;
		column =0;
	}
	
	public void addLine(String line) {
		
		row ++;
		column = 1;
		
		for (int i = 0; i< line.length(); i++)
		{
			char character = line.charAt(i);
			if (character == ',') {column++;}
		}
		
	}
	
	public int rows() {
		return row;
	}
	
	public int columns() {
		return column;
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
