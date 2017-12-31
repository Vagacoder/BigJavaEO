package BigJavaCh03;

import java.awt.*;

import javax.swing.*;

public class StarComponent extends JComponent {

	public void paint(Graphics2D g) {

		Graphics2D g2 = (Graphics2D) g;

		// Star star1 = new Star(50, 50, 100);

		Rectangle box = new Rectangle(100, 100, 200, 300);
		// star1.draw(g2);

		g2.fill(box);
	}

}
