package ch10;

import java.awt.*;

import javax.swing.*;

public class BarChartRecCom extends JComponent {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public static final int HEAD = 100;
    public static final int INTERVAL = 10;
    public static final int recWidth = 200;
    public static final int recHeigh = 50;
    private Rectangle rec;

    public BarChartRecCom(int y) {
	rec = new Rectangle(0, y, recWidth, recHeigh);

    }

    public void setWidth(int width) {
	int height = (int) rec.getHeight();
	rec.setSize(width, height);

    }

    @Override
    public void paintComponent(Graphics g) {
	Graphics2D g2 = (Graphics2D) g;
	g2.draw(rec);
    }
}
