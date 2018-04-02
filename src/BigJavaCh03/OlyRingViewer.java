<<<<<<< HEAD
package BigJavaCh03;

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
=======
package BigJavaCh03;

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
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
