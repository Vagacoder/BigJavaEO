package BigJavaCh02;

import java.awt.*;
import javax.swing.*;

public class paint extends JComponent {

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(255, 0, 0));
		g2d.drawString("Hello world", 100, 100);
		

	}

}
