package ch03;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
//import javax.swing.*;

public class Car{
	
	private int xLeft;
	private int yTop;
	private Color color;
	private int size = 1;
	
	public Car(int x, int y, Color color, int size) {
		
		xLeft = x;
		yTop = y;
		this.color = color;
		this.size = size;
		
	}
	
	public void draw(Graphics2D g2) {
		
		Rectangle body = new Rectangle(xLeft, yTop + 10*size,60*size, 10*size);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10*size, yTop + 20*size, 10*size, 10*size);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft +40*size, yTop +20*size, 10*size, 10*size);
		
		Point2D.Double r1 = new Point2D.Double(xLeft +10*size, yTop +10*size);
		Point2D.Double r2 = new Point2D.Double(xLeft + 20*size, yTop);
		Point2D.Double r3 = new Point2D.Double(xLeft + 40*size, yTop);
		Point2D.Double r4 = new Point2D.Double(xLeft + 50*size, yTop + 10*size);

		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double (r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
		
		g2.setColor(color);
		g2.draw(body);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);
		//g2.setColor(Color.black);
		g2.fill(frontTire);
		g2.fill(rearTire);
	}
	

}
