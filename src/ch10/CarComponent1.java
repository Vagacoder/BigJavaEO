package ch10;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.*;

/**
 * P10.23
 * 
 * This class is modified from CarComponent, and is independent from Car class in package ch03 
 * 
 * @author Skuller
 *
 */

public class CarComponent1 extends JComponent {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int x;
    private int y;
    private Color color;
    private int size;

    public CarComponent1(int x, int y, Color color, int size) {
	this.x = x;
	this.y = y;
	this.color = color;
	this.size = size;
    }

    public void paintComponent(Graphics g) {

	Graphics2D g2 = (Graphics2D) g;
	Rectangle body = new Rectangle(x, y + 10*size,60*size, 10*size);
	Ellipse2D.Double frontTire = new Ellipse2D.Double(x + 10*size, y + 20*size, 10*size, 10*size);
	Ellipse2D.Double rearTire = new Ellipse2D.Double(x +40*size, y +20*size, 10*size, 10*size);
	
	Point2D.Double r1 = new Point2D.Double(x + 10*size, y +10*size);
	Point2D.Double r2 = new Point2D.Double(x + 20*size, y);
	Point2D.Double r3 = new Point2D.Double(x + 40*size, y);
	Point2D.Double r4 = new Point2D.Double(x + 50*size, y + 10*size);

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

    public int getX() {
	return x;
    }

    public void setX(int x) {
	this.x = x;
    }

    public int getY() {
	return y;
    }

    public void setY(int y) {
	this.y = y;
    }

}
