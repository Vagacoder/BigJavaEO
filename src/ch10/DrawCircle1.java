package ch10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * P10.25
 * @author qhu
 *
 */
public class DrawCircle1 {

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		class MouseCircleListener implements MouseListener {

			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				String input = JOptionPane.showInputDialog("Please enter the radius");
				int radius = Integer.parseInt(input);
				
				CircleComponent circle = new CircleComponent(x,y,radius);
				frame.add(circle);
				frame.setVisible(true);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
		}
		
		MouseCircleListener MCL = new MouseCircleListener();
		
		frame.addMouseListener(MCL);
		
		frame.setSize(600, 400);
		frame.setTitle("Draw circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
