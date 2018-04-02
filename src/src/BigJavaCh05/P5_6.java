package BigJavaCh05;

public class P5_6 {

	public static void main(String[] args) {

		double xA = 0;
		double yA = 0;
		double xB = 4;
		double yB = 0;
		double xC = 0;
		double yC = 3;

		double lineAB = Math.sqrt((xA - xB) * (xA - xB) + (yA - yB) * (yA - yB));
		double lineBC = Math.sqrt((xB - xC) * (xB - xC) + (yB - yC) * (yB - yC));
		double lineAC = Math.sqrt((xA - xC) * (xA - xC) + (yA - yC) * (yA - yC));

		double cosA = (lineAB * lineAB + lineAC * lineAC - lineBC * lineBC) / (2 * lineAB * lineAC);
		double angleA = Math.acos(cosA);
		System.out.println(angleA / Math.PI);

	}

}
