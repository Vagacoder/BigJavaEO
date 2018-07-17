package ch14;

import java.util.*;

import org.apache.commons.lang3.*;

/**
 * Class of DirComparator for P14.1
 * 
 * @author Skuller
 *
 */
public class DirComparator implements Comparator<String> {

    @Override
    public int compare(String dir1, String dir2) {
	if (!StringUtils.isNumeric(dir1.substring(dir1.length() - 1))
		|| !StringUtils.isNumeric(dir2.substring(dir2.length() - 1))) {
	    return dir1.compareTo(dir2);
	} else {
	    int index1 = 0;
	    for (int i = dir1.length() - 1; i > 0; i--) {
		String currentCha = dir1.substring(i, i + 1);
		String frontCha = dir1.substring(i - 1, i);
		if (StringUtils.isNumeric(currentCha) && !StringUtils.isNumeric(frontCha)) {
		    index1 = i;
		    break;
		}
	    }
	    int index2 = 0;
	    for (int i = dir2.length() - 1; i > 0; i--) {
		String currentCha = dir2.substring(i, i + 1);
		String frontCha = dir2.substring(i - 1, i);
		if (StringUtils.isNumeric(currentCha) && !StringUtils.isNumeric(frontCha)) {
		    index2 = i;
		    break;
		}
	    }

	    String str1 = dir1.substring(0, index1);
	    int number1 = Integer.parseInt(dir1.substring(index1, dir1.length()));
	    String str2 = dir2.substring(0, index2);
	    int number2 = Integer.parseInt(dir2.substring(index2, dir2.length()));

	    if (!str1.equals(str2)) {
		return dir1.compareTo(dir2);
	    } else {
		return number1 - number2;
	    }
	}
    }
}
