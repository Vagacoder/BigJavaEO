package ch10;

import java.awt.*;

import javax.swing.*;

import ch03.*;

/**
 * P10.23
 * 
 * @author Skuller
 *
 */

public class CarComponent extends JComponent {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int x;
    private int y;
    private Color color;
    private int size;

    public CarComponent(int x, int y, Color color, int size) {
	this.x = x;
	this.y = y;
	this.color = color;
	this.size = size;
    }

    public void paintComponent(Graphics g) {

	Graphics2D g2 = (Graphics2D) g;
	Car car = new Car(x, y, color, size);
	car.draw(g2);
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
