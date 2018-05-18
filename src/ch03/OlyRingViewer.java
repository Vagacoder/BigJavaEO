package ch03;

import java.awt.Color;

import javax.swing.*;

public class OlyRingViewer {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setSize(800,600);
		frame.setBackground(Color.white);
		frame.setTitle("Olympic Rings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		OlyRingComponent comp = new OlyRingComponent();
		frame.add(comp);

		frame.setVisible(true);

	}

}
