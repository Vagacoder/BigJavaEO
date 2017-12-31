package BigJavaCh02;

import java.awt.*;

import javax.swing.*;

public class TwoSquareComponent extends JComponent {

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box1 = new Rectangle(100, 100, 600, 600);
		g2.setColor(Color.RED);
		g2.fill(box1);

		box1 = new Rectangle(200, 200, 400, 400);
		g2.setColor(Color.blue);
		g2.fill(box1);

	}

}
