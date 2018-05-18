package others;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test07
{
  public static void main(String[] argv) throws Exception {

      JPanel panel = new JPanel(null);

      JLabel helloLabel = new JLabel("Hello world!");
      helloLabel.setBounds( 10, 50, 90, 100 ); // x, y, width, height
      panel.add(helloLabel);

      JFrame frame = new JFrame();
      frame.add(panel);
      frame.setPreferredSize( new Dimension(200,200));
      frame.pack();
      frame.setVisible(true);
      
      double cost = 10;
      cost = cost -= cost*0.1;
      System.out.println(cost);
    		  
  }
}