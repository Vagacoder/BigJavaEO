package BigJavaCh02;

import java.awt.Color;
import javax.swing.JFrame;

public class ShowColor {
	

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		Color myColor = new Color(145, 245, 75);
		frame.getContentPane().setBackground(myColor);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
}
}