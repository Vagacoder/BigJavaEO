package BigJavaCh02;

import java.awt.*;
import javax.swing.*;

public class NameComponent extends JComponent {
	
	public void paint(Graphics g) {
		Graphics2D g2 =  (Graphics2D) g;
		g2.setColor(Color.red);
		g2.drawString("Qirui Hu", 200, 300);
		
		Rectangle box = new Rectangle(195, 285, 55, 20);
		g2.setColor(Color.blue);
		g2.draw(box);
		
		
		
	}
	
	

}
