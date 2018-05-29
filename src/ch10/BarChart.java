package ch10;

import java.awt.event.*;
import java.util.*;

import javax.swing.*;

/**
 * P10.18
 * 
 * @author Skuller
 *
 */

public class BarChart {

    public static void main(String[] args) {
	ArrayList<BarChartRecCom> recList = new ArrayList<>();

	class BarChartMouseListener implements MouseListener {

	    private JFrame frame;

	    public BarChartMouseListener(JFrame frame) {
		this.frame = frame;
	    }

	    @Override
	    public void mouseClicked(MouseEvent e) {
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		int numberOfRecs = recList.size();
		BarChartRecCom lastRec = null;

		// Check if empty list of recs, if not empty, set lastRec; if yes, add a brand
		// new rec
		if (numberOfRecs > 0) {
		    lastRec = recList.get(numberOfRecs - 1);
		} else {
		    BarChartRecCom brandNewRec = new BarChartRecCom(BarChartRecCom.HEAD);
		    recList.add(brandNewRec);
		    frame.add(brandNewRec);
		    frame.setVisible(true);
		    return;
		}

		// Check the mouse click position

		// if click within last rec, change the width of last rec.
		if (y < (BarChartRecCom.HEAD
			+ (BarChartRecCom.INTERVAL + BarChartRecCom.recHeigh) * (numberOfRecs - 1))) {
		    recList.remove(numberOfRecs - 1);
		    frame.remove(lastRec);
		    frame.repaint();
		}

		// if click above last rec, delete last rec.
		else if (y < (BarChartRecCom.HEAD
			+ (BarChartRecCom.INTERVAL + BarChartRecCom.recHeigh) * numberOfRecs)) {
		    if (x <= BarChartRecCom.recWidth) {
			lastRec.setWidth(x);
		    } else {
			lastRec.setWidth(BarChartRecCom.recWidth);
		    }
		    frame.repaint();
		}

		// if click below the last rec, add a new rec.
		else {
		    BarChartRecCom newRec = new BarChartRecCom(
			    BarChartRecCom.HEAD + (BarChartRecCom.INTERVAL + BarChartRecCom.recHeigh) * numberOfRecs);
		    if (x <= BarChartRecCom.recWidth) {
			newRec.setWidth(x);
		    } else {
			newRec.setWidth(BarChartRecCom.recWidth);
		    }
		    recList.add(newRec);
		    frame.add(newRec);
		    frame.setVisible(true);
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
	BarChartMouseListener BCML = new BarChartMouseListener(frame);
	frame.addMouseListener(BCML);

	BarChartRecCom firstRec = new BarChartRecCom(BarChartRecCom.HEAD);
	recList.add(firstRec);
	frame.add(firstRec);

	frame.setSize(600, 800);
	frame.setTitle("Bar Chart");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);

    }

}
