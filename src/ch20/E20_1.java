package ch20;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * E20.1 Write an application with three buttons labeled “Red”, “Green”, and “Blue” that
 * changes the background color of a panel in the center of the frame to red, green,
 * or blue.
 * 
 * E20.2 Add icons to the buttons of Exercise E20.1. Use a JButton constructor with an Icon
 * argument and supply an ImageIcon.
 */

public class E20_1 {

	private JFrame frame;
	private JPanel panel;
	
	// constructor
	public E20_1() {
		frame = new JFrame();
		frame.setTitle("E20.1");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		JButton redB = new JButton("Red", new MyImageIcon(20, 50, Color.RED));
		JButton greenB = new JButton("Grenn", new MyImageIcon(20, 50, Color.GREEN));
		JButton blueB = new JButton("Blue", new MyImageIcon(20, 50, Color.BLUE));
		
		ImageIcon icon = new ImageIcon("queen-mary.png", "");
		
		JButton blackB = new JButton("Black", icon);
		
		redB.addActionListener(new Al("Red"));
		greenB.addActionListener(new Al("Green"));
		blueB.addActionListener(new Al("Blue"));
		blackB.addActionListener(new Al("Black"));
		
		panel.add(redB);
		panel.add(greenB);
		panel.add(blueB);
		panel.add(blackB);
		frame.add(panel);
		
		frame.setVisible(true);
	}
	
	// action listener attached to buttons
	class Al implements ActionListener {
		
		private String color; 
		
		public Al (String color) {
			this.color = color;
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (color.equals("Red")) {
				panel.setBackground(Color.RED);
			} else if (color.equals("Green")) {
				panel.setBackground(Color.GREEN);
			} else if (color.equals("Blue")) {
				panel.setBackground(Color.BLUE);
			}else if (color.equals("Black")) {
				panel.setBackground(Color.BLACK);
			}
			
		}
		
	}
	
	// my icon class added to buttons
	class MyImageIcon implements Icon {

		private int height;
		private int width;
		private Color color;
		
		public MyImageIcon(int h, int w, Color c) {
			height = h;
			width = w;
			color = c;
		}
		
		@Override
		public int getIconHeight() {			
			return height;
		}

		@Override
		public int getIconWidth() {
			return width;
		}

		@Override
		public void paintIcon(Component c, Graphics g, int x, int y) {
			Graphics2D g2d = (Graphics2D) g.create();
			
			g2d.setColor(color);
			g2d.fillRect(x + 1, y + 1, width - 2 , height - 2);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		E20_1 frame = new E20_1();

	}

}
