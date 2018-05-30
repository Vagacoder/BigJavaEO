package ch10;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class CircleComponent extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Shape cir;

	public CircleComponent(double x, double y, double r) {
		
		cir = new Ellipse2D.Double(x-r, y-r, 2*r, 2*r);
		
		
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(cir);
	    }
	
	
}
