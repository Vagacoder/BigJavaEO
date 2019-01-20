package ch20;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import ch20.E20_3.buttonListener;

/*
 * Exercise 20_4
 * Write an application with three check boxes labeled “Red”, “Green”, and “Blue”
that adds a red, green, or blue component to the background color of a panel in the
center of the frame. This application can display a total of eight color combinations.
 */

public class E20_4 {
	JFrame frame1 = new JFrame();
	JPanel panel1 = new JPanel();
	JCheckBox redB = new JCheckBox("Red");
	JCheckBox greenB = new JCheckBox("Green"); 
	JCheckBox blueB = new JCheckBox("Blue");
	
	class buttonListener implements ActionListener{
		int red, green, blue =0;
		
		public buttonListener() {
			
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (redB.isSelected()) {
				red = 255;
			} else {
				red =0;
			}
			if (greenB.isSelected()) {
				green = 255;
			} else {
				green =0;
			}
			if (blueB.isSelected()) {
				blue =255;
			} else {
				blue =0;
			}
			
			panel1.setBackground(new Color(red, green, blue));
			
		}
	}
	
	public E20_4(){

		ActionListener al = new buttonListener();
		redB.addActionListener(al);
		greenB.addActionListener(al);
		blueB.addActionListener(al);

		panel1.add(redB);
		panel1.add(greenB);
		panel1.add(blueB);
		
		frame1.add(panel1);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(400, 300);
		frame1.setTitle("E20_4");
		frame1.setVisible(true);


		
	}

	public static void main(String[] args) {
		
		E20_4 frame = new E20_4();
	}

}
