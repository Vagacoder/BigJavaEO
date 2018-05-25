package ch10;

import java.awt.event.*;

import javax.swing.*;

/**
 * P10.15
 * 
 * @author Skuller
 *
 */
public class ScrollingMessageFrame extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int frameWidth = 300;
    private int frameHeight = 100;
    private ScrollingMessageComponent panel;
    // private JPanel panel;

    public ScrollingMessageFrame(String label) {
	panel = new ScrollingMessageComponent(label);
	// JLabel label1 = new JLabel(label);

	// panel.add(label1);
	this.add(panel);

	// message = new ScrollingMessageComponent(label);
	// add(message);

	this.setSize(frameWidth, frameHeight);

	ActionListener tLis = new TimerListener();
	Timer t = new Timer(10, tLis);
	t.start();

    }

    class TimerListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
	    // int x = message.getX();
	    // int y = message.getY();
	    // if (x < frameWidth) {
	    // message.moveLabelTo(x + 1, y);
	    // } else {
	    // message.moveLabelTo(0, 0);
	    // }

	    int x = panel.getX();
	    // System.out.println(x);
	    int y = panel.getY();
	    if (x <= frameWidth) {
		panel.setLocation(x + 1, y);
	    } else {
		panel.setLocation(0, 0);
	    }
	}
    }

}
