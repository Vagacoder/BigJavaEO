package ch14;

import java.util.*;

public class P14_1 {

    public static void main(String[] args) {
	String dir1 = "Text1";
	String dir2 = "Text2";
	String dir3 = "Text3";
	String dir4 = "Text11";
	String dir5 = "Text12";
	String dir6 = "Text";
	String dir7 = "Te10";
	String dir8 = "Tex3";
	String[] slist = { dir1, dir2, dir3, dir4, dir5, dir6, dir7, dir8 };

	DirComparator dc = new DirComparator();
	Arrays.sort(slist, dc);
	System.out.println(Arrays.toString(slist));

    }

}
