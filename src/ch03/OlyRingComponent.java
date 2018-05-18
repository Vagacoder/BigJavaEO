package ch03;

import java.awt.*;
import javax.swing.*;

public class OlyRingComponent extends JComponent {
	
	private int x_ini = 50;
	private int y_ini = 50;
	private int x_dis = 110;
	private int y_dis = 50;
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		OlyRings ring1 = new OlyRings(x_ini, y_ini, Color.blue);
		OlyRings ring2 = new OlyRings(x_ini+ x_dis, y_ini, Color.black);
		OlyRings ring3 = new OlyRings(x_ini+ x_dis*2, y_ini, Color.red);
		OlyRings ring4 = new OlyRings(x_ini+ 55, y_ini + y_dis, Color.yellow);
		OlyRings ring5 = new OlyRings(x_ini+ 55 + x_dis, y_ini + y_dis, Color.green);
		
		ring1.draw(g2);
		ring2.draw(g2);
		ring3.draw(g2);
		ring4.draw(g2);
		ring5.draw(g2);
	}
	
}
