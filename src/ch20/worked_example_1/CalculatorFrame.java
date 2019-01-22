package ch20.worked_example_1;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
   This frame contains a panel that displays buttons
   for a calculator and a panel with a text fields to
   specify the result of calculation.
*/
public class CalculatorFrame extends JFrame
{  
   private JLabel display;
   private JCheckBox radianCheckBox;
   private JRadioButton baseeButton;
   private JRadioButton base10Button;
   private JRadioButton base2Button;
   private JComboBox mathOpCombo;
   private JButton mathOpButton;

   private double lastValue;
   private String lastOperator;
   private boolean startNewValue;   

   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 300;

   public CalculatorFrame()
   {
      createButtonPanel();
      createControlPanel();

      display = new JLabel("0");
      add(display, BorderLayout.NORTH);

      lastValue = 0;
      lastOperator = "=";
      startNewValue = true;

      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
      
   /**
      Creates the control panel with the text field 
      and buttons on the frame.
   */
   private void createButtonPanel()
   {      
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new GridLayout(4, 4));

      buttonPanel.add(makeDigitButton("7"));
      buttonPanel.add(makeDigitButton("8"));
      buttonPanel.add(makeDigitButton("9"));
      buttonPanel.add(makeOperatorButton("/"));
      buttonPanel.add(makeDigitButton("4"));
      buttonPanel.add(makeDigitButton("5"));
      buttonPanel.add(makeDigitButton("6"));
      buttonPanel.add(makeOperatorButton("*"));
      buttonPanel.add(makeDigitButton("1"));
      buttonPanel.add(makeDigitButton("2"));
      buttonPanel.add(makeDigitButton("3"));
      buttonPanel.add(makeOperatorButton("-"));
      buttonPanel.add(makeDigitButton("0"));
      buttonPanel.add(makeDigitButton("."));
      buttonPanel.add(makeOperatorButton("="));
      buttonPanel.add(makeOperatorButton("+"));

      add(buttonPanel, BorderLayout.CENTER);
   }

   class MathOpListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {  
         double value = Double.parseDouble(display.getText());
         String mathOp = (String) mathOpCombo.getSelectedItem();

         double base = 10;
         if (baseeButton.isSelected()) { base = Math.E; }
         else if (base2Button.isSelected()) { base = 2; }

         boolean radian = radianCheckBox.isSelected();
         if (!radian && (mathOp.equals("sin") 
               || mathOp.equals("cos") || mathOp.equals("tan")))
         {
            value = Math.toRadians(value);
         }

         if (mathOp.equals("sin"))
         {
            value = Math.sin(value);
         }
         else if (mathOp.equals("cos"))
         {
            value = Math.cos(value);
         }
         else if (mathOp.equals("tan"))
         {
            value = Math.tan(value);
         }
         else if (mathOp.equals("log"))
         {
            value = Math.log(value) / Math.log(base);
         }
         else if (mathOp.equals("exp"))
         {
            value = Math.pow(base, value);
         }
         display.setText("" + value);

         startNewValue = true;         
      }
   }

   private JPanel createBaseButtons()
   {
      baseeButton = new JRadioButton("e");
      base10Button = new JRadioButton("10");
      base2Button = new JRadioButton("2");

      baseeButton.setSelected(true);

      ButtonGroup group = new ButtonGroup();
      group.add(baseeButton);
      group.add(base10Button);
      group.add(base2Button);

      JPanel basePanel = new JPanel();
      basePanel.add(baseeButton);
      basePanel.add(base10Button);
      basePanel.add(base2Button);
      basePanel.setBorder(new TitledBorder(new EtchedBorder(), "Base"));
      
      return basePanel;
   }

   private void createControlPanel()
   {
      radianCheckBox = new JCheckBox("Radian");
      radianCheckBox.setSelected(true);

      mathOpCombo = new JComboBox();
      mathOpCombo.addItem("sin");
      mathOpCombo.addItem("cos");
      mathOpCombo.addItem("tan");
      mathOpCombo.addItem("log");
      mathOpCombo.addItem("exp");

      mathOpButton = new JButton("Apply");
      mathOpButton.addActionListener(new MathOpListener());

      JPanel controlPanel = new JPanel();
      controlPanel.add(radianCheckBox);
      controlPanel.add(createBaseButtons());
      controlPanel.add(mathOpCombo);
      controlPanel.add(mathOpButton);

      add(controlPanel, BorderLayout.SOUTH);
   }

   /**
      Combines two values with an operator.
      @param value1 the first value
      @param value2 the second value
      @param op an operator (+, -, *, /, or =)
   */
   public double calculate(double value1, double value2, String op)
   {  
      if (op.equals("+")) 
      {
         return value1 + value2;
      }
      else if (op.equals("-")) 
      {
         return value1 - value2;
      }
      else if (op.equals("*")) 
      {
         return value1 * value2;
      }
      else if (op.equals("/")) 
      {
         return value1 / value2;
      }
      else // "="
      {
         return value2;
      }
   }
   
   class DigitButtonListener implements ActionListener
   {
      private String digit;
      
      /**
         Constructs a listener whose actionPerformed method adds a digit
         to the display.
         @param aDigit the digit to add
      */
      public DigitButtonListener(String aDigit)
      {
         digit = aDigit;
      }
      
      public void actionPerformed(ActionEvent event)
      {  
         if (startNewValue) 
         {
            display.setText("");
            startNewValue = false;
         }
         display.setText(display.getText() + digit);
      }        
   }

   /**
      Makes a button representing a digit of a calculator.
      @param digit the digit of the calculator
      @return the button of the calculator
   */
   public JButton makeDigitButton(String digit)
   {
      JButton button = new JButton(digit);      
      ActionListener listener = new DigitButtonListener(digit);
      button.addActionListener(listener);  
      return button;    
   } 

   class OperatorButtonListener implements ActionListener
   {
      private String operator;

      /**
         Constructs a listener whose actionPerformed method
         schedules an operator for execution.
      */      
      public OperatorButtonListener(String anOperator)
      {
         operator = anOperator;
      }

      public void actionPerformed(ActionEvent event)
      {  
         if (!startNewValue)
         {  
            double value = Double.parseDouble(display.getText());
            lastValue = calculate(lastValue, value, lastOperator);
            display.setText("" + lastValue);
            startNewValue = true;
         }
            
         lastOperator = operator;
      }       
   }

   /**
      Makes a button representing an operator of a calculator.
      @param op the operator of the calculator
      @return the button of the calculator
   */
   public JButton makeOperatorButton(String op)
   {
      JButton button = new JButton(op);      
      ActionListener listener = new OperatorButtonListener(op);
      button.addActionListener(listener);  
      return button;    
   }     
}
