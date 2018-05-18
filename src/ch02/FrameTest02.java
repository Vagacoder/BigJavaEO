package ch02;

import java.awt.*;

import javax.swing.*;

public class FrameTest02 extends JComponent {

	public void paintComponent(Graphics g) {
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box1 = new Rectangle(50, 100, 200, 450);
		g2.draw(box1);

		// box1.translate(150, 250);

		box1 = new Rectangle(300, 400, 200, 200);
		g2.draw(box1);

		// Rectangle box2 = new Rectangle(100, 75, 250, 250);

		// g2.draw(box2);

	}

}
