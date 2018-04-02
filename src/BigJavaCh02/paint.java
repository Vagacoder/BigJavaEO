<<<<<<< HEAD

package BigJavaCh02;

import java.awt.*;
import javax.swing.*;

public class paint extends JComponent {

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(255, 0, 0));
		g2d.drawString("Hello world", 100, 100);
		

	}

}
=======
package BigJavaCh02;

import java.awt.*;
import javax.swing.*;

public class paint extends JComponent {

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(255, 0, 0));
		g2d.drawString("Hello world", 100, 100);
		

	}

}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
