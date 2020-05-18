package ch10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * This frame contains a moving rectangle.
 */
public class RectangleFrame extends JFrame {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private RectangleComponent scene;
    private boolean movingRightDown = true;

    class TimerListener implements ActionListener {

        // default method
        // Modified for E10.28, rectangle bouncing between boarders.
        public void actionPerformed(ActionEvent event) {
            Rectangle box = scene.getBox();
            int box_left = box.x;
            int box_top = box.y;
            int box_right = box.x + box.width;
            int box_bottom = box.y + box.height;

            if (box_bottom >= FRAME_HEIGHT - 30 || box_right >= FRAME_WIDTH - 20) {
                movingRightDown = false;
            } else if (box_left == 0 || box_top == 0) {
                movingRightDown = true;
            }
            if (movingRightDown) {
                scene.moveRectangleBy(1, 1);
            } else {
                scene.moveRectangleBy(-1, -1);
            }
        }
    }

    public RectangleFrame() {
        scene = new RectangleComponent();
        add(scene);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        ActionListener listener = new TimerListener();

        final int DELAY = 50; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();
    }

    // public void randomShape() {
    // Shape newShape = null;
    // Random rand = new Random();
    // int randomNumber = rand.nextInt(2);
    // if (randomNumber == 0) {
    // newShape = new Rectangle(30, 40, 40, 50);
    // } else if (randomNumber == 1) {
    //
    // int[] xpoints = { 10, 40, 20 };
    // int[] ypoints = { 20, 25, 45 };
    // Polygon poly = new Polygon();
    // poly.npoints = 3;
    // poly.xpoints = xpoints;
    // poly.ypoints = ypoints;
    // newShape = poly;
    //
    // } else {
    // Ellipse2D ellipse = new Ellipse2D.Double(70, 80, 10, 20);
    // newShape = ellipse;
    // }
    // // return newShape;
    // this.add((Component) newShape);
    // }
}
