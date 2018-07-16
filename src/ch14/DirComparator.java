package ch14;

import java.util.*;

import org.apache.commons.lang3.*;

public class DirComparator implements Comparator<String> {

    @Override
    public int compare(String dir1, String dir2) {
	if (!StringUtils.isNumeric(dir1.substring(dir1.length() - 1))
		|| !StringUtils.isNumeric(dir2.substring(dir2.length() - 1))) {
	    return dir1.compareTo(dir2);
	} else {

	    for (int i = dir1.length() - 1; i > 0; i--) {
		String currentCha = dir1.substring(i, dir1.length() - 1);
		String frontCha = dir1.substring(i - 1, dir1.length() - 1);
		if (StringUtils.isNumeric(currentCha) && !StringUtils.isNumeric(frontCha)) {

		}
	    }

	    return 0;
	}
    }
}
