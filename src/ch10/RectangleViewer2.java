package ch10;

import javax.swing.*;

/**
 * This program displays a rectangle that can be moved with the mouse.
 */
public class RectangleViewer2 {
    public static void main(String[] args) {
	JFrame frame = new RectangleFrame2();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}
