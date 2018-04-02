package BigJavaCh02;

import java.awt.*;
import javax.swing.*;

public class TranslateComp extends JComponent {
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle box = new Rectangle(10, 20, 40, 60);
		g2.draw(box);
		box.setBounds(box);
		box.translate(100, 200);
		g2.draw(box);
		
	}

}
