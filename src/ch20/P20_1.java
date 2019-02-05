package ch20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import ch20.E20_7.Recs;
import ch20.E20_7.ml;

/*
 * P20.1 Modify the program of Exercise E20.7 to replace the buttons with a slider to generate
 *  more or fewer random rectangles.
 *  
 *  E20.7 Write a program that displays a number of rectangles at random positions. Supply
 * menu items “Fewer” and “More” that generate fewer or more random rectangles.
 * Each time the user selects “Fewer”, the count should be halved. Each time the user
 * clicks on “More”, the count should be doubled.
 */

public class P20_1 {

	private final int WIDTH = 600;
	private final int HEIGHT = 800;
	private final int BOX_MAX_W = 80;
	private final int BOX_MAX_H = 100;
	private JFrame frame;
	private JSlider sliderBar;
	// private int numberOfRectangle = 0;
	private ArrayList<Recs> recList;

	public P20_1() {
		frame = new JFrame();

		sliderBar = new JSlider(-1, 100, -1);
		sliderBar.addChangeListener(new ml());

		frame.add(sliderBar, BorderLayout.SOUTH);
		frame.setTitle("P20.1");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		recList = new ArrayList<Recs>();
	}

	// inner class of action listener for buttons
	class ml implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			int numberToDraw = sliderBar.getValue();
			drawRecs(numberToDraw);

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
	public void drawRecs(int numberToDraw) {
		int numberOfRectangle = recList.size();
		if (numberToDraw > numberOfRectangle) {
			if (numberOfRectangle == 0) {
				numberOfRectangle++;
			} else {
				numberOfRectangle *= 2;
			}

			for (int i = recList.size(); i < numberToDraw; i++) {
				int w = (int) (Math.random() * (BOX_MAX_W));
				int h = (int) (Math.random() * (BOX_MAX_H));
				int x = (int) (Math.random() * (WIDTH - w));
				int y = (int) (Math.random() * (HEIGHT - h));

				Recs box = new Recs(x, y, w, h, Color.BLACK);
				recList.add(box);
				frame.add(box, BorderLayout.CENTER);
				//frame.repaint();
				//frame.setVisible(true);
			}

		} else {
			numberOfRectangle /= 2;
			for (int i = recList.size() - 1; i >= numberOfRectangle; i--) {
				Recs box = recList.get(recList.size() - 1);
				frame.remove(box);
				recList.remove(recList.size() - 1);
				frame.repaint();

			}
		}
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		P20_1 frame = new P20_1();

	}

}
