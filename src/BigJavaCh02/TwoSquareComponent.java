<<<<<<< HEAD

package BigJavaCh02;

import java.awt.*;
import javax.swing.*;

public class TwoSquareComponent extends JComponent {
	
	public void paint(Graphics g) {
		Graphics2D g2s = (Graphics2D) g;
		Rectangle box1 = new Rectangle(50,50, 200, 200);
		g2s.setColor(Color.pink);
		g2s.draw(box1);
		
		box1 = new Rectangle(300,300, 200, 200);
		g2s.setColor(new Color(255, 0, 255));
		g2s.draw(box1);
		
		
		
	}
	
	
	

}
=======
package BigJavaCh02;

import java.awt.*;
import javax.swing.*;

public class TwoSquareComponent extends JComponent {
	
	public void paint(Graphics g) {
		Graphics2D g2s = (Graphics2D) g;
		Rectangle box1 = new Rectangle(50,50, 200, 200);
		g2s.setColor(Color.pink);
		g2s.draw(box1);
		
		box1 = new Rectangle(300,300, 200, 200);
		g2s.setColor(new Color(255, 0, 255));
		g2s.draw(box1);
		
		
		
	}
	
	
	

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
