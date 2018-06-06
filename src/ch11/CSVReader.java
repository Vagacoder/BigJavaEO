package ch11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


/**
 * P11.4
 * @author qhu
 *
 */
public class CSVReader {
	
	List<String> wholeFile;
	
	public CSVReader(String fileName) throws IOException {
		wholeFile = Files.readAllLines(Paths.get(fileName));
	}
	
	public int numberOfRows() {
		return wholeFile.size();
	}

	public int numnberOfFields(int row) {

		String line = wholeFile.get(row);
		String[] lineSplits = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		return lineSplits.length;
	}
	
	public String field(int row, int col) {
		String line = wholeFile.get(row);
		String[] lineSplits = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		return lineSplits[col];
	}
}
