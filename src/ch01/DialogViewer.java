package ch01;

import javax.swing.JOptionPane;

public class DialogViewer {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println(name);
	}
}