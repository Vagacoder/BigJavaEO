package ch24;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * A graphical simulation of an automatic teller machine
 */
public class ATMViewer {
   public static void main(String[] args) throws IOException, ClassNotFoundException {
      if (args.length == 0) {
         JOptionPane.showMessageDialog(null, "Usage: ATMViewer propertiesFile");
         return;
      } else {
         try {
            SimpleDataSource.init(args[0]);
         } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "Can't connect to database");
            return;
         } catch (ClassNotFoundException exception) {
            JOptionPane.showMessageDialog(null, "Can't connect to database");
            return;
         }
      }

      ATM theATM;

      Bank theBank = new Bank();
      theATM = new ATM(theBank);

      JFrame frame = new ATMFrame(theATM);
      frame.setTitle("First National Bank of Java");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
