package BigJavaCh03;

import javax.swing.*;

public class StarViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(800, 600);
		frame.setTitle("Stars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		StarComponent stars = new StarComponent();
		frame.add(stars);

		frame.setVisible(true);

	}

}
