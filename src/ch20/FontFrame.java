package ch20;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * This frame contains a text sample and a control panel to change the font of
 * the text.
 */
@SuppressWarnings("serial")
public class FontFrame extends JFrame {
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;

	private JLabel label;
	private JCheckBox italicCheckBox;
	private JCheckBox boldCheckBox;
	private JRadioButton smallButton;
	private JRadioButton mediumButton;
	private JRadioButton largeButton;
	@SuppressWarnings("rawtypes")
	private JComboBox facenameCombo;
	private ActionListener listener;

	/**
	 * Constructs the frame.
	 */
	public FontFrame() {
		// Construct text sample
		label = new JLabel("Big Java");
		add(label, BorderLayout.CENTER);

		// This listener is shared among all components
		listener = new ChoiceListener();

		createControlPanel();
		setLabelFont();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}

	class ChoiceListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			setLabelFont();
		}
	}

	/**
	 * Creates the control panel to change the font.
	 */
	public void createControlPanel() {
		JPanel facenamePanel = createComboBox();
		JPanel sizeGroupPanel = createCheckBoxes();
		JPanel styleGroupPanel = createRadioButtons();

		// Line up component panels

		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(3, 1));
		controlPanel.add(facenamePanel);
		controlPanel.add(sizeGroupPanel);
		controlPanel.add(styleGroupPanel);

		// Add panels to content pane

		add(controlPanel, BorderLayout.SOUTH);
	}

	/**
	 * Creates the combo box with the font style choices.
	 * 
	 * @return the panel containing the combo box
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JPanel createComboBox() {
		facenameCombo = new JComboBox();
		facenameCombo.addItem("Serif");
		facenameCombo.addItem("SansSerif");
		facenameCombo.addItem("Monospaced");
		facenameCombo.setEditable(true);
		facenameCombo.addActionListener(listener);

		JPanel panel = new JPanel();
		panel.add(facenameCombo);
		return panel;
	}

	/**
	 * Creates the check boxes for selecting bold and italic styles.
	 * 
	 * @return the panel containing the check boxes
	 */
	public JPanel createCheckBoxes() {
		italicCheckBox = new JCheckBox("Italic");
		italicCheckBox.addActionListener(listener);

		boldCheckBox = new JCheckBox("Bold");
		boldCheckBox.addActionListener(listener);

		JPanel panel = new JPanel();
		panel.add(italicCheckBox);
		panel.add(boldCheckBox);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Style"));

		return panel;
	}

	/**
	 * Creates the radio buttons to select the font size.
	 * 
	 * @return the panel containing the radio buttons
	 */
	public JPanel createRadioButtons() {
		smallButton = new JRadioButton("Small");
		smallButton.addActionListener(listener);

		mediumButton = new JRadioButton("Medium");
		mediumButton.addActionListener(listener);

		largeButton = new JRadioButton("Large");
		largeButton.addActionListener(listener);
		largeButton.setSelected(true);

		// Add radio buttons to button group

		ButtonGroup group = new ButtonGroup();
		group.add(smallButton);
		group.add(mediumButton);
		group.add(largeButton);

		JPanel panel = new JPanel();
		panel.add(smallButton);
		panel.add(mediumButton);
		panel.add(largeButton);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));

		return panel;
	}

	/**
	 * Gets user choice for font name, style, and size and sets the font of the text
	 * sample.
	 */
	public void setLabelFont() {
		// Get font name
		String facename = (String) facenameCombo.getSelectedItem();

		// Get font style

		int style = 0;
		if (italicCheckBox.isSelected()) {
			style = style + Font.ITALIC;
		}
		if (boldCheckBox.isSelected()) {
			style = style + Font.BOLD;
		}

		// Get font size

		int size = 0;

		final int SMALL_SIZE = 24;
		final int MEDIUM_SIZE = 36;
		final int LARGE_SIZE = 48;

		if (smallButton.isSelected()) {
			size = SMALL_SIZE;
		} else if (mediumButton.isSelected()) {
			size = MEDIUM_SIZE;
		} else if (largeButton.isSelected()) {
			size = LARGE_SIZE;
		}

		// Set font of text field

		label.setFont(new Font(facename, style, size));
		label.repaint();
	}
}
