package ch01;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Greeting {
	public static void main(String[] args) throws Exception {
		URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
		JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}
}