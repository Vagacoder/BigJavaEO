package ch10;

import javax.swing.*;

/**
 * This program moves the rectangle.
 */
public class RectangleViewer {
    public static void main(String[] args) {
	RectangleFrame frame = new RectangleFrame();
	// frame.randomShape();
	// frame.randomShape();
	// frame.randomShape();
	frame.setTitle("An animated rectangle");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}
