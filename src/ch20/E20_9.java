package ch20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

/*
 * Write a program that lets users design charts such as the following:
 * Use appropriate components to ask for the length, label, and color, then apply them
 * when the user clicks an “Add Item” button.
 */
public class E20_9 {
	final int INPUT_FIELD_WIDTH = 15;
	private JFrame frame;
//	private JPanel panel;

	// private JPanel panelNorth;
	private JLabel displayLabel;
	private JLabel inputLabel;
	private JTextField textInputField;
	// private JPanel panel1;

	private JLabel lengthLabel;
	private JTextField lengthInputField;
	// private JPanel panel2;

	private JLabel colorLabel;
	private JComboBox colorBox;
	private JButton confirmButton;
	// private JPanel panel3;

	private JTextArea displayArea;
	private int numberOfText = 0;
	// private JPanel panelSouth;

	private JPanel panelSouth;

	public E20_9() {

		frame = new JFrame();
		// panel = new JPanel();

		JPanel panel1 = createTtextField();
		JPanel panel2 = createLengthField();
		JPanel panel3 = createColorBox();

		JPanel panelNorth = new JPanel();
		panelNorth.setLayout(new GridLayout(3, 1));
		panelNorth.add(panel1);
		panelNorth.add(panel2);
		panelNorth.add(panel3);

		frame.add(panelNorth, BorderLayout.NORTH);

		createDisplay();

		panelSouth = new JPanel();
		panelSouth.setLayout(new GridLayout(20, 1));

		frame.add(panelSouth, BorderLayout.SOUTH);
		frame.setTitle("E20.9");
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	/*
	 * Action listener attached to apply butoon
	 */
	class ButtonConfirm implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numberOfText > 11) {
				return;
			}
			int length = Integer.parseInt(lengthInputField.getText());
			String text = textInputField.getText();
			String color = (String) colorBox.getSelectedItem();
			text = text + "               ";
			if (length <= 15) {
				text = text.substring(0, length);
			} else {
				text = text.substring(0, 15);
			}

			JLabel boxedLabel = new JLabel(text);
			boxedLabel.setBorder(new EtchedBorder());

			if (color.equals("Red")) {
				boxedLabel.setForeground(Color.RED);
				boxedLabel.setBackground(Color.RED);
			} else if (color.equals("Pink")) {
				boxedLabel.setForeground(Color.PINK);
				boxedLabel.setBackground(Color.PINK);
			}else if (color.equals("Yellow")) {
				boxedLabel.setForeground(Color.YELLOW);
				boxedLabel.setBackground(Color.YELLOW);
			}else if (color.equals("Green")) {
				boxedLabel.setForeground(Color.GREEN);
				boxedLabel.setBackground(Color.GREEN);
			} else if (color.equals("Blue")) {
				boxedLabel.setForeground(Color.BLUE);
				boxedLabel.setBackground(Color.BLUE);
			}else if (color.equals("Purple")) {
				boxedLabel.setForeground(Color.magenta);
				boxedLabel.setBackground(Color.MAGENTA);
			}

			displayArea.append(text + "\n");

			panelSouth.add(boxedLabel);
			++numberOfText;
			frame.setVisible(true);

		}

	}

	private JPanel createTtextField() {
		JPanel panel = new JPanel();
		inputLabel = new JLabel("Input text:");
		textInputField = new JTextField(INPUT_FIELD_WIDTH);
		textInputField.setText("");
		panel.add(inputLabel);
		panel.add(textInputField);
		return panel;

	}

	private JPanel createLengthField() {
		JPanel panel = new JPanel();
		lengthLabel = new JLabel("Length (Max 15):");
		lengthInputField = new JTextField(2);
		lengthInputField.setText("0");
		panel.add(lengthLabel);
		panel.add(lengthInputField);
		return panel;

	}

	@SuppressWarnings("unchecked")
	private JPanel createColorBox() {
		JPanel panel = new JPanel();
		colorBox = new JComboBox<String>();
		colorBox.addItem("Red");
		colorBox.addItem("Pink");
		colorBox.addItem("Yellow");
		colorBox.addItem("Green");
		colorBox.addItem("Blue");
		colorBox.addItem("Purple");
		confirmButton = new JButton("Add Item");
		confirmButton.addActionListener(new ButtonConfirm());
		panel.add(colorBox);
		panel.add(confirmButton);
		return panel;

	}

	private void createDisplay() {

		displayArea = new JTextArea(10, 20);
		JScrollPane scrollPane = new JScrollPane(displayArea);
		JPanel panelCenter = new JPanel();
		panelCenter.add(scrollPane);
		frame.add(panelCenter, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		E20_9 frame = new E20_9();

	}

}
