package ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// E10.20, using 1 ActionListeners

public class ButtonViewer2 {

	public static void main(String[] args) {
		
		// inner class of mouse click listener, 2 counters for Button A and B
		class ClickListener3 implements ActionListener{

			int countA = 1;
			int countB = 1;
			@Override
			public void actionPerformed(ActionEvent event) {
				JButton button = (JButton) event.getSource();
				if (button.getText().equals("Button A")) {
				System.out.println("I was clicked Button A " + countA + " times!");
				countA++;	}
				else if (button.getText().equals("Button B")) {
					System.out.println("I was clicked Button B " + countB + " times!");
					countB++;	}
				
			}
		}
		

		
		JFrame frame = new JFrame();
		JButton button1 = new JButton("Button A");
		JButton button2 = new JButton("Button B");
		JLabel label1 = new JLabel();
		label1.setText("Click Button A");
		JLabel label2 = new JLabel();
		label2.setText("Click Button B");
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(label1);
		panel.add(button2);
		panel.add(label2);
		
		ActionListener cl1 = new ClickListener3();
		ActionListener cl2 = new ClickListener3();
		
		button1.addActionListener(cl1);
		button2.addActionListener(cl2);
		
		frame.add(panel);
		frame.setSize(400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}

}
