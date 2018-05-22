package ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This program demonstrates how to install an action listener.
 */
public class ButtonViewer {
	private static final int FRAME_WIDTH = 100;
	private static final int FRAME_HEIGHT = 60;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me!");
		button.setSize(50, 40);
		frame.add(button);
		
		
		// inner class of click listener as ch10.7.2
		class ClickListener1 implements ActionListener {
			int count =1;
			public void actionPerformed(ActionEvent event) {
				System.out.println(FRAME_WIDTH); // inner class can access private fields of outer class
				System.out.println("I was clicked " + count + " times." );
				count++;
			}
		}

		ActionListener listener = new ClickListener1();
		button.addActionListener(listener);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
