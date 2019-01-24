package ch20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

/*
E20.7 Write a program that displays a number of rectangles at random positions. Supply
menu items “Fewer” and “More” that generate fewer or more random rectangles.
Each time the user selects “Fewer”, the count should be halved. Each time the user
clicks on “More”, the count should be doubled.
 */

public class E20_7 {

	private final int WIDTH = 600;
	private final int HEIGHT = 800;
	private final int BOX_MAX_W = 80;
	private final int BOX_MAX_H = 100;
	private JFrame frame;
	private JPanel panel;
	private int numberOfRectangle;
	private ArrayList<Rectangle> recList;

	// constructor
	public E20_7() {

		frame = new JFrame();
		panel = new JPanel();
		numberOfRectangle = 0;

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Rectangles");

		JMenuItem few = new JMenuItem("Fewer");
		JMenuItem more = new JMenuItem("More");
		few.addActionListener(new ml(false));
		more.addActionListener(new ml(true));

		menu.add(few);
		menu.add(more);

		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		frame.add(panel);
		frame.setTitle("E20.7");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	// inner class of action listener for buttons
	class ml implements ActionListener {

		private boolean more;

		// constructor
		public ml(boolean more) {
			this.more = more;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (more) {
				drawRecs(more);
			} else {
				drawRecs(!more);
			}
		}

	}

	@SuppressWarnings("serial")
	class Recs extends JComponent {
		Rectangle box;
		Color color;
		public Recs(int x, int y, int w, int h, Color color) {
			this.box = new Rectangle(x, y, w, h);
			this.color = color;
		}
		
		public void paint(Graphics g) {
			Graphics2D g2s = (Graphics2D) g;
			g2s.setColor(color);
			g2s.draw(box);
		}
	}

	// method to draw rectangles
	public void drawRecs(boolean more) {
		if (more) {
			for (int i = numberOfRectangle; i < numberOfRectangle * 2; i++) {

				int w = (int) (Math.random() * (BOX_MAX_W));
				int h = (int) (Math.random() * (BOX_MAX_H));
				int x = (int) (Math.random() * (WIDTH - w));
				int y = (int) (Math.random() * (HEIGHT - h));

				Recs box = new Recs(x, y, w, h, Color.BLACK);
				panel.add(box);
			}
			numberOfRectangle *= 2;

		} else {
			numberOfRectangle /= 2;
		}
	}

	public static void main(String[] args) {

		E20_7 frame = new E20_7();

	}

}
