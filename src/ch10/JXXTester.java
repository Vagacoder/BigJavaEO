package ch10;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JXXTester {

    public static void main(String[] args) {
	int frameWidth = 400;
	int frameHeight = 300;

	class TimerListener implements ActionListener {

	    private JLabel label;
	    private JFrame frame;

	    public TimerListener(JLabel label1, JFrame frame1) {
		label = label1;
		frame = frame1;
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
		int x = label.getX();
		// System.out.println(x);
		int y = label.getY();
		// System.out.println(y);
		int height = label.getHeight();
		// System.out.println(height);

		if (x <= frameWidth) {
		    label.setLocation(x + 1, y);
		} else {
		    // label.setLocation(0, frameHeight - height);
		    frame.add(label, BorderLayout.SOUTH);
		    frame.setVisible(true);
		}
	    }
	}
	JLabel label1 = new JLabel("OK");
	JFrame frame = new JFrame();

	ActionListener listener = new TimerListener(label1, frame);
	Timer t = new Timer(10, listener);
	t.start();

	frame.add(label1, BorderLayout.SOUTH);
	frame.setSize(frameWidth, frameHeight);
	frame.setTitle("A Scrolling Message");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);

    }

}
