package ch20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//import ch20.ColorFrame.ColorListener;

/*
 * E20.12 Modify the slider test program in Section 20.5 to add a set of tick marks to each slider
 * that show the exact slider position.
 */

public class E20_12 {

	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;

	private JFrame frame;
	private JPanel colorPanel;
	private JSlider redSlider;
	private JSlider greenSlider;
	private JSlider blueSlider;

	public E20_12() {
		frame = new JFrame();
		colorPanel = new JPanel();
		frame.add(colorPanel, BorderLayout.CENTER);
		createControlPanel();
		setSampleColor();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("E20.12");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	class ColorListener implements ChangeListener {
		public void stateChanged(ChangeEvent event) {
			setSampleColor();
		}
	}

	public void createControlPanel() {
		ChangeListener listener = new ColorListener();

		redSlider = new JSlider(0, 255, 255);
		redSlider.setMajorTickSpacing(10);
		redSlider.setPaintTicks(true);
		redSlider.addChangeListener(listener);

		greenSlider = new JSlider(0, 255, 175);
		greenSlider.setMajorTickSpacing(10);
		greenSlider.setPaintTicks(true);
		greenSlider.addChangeListener(listener);

		blueSlider = new JSlider(0, 255, 175);
		blueSlider.setMajorTickSpacing(10);
		blueSlider.setPaintTicks(true);
		blueSlider.addChangeListener(listener);

		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(3, 2));

		controlPanel.add(new JLabel("Red"));
		controlPanel.add(redSlider);

		controlPanel.add(new JLabel("Green"));
		controlPanel.add(greenSlider);

		controlPanel.add(new JLabel("Blue"));
		controlPanel.add(blueSlider);

		frame.add(controlPanel, BorderLayout.SOUTH);
	}

	/**
	 * Reads the slider values and sets the panel to the selected color.
	 */
	public void setSampleColor() {
		// Read slider values

		int red = redSlider.getValue();
		int green = greenSlider.getValue();
		int blue = blueSlider.getValue();

		// Set panel background to selected color

		colorPanel.setBackground(new Color(red, green, blue));
		colorPanel.repaint();
	}

	public static void main(String[] args) {

		E20_12 frame = new E20_12();
	}

}
