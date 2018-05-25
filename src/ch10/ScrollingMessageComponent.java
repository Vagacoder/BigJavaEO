package ch10;

import java.awt.*;

import javax.swing.*;

/**
 * P10.15
 * 
 * no need, Frame class can directly call JLabel objects.
 * 
 * @author Skuller
 *
 */

public class ScrollingMessageComponent extends JPanel {
    // public class ScrollingMessageComponent extends JComponent {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JLabel label;

    public ScrollingMessageComponent(String label) {
	setSize(300, 100);
	this.setLayout(new BorderLayout());
	this.label = new JLabel(label);
	add(this.label, BorderLayout.WEST);
	// this.label.setLocation(100, 50);

    }

    // @Override
    // public void paintComponent(Graphics g) {
    // Graphics2D g2 = (Graphics2D) g;
    // g2.draw(label);
    // g2.
    // }

    public void moveLabelTo(int x, int y) {
	label.setLocation(x, y);
	// repaint();
    }
}
