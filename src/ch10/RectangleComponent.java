package ch10;

import java.awt.*;

import javax.swing.*;

/**
 * This component displays a rectangle that can be moved.
 */
public class RectangleComponent extends JComponent {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;

    private Rectangle box;

    public Rectangle getBox() {
        return box;
    }

    public RectangleComponent() {
        // The rectangle that the paintComponent method draws
        box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }

    /**
     * Moves the rectangle by a given amount.
     * 
     * @param dx the amount to move in the x-direction
     * @param dy the amount to move in the y-direction
     */
    public void moveRectangleBy(int dx, int dy) {
        box.translate(dx, dy);
        repaint();
    }
}
