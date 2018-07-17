package ch14;

import java.util.*;

public class P14_2 {

    public static void main(String[] args) {
	FileComparator fc = new FileComparator();
	// ArrayList<String> a = fc.findGroups("dir10_6_19");
	ArrayList<String> a = fc.findGroups("Text");
	System.out.println(a);

	String dir1 = "Text1_4";
	String dir2 = "Text2";
	String dir3 = "Text3";
	String dir4 = "Text12";
	String dir5 = "Text11";
	String dir6 = "Text1_3";
	String dir7 = "Text1";
	String dir8 = "Tex3";
	String dir9 = "Text";
	String dir10 = "Tex";
	String dir11 = "1234";
	String[] slist = { dir1, dir2, dir3, dir4, dir5, dir6, dir7, dir8, dir9, dir10, dir11 };
	// String[] slist = { dir1, dir6 };
	Arrays.sort(slist, fc);
	System.out.println(Arrays.toString(slist));
    }

}
