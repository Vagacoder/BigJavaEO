package ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// E10.18 and E10.19 using 2 different ActionListeners

public class ButtonViewer1 {

	public static void main(String[] args) {
		
		// inner class of mouse click listener
		class ClickListenerA implements ActionListener{

			int count = 1;
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("I was clicked Button A " + count + " times!");
				count++;	
			}
		}
		
		class ClickListenerB implements ActionListener{

			int count = 1;
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("I was clicked Button B " + count + " times!");
				count++;	
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
		
		ActionListener cl1 = new ClickListenerA();
		ActionListener cl2 = new ClickListenerB();
		
		button1.addActionListener(cl1);
		button2.addActionListener(cl2);
		
		frame.add(panel);
		frame.setSize(400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}

}
