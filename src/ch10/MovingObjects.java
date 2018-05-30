package ch10;

import java.awt.event.*;

import javax.swing.*;

public class MovingObjects extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public MovingObjects() {
	setSize(600, 400);

	MouseTriangleRecCompo rec1 = new MouseTriangleRecCompo(100, 100, 50, 20);
	MouseTriangleRecCompo rec2 = new MouseTriangleRecCompo(80, 120, 90, 20);
	add(rec2);
	setVisible(true);
	add(rec1);
	setVisible(true);

	class TimeListener implements ActionListener {

	    @Override
	    public void actionPerformed(ActionEvent e) {
		int x1 = rec1.getX();
		int y1 = rec1.getY();
		int x2 = rec2.getX();
		int y2 = rec2.getY();
		rec1.setLocation(x1 + 1, y1);
		rec2.setLocation(x2 + 1, y2);
	    }

	}

	ActionListener TL = new TimeListener();
	Timer t = new Timer(10, TL);
	t.start();

    }

}
