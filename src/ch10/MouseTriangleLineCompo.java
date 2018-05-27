package ch10;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

/**
 * P10.16
 * 
 * @author Skuller
 *
 */
public class MouseTriangleLineCompo extends JComponent {

    private Line2D.Double line;

    public MouseTriangleLineCompo(int x, int y, int width, int height) {

	line = new Line2D.Double(x, y, width, height);
    }

    @Override
    public void paintComponent(Graphics g) {
	Graphics2D g2 = (Graphics2D) g;
	g2.draw(line);
    }
}
