
package BigJavaCh02;

import javax.swing.*;

public class JCpainter {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 800);
		frame.setTitle("Testing frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NameComponent comp = new NameComponent();
		 frame.add(comp);
		 
		 frame.setVisible(true);

	}

}
