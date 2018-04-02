package BigJavaCh08;


/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends javax.swing.JComponent
{  
   public void paintComponent(java.awt.Graphics g)
   {  
      // Recover Graphics2D
	   java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;

      // Construct a rectangle and draw it
	   java.awt.Rectangle box = new java.awt.Rectangle(5, 10, 20, 30);
      g2.draw(box);

      // Move rectangle 15 units to the right and 25 units down
      box.translate(15, 25);

      // Draw moved rectangle
      g2.draw(box);
   }
}
