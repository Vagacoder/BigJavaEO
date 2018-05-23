package ch10.java8_note_5;

import java.awt.event.*;

import javax.swing.*;

/**
 * This program demonstrates how to install an action listener using a function
 * expression.
 */
public class ButtonViewer {
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;

    public static void main(String[] args) {
	JFrame frame = new JFrame();
	JButton button = new JButton("Click me!");
	frame.add(button);

	button.addActionListener((ActionEvent event) -> System.out.println("I was clicked."));
	frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }
}
