package ch10;

import java.awt.event.*;

import javax.swing.*;

/**
 * P10.18
 * 
 * @author Skuller
 *
 */

public class BarChart {

    public static void main(String[] args) {

	class BarChartMouseListener implements MouseListener {

	    private final int INTERVAL = 50;
	    private int bottomLine = 0;

	    public BarChartMouseListener() {

	    }

	    @Override
	    public void mouseClicked(MouseEvent e) {
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

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

	frame.setSize(600, 800);
	frame.setTitle("Bar Chart");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);

    }

}
