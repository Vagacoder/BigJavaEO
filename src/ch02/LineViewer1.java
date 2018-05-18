package ch02;

import javax.swing.*;

public class LineViewer1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(800, 800);
		frame.setTitle("Two squares with same center");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LineTest01 squares = new LineTest01();
		frame.add(squares);
		frame.setVisible(true);

	}

}
