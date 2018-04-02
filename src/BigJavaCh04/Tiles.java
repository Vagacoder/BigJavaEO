package BigJavaCh04;

import java.util.*;

public class Tiles {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Total width: ");
		int totalWidth = in.nextInt();
		System.out.print("Tile width: ");
		int tileWidth = in.nextInt();

		int numberOfPairs = (totalWidth - tileWidth) / (2 * tileWidth);
		int numberOfTiles = 1 + 2 * numberOfPairs;
		double gap = (totalWidth - numberOfTiles * tileWidth) / 2.0;

		System.out.println("Number of tiles: " + numberOfTiles);
		System.out.println("Gap at each end: " + gap);
	}
}
