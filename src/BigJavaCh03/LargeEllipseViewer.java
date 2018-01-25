package BigJavaCh03;

import javax.swing.*;

public class LargeEllipseViewer {

	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(600, 1200);
		int width = frame.getWidth();
		int height = frame.getHeight();
		frame.setTitle("Large Ellipse in a Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LargeEllipse component = new LargeEllipse(width-15, height-40);
		
		frame.add(component);
		frame.setVisible(true);

	}

}
