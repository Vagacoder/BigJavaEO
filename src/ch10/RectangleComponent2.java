package ch10;

import java.awt.*;
import java.util.*;

import javax.swing.*;

/**
 * This component displays a rectangle that can be moved.
 */
public class RectangleComponent2 extends JComponent {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static final int BOX_X = 100;
    private static final int BOX_Y = 100;
    private static final int BOX_WIDTH = 20;
    private static final int BOX_HEIGHT = 30;

    // private Rectangle box;
    private ArrayList<Rectangle> boxes = new ArrayList<>();

    public RectangleComponent2() {
        // The rectangle that the paintComponent method draws
        Rectangle box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
        boxes.add(box);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (Rectangle box : boxes) {
            g2.draw(box);
        }
    }

    /**
     * Moves the rectangle to the given location.
     * 
     * @param x the x-position of the new location
     * @param y the y-position of the new location
     */
    public void moveRectangleTo(int x, int y) {
        // box.setLocation(x, y);
        repaint();
    }

    /**
     * New method for E10.29
     * 
     * @param x
     * @param y
     */
    public void copyRectangleTo(int x, int y) {
        int lastIndex = boxes.size() - 1;
        Rectangle newBox = (Rectangle) boxes.get(lastIndex).clone();
        newBox.setLocation(x, y);
        boxes.add(newBox);
        repaint();

    }

}
