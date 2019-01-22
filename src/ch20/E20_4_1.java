package ch20;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ch20.E20_4.buttonListener;

public class E20_4_1 {
	
	
	public static void main(String[] args) {
		
		class buttonListener implements ActionListener{
			int red, green, blue =0;
			JCheckBox redB, greenB, blueB;
			JPanel panel;
			
			public buttonListener(JCheckBox redB, JCheckBox greenB, JCheckBox blueB, JPanel panel) {
				this.redB = redB;
				this.greenB = greenB;
				this.blueB = blueB;
				this.panel = panel;
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
				
				panel.setBackground(new Color(red, green, blue));
				
			}
		}
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JCheckBox redB = new JCheckBox("Red");
		JCheckBox greenB = new JCheckBox("Green"); 
		JCheckBox blueB = new JCheckBox("Blue");
		
		ActionListener al = new buttonListener(redB, greenB, blueB, panel);
		redB.addActionListener(al);
		greenB.addActionListener(al);
		blueB.addActionListener(al);

		panel.add(redB);
		panel.add(greenB);
		panel.add(blueB);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setTitle("E20_4_1");
		frame.setVisible(true);
	}
}
