package ch02;

import javax.swing.*;

public class FrameTest01 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("Testing frame #1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JFrame frame1 = new JFrame();
		frame1.setSize(1000, 500);
		frame1.setTitle("Hello Kitty is here!");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);

	}

}
