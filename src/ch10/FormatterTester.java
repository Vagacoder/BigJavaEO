package ch10;

import java.util.*;

public class FormatterTester {

    public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
	// Send all output to the Appendable object sb
	Formatter formatter = new Formatter(sb, Locale.US);

	// Explicit argument indices may be used to re-order output.
	formatter.format("%4$2s  %1$2s   %2$2s%1$3s", "a", "b", "c", "d");
	System.out.println(formatter);

    }

}
