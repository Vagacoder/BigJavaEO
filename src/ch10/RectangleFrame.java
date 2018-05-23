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
}
