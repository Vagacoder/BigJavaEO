package ch10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * P10.16
 * 
 * @author Skuller
 *
 */
public class MouseTriangle {

    public static void main(String[] args) {

	class MTriangleListener implements MouseListener {

	    private JFrame frame;
	    private int pressCount = 0;
	    private Point p1;
	    private Point p2;

	    public MTriangleListener(JFrame frame) {
		this.frame = frame;
	    }

	    @Override
	    public void mouseClicked(MouseEvent e) {
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {
		pressCount++;
		int x = e.getX();
		int y = e.getY();
		System.out.println(x);
		System.out.println(y);
		if (pressCount == 1) {
		    Point p1 = new Point(x, y);
		    this.p1 = p1;
		    MouseTriangleRecCompo rec1 = new MouseTriangleRecCompo(x, y, 1, 1);
		    frame.add(rec1);
		    frame.setVisible(true);
		} else if (pressCount == 2) {
		    Point p2 = new Point(x, y);
		    this.p2 = p2;
		    MouseTriangleRecCompo rec2 = new MouseTriangleRecCompo(x, y, 1, 1);
		    frame.add(rec2);
		    frame.setVisible(true);
		    MouseTriangleLineCompo l1 = new MouseTriangleLineCompo(x, y, (int) p1.getX(), (int) p1.getY());
		    frame.add(l1);
		    frame.setVisible(true);
		} else if (pressCount == 3) {
		    MouseTriangleRecCompo rec3 = new MouseTriangleRecCompo(x, y, 1, 1);
		    frame.add(rec3);
		    frame.setVisible(true);
		    MouseTriangleLineCompo l2 = new MouseTriangleLineCompo((int) p1.getX(), (int) p1.getY(), x, y);
		    frame.add(l2);
		    frame.setVisible(true);
		    MouseTriangleLineCompo l3 = new MouseTriangleLineCompo(x, y, (int) p2.getX(), (int) p2.getY());
		    frame.add(l3);
		    frame.setVisible(true);
		    pressCount = 0;
		}

	    }

	    @Override
	    public void mouseReleased(MouseEvent e) {
	    }

	    @Override
	    public void mouseEntered(MouseEvent e) {
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {
	    }

	}

	JFrame frame = new JFrame();

	MTriangleListener MTL = new MTriangleListener(frame);
	frame.addMouseListener(MTL);
	frame.setSize(400, 300);
	frame.setTitle("Drawing a triangle");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }

}
