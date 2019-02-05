package ch20;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * E20.10 Write a graphical application simulating a bank account. Supply text fields and buttons 
 * for depositing and withdrawing money, and for displaying the current balance in a label.
 */

public class E20_10 {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel;
	private JTextField inputField;
	private JButton depositButton;
	private JButton withdrawButton;
	private JTextField displayField;
	private double balance;
	
	
	public E20_10() {
		
		frame = new JFrame();
		frame.setTitle("E20.10 bank account");
		frame.setSize(250, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		inputLabel = new JLabel("Please enter amount ");
		inputField = new JTextField(15);
		depositButton = new JButton("Deposite");
		depositButton.addActionListener(new buttonListener("Deposite"));
		withdrawButton = new JButton("Withdraw");
		withdrawButton.addActionListener(new buttonListener("Withdraw"));
		displayField = new JTextField(15);
		balance = 0;
		
		panel.setLayout(new BorderLayout());
		JPanel panelNorth = new JPanel();
		panelNorth.add(inputLabel);
		
		JPanel panelCenter = new JPanel();
		panelCenter.add(inputField);
		panelCenter.add(depositButton);
		panelCenter.add(withdrawButton);		
		panelCenter.add(displayField);
		panel.add(panelNorth, BorderLayout.NORTH);
		panel.add(panelCenter,BorderLayout.CENTER);

		
		frame.add(panel);
		frame.setVisible(true);
		
	}
	
	class buttonListener implements ActionListener{

		private boolean deposite;
		buttonListener(String type){
			if (type.equals("Deposite")) {
				deposite = true;
			} else {
				deposite = false;
			}
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (deposite == true) {
				balance += Double.parseDouble(inputField.getText());
			} else {
				balance -= Double.parseDouble(inputField.getText());
			}
			displayField.setText(""+balance);
		}
		
	}

	public static void main(String[] args) {
		E20_10 frame = new E20_10();

	}

}
