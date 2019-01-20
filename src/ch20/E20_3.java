package ch20;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * chapter 20 exercise 3
 * Write an application with three radio buttons labeled “Red”, “Green”, and “Blue”
that changes the background color of a panel in the center of the frame to red, green,
or blue.
 */

public class E20_3 {
	
	JFrame frame1 = new JFrame();
	JPanel panel1 = new JPanel();
	JRadioButton redB = new JRadioButton("Red");
	JRadioButton greenB = new JRadioButton("Green"); 
	JRadioButton blueB = new JRadioButton("Blue");
	
	class buttonListener implements ActionListener{
		
		public buttonListener() {
			
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (redB.isSelected()) {
				panel1.setBackground(new Color(255, 0, 0));
			} else if (greenB.isSelected()) {
				panel1.setBackground(new Color(0, 255, 0));
			} else if (blueB.isSelected()) {
				panel1.setBackground(new Color(0, 0, 255));
			}
			
		}
	}
	
	public E20_3(){

		ActionListener al = new buttonListener();
		redB.addActionListener(al);
		greenB.addActionListener(al);
		blueB.addActionListener(al);
		
		ButtonGroup bgroup1 = new ButtonGroup();
		bgroup1.add(redB);
		bgroup1.add(greenB);
		bgroup1.add(blueB);
		panel1.add(redB);
		panel1.add(greenB);
		panel1.add(blueB);
		
		frame1.add(panel1);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(400, 300);
		frame1.setTitle("E20_3");
		frame1.setVisible(true);


		
	}

	public static void main(String[] args) {
		
		E20_3 frame = new E20_3();
	}

}
