<<<<<<< HEAD
package BigJavaCh03;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class TargetComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double circle1 = new Ellipse2D.Double(100, 100, 100, 100);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(110, 110, 80, 80);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(120, 120, 60, 60);
		Ellipse2D.Double circle4 = new Ellipse2D.Double(130, 130, 40, 40);
		Ellipse2D.Double circle5 = new Ellipse2D.Double(140, 140, 20, 20);
		
		g2.setColor(Color.black);
		g2.fill(circle1);
		g2.setColor(Color.white);
		g2.fill(circle2);
		g2.setColor(Color.black);
		g2.fill(circle3);
		g2.setColor(Color.white);
		g2.fill(circle4);
		g2.setColor(Color.black);
		g2.fill(circle5);
	}

}
=======
package BigJavaCh03;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class TargetComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double circle1 = new Ellipse2D.Double(100, 100, 100, 100);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(110, 110, 80, 80);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(120, 120, 60, 60);
		Ellipse2D.Double circle4 = new Ellipse2D.Double(130, 130, 40, 40);
		Ellipse2D.Double circle5 = new Ellipse2D.Double(140, 140, 20, 20);
		
		g2.setColor(Color.black);
		g2.fill(circle1);
		g2.setColor(Color.white);
		g2.fill(circle2);
		g2.setColor(Color.black);
		g2.fill(circle3);
		g2.setColor(Color.white);
		g2.fill(circle4);
		g2.setColor(Color.black);
		g2.fill(circle5);
	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
