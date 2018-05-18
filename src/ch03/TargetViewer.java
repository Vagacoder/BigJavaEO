package ch03;

import javax.swing.*;

public class TargetViewer {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setTitle("Bulle's Eye - Target");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TargetComponent component = new TargetComponent();
		
		frame.add(component);
		frame.setVisible(true);
		
	}

}
