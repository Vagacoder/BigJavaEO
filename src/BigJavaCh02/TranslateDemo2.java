package BigJavaCh02;

import java.awt.*;
import javax.swing.*;

public class TranslateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("Translate Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Rectangle box = new Rectangle(10, 20, 60, 80);
		frame.setBounds(box);
		
		JOptionPane.showMessageDialog(frame, "Click OK to continue");

		box.translate(100, 200);
		frame.setBounds(box);

	}

}
