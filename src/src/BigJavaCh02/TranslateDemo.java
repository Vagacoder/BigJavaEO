package BigJavaCh02;

import java.awt.*;
import javax.swing.*;

public class TranslateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("Translate Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		TranslateComp comp = new TranslateComp();
		frame.add(comp);
		//frame.setBounds(comp);
				
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		
	}

}
