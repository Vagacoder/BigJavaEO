package ch10;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * P10.24
 * @author qhu
 *
 */
public class DrawCircle {

	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("Please enter the x coordiante");
		String y = JOptionPane.showInputDialog("Please enter the y coordiante");
		String r = JOptionPane.showInputDialog("Please enter the r coordiante");
		double cor_x = Double.parseDouble(x);
		double cor_y = Double.parseDouble(y);
		double radius = Double.parseDouble(r);
		
		JFrame frame = new JFrame();
		CircleComponent circle = new CircleComponent(cor_x, cor_y, radius);
		frame.add(circle);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Draw a circle");
		frame.setVisible(true);
		

	}

}
