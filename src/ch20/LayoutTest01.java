package ch20;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * This is testing different layout manager of java swing
 */

public class LayoutTest01 {

	public static void main(String[] args) {

		// first panel of keypad
		// JPanel default layout is flow layout, here we change it to border layout
		JPanel keypadPanel = new JPanel();
		keypadPanel.setLayout(new BorderLayout());
		
		// second panel of buttons
		// set to grid layout (m x n), since all buttons are laid in grids.
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2, 3));
		
		// set and add buttons to button panel
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);

		// now add button panel to center of keypad panel
		keypadPanel.add(buttonPanel, BorderLayout.CENTER);
		
		// set and add display to north of keypad panel
		JLabel display1 = new JLabel("0");
		keypadPanel.add(display1, BorderLayout.NORTH);
		
		// test add 2 components to same area
		// => the later one overlap on the top of first one
		JLabel display2 = new JLabel("1");
		keypadPanel.add(display2, BorderLayout.NORTH);
		
		// create a JFrame and add keypad panel to it
		JFrame frame = new JFrame();
		
		// the default layout of JFrame is border layout, whose components will fill all available space.
		// changing to flow layout will keep the original size of components.
		frame.setLayout(new FlowLayout());
		
		frame.add(keypadPanel);
		
		// set and display the JFrame
		frame.setTitle("LayoutTest01");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);
	}

}
