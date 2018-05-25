package ch10;

import javax.swing.*;

/**
 * P10.15
 * 
 * @author Skuller
 *
 */
public class ScrollingMessageViwer {

    public static void main(String[] args) {

	// simple test ================

	// JFrame frame = new JFrame();
	// JLabel label1 = new JLabel("Hello");
	//
	// frame.add(label1);
	//
	// frame.setLocation(200, 50);
	//
	// frame.setSize(300, 100);
	// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// frame.setVisible(true);
	// label1.setLocation(100, 50);
	// label1.repaint();

	// ==============================
	JFrame frame = new ScrollingMessageFrame("Welcome!");
	frame.setTitle("A Scrolling Message");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);

    }

}
