<<<<<<< HEAD
package BigJavaCh03;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LargeEllipse extends JComponent {
	
	//private int x;
	//private int y;
	private int width;
	private int heighth;
	
	public LargeEllipse(int width, int heigth) {
		
		this.width = width;
		this.heighth = heigth;
		
	}

	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		//Rectangle box = new Rectangle(0, 0, 600, 800);
		//x = (int) box.getX();
		//y = (int) box.getY();
		//width = (int) box.getWidth();
		//height = (int) box.getHeight();
		
		Ellipse2D.Double cir1 = new Ellipse2D.Double(0, 0, width, heighth);
		Ellipse2D.Double cir2 = new Ellipse2D.Double(0, 0, width, heighth);
		
		g2.setColor(Color.black);
		g2.draw(cir1);
		g2.setColor(Color.red);
		g2.fill(cir2);
		
	}
		
		
}
=======
package BigJavaCh03;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class LargeEllipse extends JComponent {
	
	//private int x;
	//private int y;
	private int width;
	private int heighth;
	
	public LargeEllipse(int width, int heigth) {
		
		this.width = width;
		this.heighth = heigth;
		
	}

	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		//Rectangle box = new Rectangle(0, 0, 600, 800);
		//x = (int) box.getX();
		//y = (int) box.getY();
		//width = (int) box.getWidth();
		//height = (int) box.getHeight();
		
		Ellipse2D.Double cir1 = new Ellipse2D.Double(0, 0, width, heighth);
		Ellipse2D.Double cir2 = new Ellipse2D.Double(0, 0, width, heighth);
		
		g2.setColor(Color.black);
		g2.draw(cir1);
		g2.setColor(Color.red);
		g2.fill(cir2);
		
	}
		
		
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
