package ch10;

import java.awt.*;

import javax.swing.*;

public class BarChartRecCom extends JComponent {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Rectangle rec;

    public BarChartRecCom(int x, int y, int width, int height) {
	rec = new Rectangle(x, y, width, height);
    }

    @Override
    public void paintComponent(Graphics g) {
	Graphics2D g2 = (Graphics2D) g;
	g2.draw(rec);
    }
}
