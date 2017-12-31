package BigJavaCh02;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class LineTest01 extends JComponent {

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Point2D.Double p1 = new Point2D.Double(100, 100);
		Point2D.Double p2 = new Point2D.Double(150, 250);
		Point2D.Double p3 = new Point2D.Double(200, 100);

		Line2D.Double line1 = new Line2D.Double(p1, p2);
		g2.setColor(Color.RED);
		g2.draw(line1);

		line1 = new Line2D.Double(p2, p3);
		g2.setColor(new Color(0, 0, 255));
		g2.draw(line1);

		g2.setColor(new Color(255, 0, 255));
		g2.drawString("V", 250, 250);

	}

}
