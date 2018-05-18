package ch03;

import java.awt.*;
import java.awt.geom.*;

public class Star {

	private int x_ini;
	private int y_ini;
	private int size;

	public Star(int x, int y, int size) {

		x_ini = x;
		y_ini = y;
		this.size = size / 2;
	}

	public void draw(Graphics2D g2) {

		Point2D.Double p1 = new Point2D.Double(x_ini, y_ini);
		// Point2D.Double p2 = new Point2D.Double(x_ini + this.size, y_ini);
		// Point2D.Double p3 = new Point2D.Double(x_ini + this.size * 2, y_ini);
		// Point2D.Double p4 = new Point2D.Double(x_ini, y_ini + this.size);
		// Point2D.Double p5 = new Point2D.Double(x_ini + this.size * 2, y_ini +
		// this.size);
		// Point2D.Double p6 = new Point2D.Double(x_ini, y_ini + this.size * 2);
		// Point2D.Double p7 = new Point2D.Double(x_ini + this.size, y_ini + this.size *
		// 2);
		Point2D.Double p8 = new Point2D.Double(x_ini + this.size * 2, y_ini + this.size * 2);

		Line2D.Double l1 = new Line2D.Double(100, 100, 200, 200);
		// Line2D.Double l2 = new Line2D.Double(p3, p7);
		// Line2D.Double l3 = new Line2D.Double(p4, p5);
		// Line2D.Double l4 = new Line2D.Double(p2, p6);

		g2.draw(l1);
		// g2.draw(l2);
		// g2.draw(l3);
		// g2.draw(l4);

	}

}
