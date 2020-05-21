package ch10;

import java.awt.event.*;

import javax.swing.*;

/**
 * This frame contains a moving rectangle.
 */
public class RectangleFrame2 extends JFrame {
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;

	private RectangleComponent2 scene;

	public RectangleFrame2() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		scene = new RectangleComponent2();
		add(scene);

		MouseListener listener = new MousePressListener();
		scene.addMouseListener(listener);
		scene.addKeyListener(new KeyInputListener());

		scene.setFocusable(true);
		scene.requestFocus();
	}

	class MousePressListener implements MouseListener {
		public void mousePressed(MouseEvent event) {
			int x = event.getX();
			int y = event.getY();
			// scene.moveRectangleTo(x, y);
			scene.copyRectangleTo(x, y);
		}

		// Do-nothing methods
		public void mouseReleased(MouseEvent event) {
		}

		public void mouseClicked(MouseEvent event) {
		}

		public void mouseEntered(MouseEvent event) {
		}

		public void mouseExited(MouseEvent event) {
		}
	}

	class KeyInputListener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent event) {
			String key = KeyStroke.getKeyStrokeForEvent(event).toString();
			System.out.println(key);
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
		}

	}

}
