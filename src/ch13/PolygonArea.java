
package ch13;

//E13.12
public class PolygonArea {

	public static void main(String[] args) {
		Integer[][] poly1 = { { 0, 0 }, { 1, 1 }, { 1, 2 }, { 0, 3 }, { -1, 2 }, { -1, 1 } };
		Integer[][] poly2 = { { 0, 0 }, { 1, 1 }, { 1, 2 } };

		System.out.println(getPolygonArea(poly1));

	}

	public static double getPolygonArea(Integer[][] poly) {

		if (poly.length < 3) {
			return 0;
		}

		else if (poly.length == 3) {
			return Math.abs(poly[0][0] * poly[1][1] + poly[1][0] * poly[2][1] + poly[2][0] * poly[0][1]
					- poly[0][1] * poly[1][0] - poly[1][1] * poly[2][0] - poly[2][1] * poly[0][0]) / 2.0;
		}

		else {
			double triangleArea = Math.abs(poly[0][0] * poly[1][1] + poly[1][0] * poly[poly.length - 1][1]
					+ poly[poly.length - 1][0] * poly[0][1] - poly[0][1] * poly[1][0]
					- poly[1][1] * poly[poly.length - 1][0] - poly[poly.length - 1][1] * poly[0][0]) / 2.0;
			Integer[][] smallerPoly = new Integer[poly.length - 1][2];
			System.arraycopy(poly, 1, smallerPoly, 0, (poly.length - 1));
			return triangleArea + getPolygonArea(smallerPoly);
		}

	}

}
