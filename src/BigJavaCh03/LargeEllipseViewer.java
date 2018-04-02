<<<<<<< HEAD
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
=======
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
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
