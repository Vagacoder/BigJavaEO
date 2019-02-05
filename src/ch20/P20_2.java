package ch20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * P20.2 Write a graphical application for computing statistics of a data set. Supply a text
 * field and button for adding floating-point values, and display the current minimum,
 * maximum, and average in a label.
 */

public class P20_2 {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel;
	private JTextField inputField;
	private JButton button;
	private JLabel outputLabelMin;
	private JLabel outputLabelMax;
	private JLabel outputLabelAverage;
	private double min = 0;
	private double max = 0;
	private int count = 0;
	private double total = 0;
	
	public P20_2() {
		frame = new JFrame();
		frame.setTitle("P20.2");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		inputLabel = new JLabel("Please enter number:");
		inputField = new JTextField(20);
		panel.add(inputLabel);
		panel.add(inputField);
		
		button = new JButton("Add number");
		button.addActionListener(new buttonListener());
		
		panel.add(button);
		
		outputLabelMin = new JLabel("Minimum number is: ");
		outputLabelMax = new JLabel("Maximum number is: ");
		outputLabelAverage = new JLabel("Average is: ");
		
		panel.add(outputLabelMin);
		panel.add(outputLabelMax);
		panel.add(outputLabelAverage);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	
	class buttonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			double inputNumber = Double.parseDouble(inputField.getText());
			if (count ==0) {
				min = inputNumber;
				max = inputNumber;
				total = inputNumber;
			} else {
				if (inputNumber < min) {
					min = inputNumber;
				}
				if (inputNumber > max) {
					max = inputNumber;
				}
				total += inputNumber;
			}
			count++;
			double average = 0;
			if(count != 0) {
				average = total/count;
			} 
			outputLabelMin.setText("Minimum number is: " + min);
			outputLabelMax.setText("Maximum number is: " + max);
			outputLabelAverage.setText("Average is: " + average);
		}
		
	}
	

	public static void main(String[] args) {
		
		P20_2 frame = new P20_2();
	}

}
