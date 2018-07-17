package ch14;

import java.util.*;

import org.apache.commons.lang3.*;

/**
 * for P14.2
 * 
 * @author Skuller
 *
 */

public class FileComparator implements Comparator<String> {

    @Override
    public int compare(String file1, String file2) {
	// file1 and file2 starting with string
	if (!StringUtils.isNumeric(file1.substring(0, 1)) && !StringUtils.isNumeric(file2.substring(0, 1))) {
	    ArrayList<String> group1 = findGroups(file1);
	    ArrayList<String> group2 = findGroups(file2);

	    // make sure 2 lists are same size
	    if (group1.size() < group2.size()) {
		for (int i = 0; i < group2.size() - group1.size(); i++) {
		    group1.add("0");
		}
	    } else {
		for (int i = 0; i < group1.size() - group2.size(); i++) {
		    group2.add("0");
		}
	    }

	    // compare first group, string group
	    if (!group1.get(0).equals(group2.get(0))) {
		return group1.get(0).compareTo(group2.get(0));
	    }

	    // compare other groups
	    for (int i = 1; i < group1.size(); i++) {
		int number1 = Integer.parseInt(group1.get(i));
		int number2 = Integer.parseInt(group2.get(i));
		if (number1 != number2) {
		    return number1 - number2;
		}
	    }
	    return 0;
	}

	// file1 and file2 starting with number
	else if (StringUtils.isNumeric(file1.substring(0, 1)) && StringUtils.isNumeric(file2.substring(0, 1))) {
	    ArrayList<String> group1 = findGroups(file1);
	    ArrayList<String> group2 = findGroups(file2);
	    if (group1.size() < group2.size()) {
		for (int i = 0; i < group2.size() - group1.size(); i++) {
		    group1.add("0");
		}
	    } else {
		for (int i = 0; i < group1.size() - group2.size(); i++) {
		    group2.add("0");
		}
	    }

	    // compare other groups
	    for (int i = 1; i < group1.size(); i++) {
		int number1 = Integer.parseInt(group1.get(i));
		int number2 = Integer.parseInt(group2.get(i));
		if (number1 != number2) {
		    return number1 - number2;
		}
	    }
	    return 0;
	}

	// other cases
	else {
	    return file1.compareTo(file2);
	}

    }

    // helper method, find groups from file name. Return a list of groups.
    public ArrayList<String> findGroups(String file) {

	ArrayList<String> result = new ArrayList<>();

	boolean stringFound;
	if (StringUtils.isNumeric(file.substring(0, 1))) {
	    stringFound = true;
	} else {
	    stringFound = false;
	}

	int startIndex = -1;

	for (int i = 0; i < file.length(); i++) {
	    // find first group : string group
	    if (!stringFound && StringUtils.isNumeric(file.substring(i, i + 1))) {
		result.add(file.substring(0, i));
		stringFound = true;
		startIndex = i;
		if (i == file.length() - 1) {
		    result.add(file.substring(i));
		}
	    } else if (stringFound && StringUtils.isNumeric(file.substring(i, i + 1)) && startIndex < 0) {
		startIndex = i;
		if (i == file.length() - 1) {
		    result.add(file.substring(i));
		}
	    } else if (stringFound && StringUtils.isNumeric(file.substring(i, i + 1)) && startIndex >= 0
		    && i == file.length() - 1) {
		result.add(file.substring(startIndex, i + 1));
		startIndex = -1;
	    } else if (stringFound && !StringUtils.isNumeric(file.substring(i, i + 1)) && startIndex >= 0) {
		result.add(file.substring(startIndex, i));
		startIndex = -1;
	    } else if (!stringFound && !StringUtils.isNumeric(file.substring(i, i + 1)) && i == file.length() - 1) {
		result.add(file);
	    } else {
		continue;
	    }

	}
	// String[] a = new String[result.size()];
	// result.toArray(a);
	return result;
    }

}
