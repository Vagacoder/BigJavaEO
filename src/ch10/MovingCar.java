package ch10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * P10.23
 * 
 * @author Skuller
 *
 */

public class MovingCar extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public MovingCar() {
	setSize(600, 600);

	//CarComponent car1 = new CarComponent(0, 0, Color.red, 2);
	CarComponent1 car1 = new CarComponent1(0, 0, Color.red, 2);
	add(car1);
	setVisible(true);
	//CarComponent car2 = new CarComponent(200, 200, Color.black, 2);
	CarComponent1 car2 = new CarComponent1(200, 200, Color.black, 2);
	add(car2);
	setVisible(true);

	class TimeListener implements ActionListener {

	    @Override
	    public void actionPerformed(ActionEvent e) {
		int x1 = car1.getX();
		// int y1 = car1.getY();
		int x2 = car2.getX();
		// int y2 = car2.getY();
		car1.setX(x1 + 1);
		repaint();
		car2.setX(x2 - 1);
		repaint();
	    }

	}

	ActionListener TL = new TimeListener();
	Timer t = new Timer(10, TL);
	t.start();

    }

}
