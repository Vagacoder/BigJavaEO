package ch20;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
   This frame contains a panel that displays buttons
   for a calculator and a panel with a text fields to
   specify the result of calculation. The operator
   buttons don't do anything--see Worked Example 1
   for a working calculator.
*/
@SuppressWarnings("serial")
public class CalculatorFrame extends JFrame
{  
   private JLabel display;

   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 300;

   public CalculatorFrame()
   {
      display = new JLabel("0");
      add(display, BorderLayout.NORTH);
      createButtonPanel();
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
      
   /**
      Creates the button panel.
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

   /**
      Makes a button representing an operator of a calculator.
      @param op the operator of the calculator
      @return the button of the calcalator
   */
   public JButton makeOperatorButton(String op)
   {
      JButton button = new JButton(op);
      return button;    
   }     
}
