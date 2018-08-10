package ch15;

import java.awt.event.*;

import javax.swing.*;

public class LambdaExpTester {

	public static void main(String[] args) {
		JButton testButton = new JButton("Test Button");
		testButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Click Detected by An Inner Class");
			}
		});
		JFrame frame = new JFrame();
		frame.add(testButton);
		frame.setSize(400, 300);
		frame.setTitle("Test JButton with inner class");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
