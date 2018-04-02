package BigJavaCh02;

public class BorderMaker {
	public static void main(String[] args) {
		Picture pic = new Picture();
		pic.load("C:\\Users\\Skuller\\eclipse-workspace\\Test\\src\\edu\\sbcc\\cs105\\queen-mary.png");
		int newWidth = pic.getWidth() - 40;
		int newHeight = pic.getHeight() - 40;
		// pic.scale(newWidth, newHeight);
		pic.scale(200, 200);
		// pic.move(20, 20);
		// pic.border(10);
	}
}
