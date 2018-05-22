package ch10;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
   This program displays the growth of an investment. 
*/
public class InvestmentViewer2
{  
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 100;

   private static final double INTEREST_RATE = 10;
   private static final double INITIAL_BALANCE = 1000;

   public static void main(String[] args)
   {  
      JFrame frame = new JFrame();

      // The button to trigger the calculation
      JButton button = new JButton("Add Interest");

      // The application adds interest to this bank account
      final BankAccount account = new BankAccount(INITIAL_BALANCE);

      // The label for displaying the results
      final JLabel label = new JLabel("balance: " + account.getBalance());

      // The panel that holds the user interface components
      JPanel panel = new JPanel();
      panel.add(button);
      panel.add(label);      
      frame.add(panel);
      
//      frame.add(label);
//      frame.add(button);
  
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            double interest = account.getBalance() * INTEREST_RATE / 100;
            account.deposit(interest);
            label.setText("balance: " + account.getBalance());
         }            
      }

      ActionListener listener = new AddInterestListener();
      button.addActionListener(listener);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
