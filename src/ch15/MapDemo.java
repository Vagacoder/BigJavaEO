package ch15;

import java.awt.*;
import java.util.*;

/**
 * This program demonstrates a map that maps names to colors.
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String, Color> favoriteColors = new HashMap<>();
		favoriteColors.put("Juliet", Color.BLUE);
		favoriteColors.put("Romeo", Color.GREEN);
		favoriteColors.put("Adam", Color.RED);
		favoriteColors.put("Eve", Color.BLUE);

		// Print all keys and values in the map

		Set<String> keySet = favoriteColors.keySet();
		for (String key : keySet) {
			Color value = favoriteColors.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
