package BigJavaCh03;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class OlyRings { 
	
	private int x_ini;
	private int y_ini;
	private Color color;
	
	public OlyRings (int x, int y, Color color) {
	
	x_ini = x;
	y_ini = y;
	this.color = color;
	
	}
	
	public void draw(Graphics2D g2) {
		
		Ellipse2D.Double circle1 = new Ellipse2D.Double(x_ini, y_ini, 100, 100);
		//Ellipse2D.Double circle2 = new Ellipse2D.Double(x_ini+5, y_ini+5, 90, 90);
		g2.setColor(color);
		g2.setStroke(new BasicStroke(8));
		g2.draw(circle1);
		//g2.setColor(Color.white);
		//g2.fill(circle2);
		
	}
}
