<<<<<<< HEAD
package BigJavaCh03;

import java.awt.*;
import javax.swing.*;

public class CarComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Car car1 = new Car(0, 0, Color.red, 2);
				
		int x = getWidth() - 180;
		int y = getHeight() - 120;
		
		Car car2 = new Car(x, y, Color.black, 3);
		
		car1.draw(g2);
		car2.draw(g2);
		
	}
	

}
=======
package BigJavaCh03;

import java.awt.*;
import javax.swing.*;

public class CarComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Car car1 = new Car(0, 0, Color.red, 2);
				
		int x = getWidth() - 180;
		int y = getHeight() - 120;
		
		Car car2 = new Car(x, y, Color.black, 3);
		
		car1.draw(g2);
		car2.draw(g2);
		
	}
	

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
