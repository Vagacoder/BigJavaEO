package BigJavaCh03;

import javax.swing.*;

public class CarViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		
		frame.setSize(800,600);
		frame.setTitle("Two cars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		CarComponent comp = new CarComponent();
		frame.add(comp);

		frame.setVisible(true);
	}

}
