package BigJavaCh02;

import javax.swing.*;

public class TwoSquareViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(800, 800);
		frame.setTitle("Two squares with same center");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TwoSquareComponent squares = new TwoSquareComponent();
		frame.add(squares);
		frame.setVisible(true);

	}

}
