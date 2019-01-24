package ch20;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
Write an application with a Color menu and menu items labeled “Red”, “Green”,
and “Blue” that change the background color of a panel in the center of the frame to
red, green, or blue.
 */

//!@#! Note: the JFrame background change is not visible, I have to change the background of JPanle
// which is added to JFrame
public class E20_6 {

	private JFrame frame;
	private JPanel panel;
	private int red = 0, green = 0, blue = 0;
	
	// constructor
	public E20_6() {
		frame = new JFrame();
		panel = new JPanel();
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Color");
		
		JMenuItem red = new JMenuItem("Red");
		JMenuItem green = new JMenuItem("Green");
		JMenuItem blue = new JMenuItem("Blue");
		red.addActionListener(new cml("Red"));
		green.addActionListener(new cml("Green"));
		blue.addActionListener(new cml("Blue"));
		
		menu.add(red);
		menu.add(green);
		menu.add(blue);
		
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		frame.add(panel);
		frame.setTitle("E20.6");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
		frame.setVisible(true);
		
	}
	
	// enumeration for codes of code: RGB from 0 to 255
	public enum ColorCode {
		Red, Green, Blue
	}
	
	// inner class of action listener to change the frame background color
	class cml implements ActionListener {

		private ColorCode color;
		
		// constructor with parameter of a string of color
		public cml(String color) {
			if (color.equals("Red")) {
				this.color = ColorCode.Red;
			} else if (color.equals("Green")) {
				this.color = ColorCode.Green;
			} else if (color.equals("Blue")) {
				this.color = ColorCode.Blue;
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (color == ColorCode.Red) {
				red = 255;
				green = 0;
				blue = 0;
			}
			if (color == ColorCode.Green) {
				red = 0;
				green = 255;
				blue = 0;
			}
			if (color == ColorCode.Blue) {
				red = 0;
				green = 0;
				blue = 255;
			}
			
			panel.setBackground(new Color(red, green, blue));
		}
		
	}
	
	
	// main method to run
	public static void main(String[] args) {
		
		E20_6 frame = new E20_6();
	}
	
}
