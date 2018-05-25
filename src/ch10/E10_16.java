package ch10;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;

import javax.swing.*;

public class E10_16 {

    public static void main(String[] args) {

	E10_16 tester = new E10_16();

	JFrame frame = tester.new randomFrame();
	frame.setTitle("An animated rectangle");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);

	tester.randomShape();
	tester.randomShape();
	tester.randomShape();
	tester.randomShape();

    }

    class randomFrame extends JFrame {
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;

	private Shape scene;

	public randomFrame() {
	    // scene = randomShape();
	    // add(scene);

	    setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
    }

    ArrayList<Shape> shapes = new ArrayList<>();

    public void randomShape() {
	Shape newShape = null;
	Random rand = new Random();
	int randomNumber = rand.nextInt(2);
	if (randomNumber == 0) {
	    newShape = new Rectangle(30, 40, 40, 50);
	} else if (randomNumber == 1) {

	    int[] xpoints = { 10, 40, 20 };
	    int[] ypoints = { 20, 25, 45 };
	    Polygon poly = new Polygon();
	    poly.npoints = 3;
	    poly.xpoints = xpoints;
	    poly.ypoints = ypoints;
	    newShape = poly;

	} else {
	    Ellipse2D ellipse = new Ellipse2D.Double(70, 80, 10, 20);
	    newShape = ellipse;
	}
	// return newShape;
	shapes.add(newShape);
    }

    public void paintComponent(Graphics g) {
	Graphics2D g2 = (Graphics2D) g;
	for (Shape shape : shapes) {
	    g2.draw(shape);
	}
    }
}
