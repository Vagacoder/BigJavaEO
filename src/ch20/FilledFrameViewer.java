package ch20;

import javax.swing.JFrame;

public class FilledFrameViewer {

	public static void main(String[] args) {
		JFrame frame = new FilledFrame();
		frame.setTitle("A frame with two components");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
