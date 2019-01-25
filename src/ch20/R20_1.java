package ch20;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

/*
 *  R20.1 Can you use a flow layout for the components in a frame? If yes, how?
 *  
 *  R20.5 What happens when you add a button to a container that uses a border layout and
 * omit the position? Try it out and explain.

 * R20.6 What happens when you try to add a button to another button? Try it out and
 * explain.

 */
public class R20_1 {

	private JFrame frame;
	
	public R20_1() {
		frame = new JFrame();
		
		//frame.setLayout(new FlowLayout());
		
		JButton button1 = new JButton("Click!");
		JButton button2 = new JButton("Apply");
		JButton button3 = new JButton("Cancel");
		JButton button4 = new JButton("Ok");

		// R20.6 result in a button on another button
		button1.add(button2);
		
		// R20.5 if missed layout position information, the component will be placed at center
		frame.add(button1);
		
//		frame.add(button1, BorderLayout.NORTH);
//		frame.add(button2, BorderLayout.SOUTH);
//		frame.add(button3, BorderLayout.EAST);
//		frame.add(button4, BorderLayout.WEST);
		
		
		frame.setTitle("R20.1");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		R20_1 frame = new R20_1();

	}

}
