package ch02;

import javax.swing.*;

public class FrameTest03 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(600, 800);
		frame.setTitle("Hello Worlds!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FrameTest02 boxes = new FrameTest02();
		frame.add(boxes);

		frame.setVisible(true);

	}

}
