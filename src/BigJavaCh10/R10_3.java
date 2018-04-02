package BigJavaCh10;

import java.util.*;

public class R10_3 {

	public static void main(String[] args) {

		/**
		 * R10_3_C c = new R10_3_C(); R10_3_I i; R10_3_J j;
		 * 
		 * c = (R10_3_C) i; j = c; i = (R10_3_I) j;
		 */

		/**
		 * R10_3_I i = new R10_3_C(); R10_3_J j = (R10_3_J) i;
		 */

		// R10_3_I i = null;
		// R10_3_C c = new R10_3_C();
		// Quiz q = new Quiz(100, "A");
		// i = c;

		String[] s1 = { "b", "A", "Cart", "cape", "cart" };
		System.out.println(s1[0]);
		Arrays.sort(s1);
		System.out.println(s1[0]);

		R10_3_I i = new R10_3_C();
		R10_3_C c1 = (R10_3_C) i;

	}

}
