package ch24;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * A text-based simulation of an automatic teller machine
 */
public class ATMSimulator {
   public static void main(String[] args) 
   throws IOException, SQLException, ClassNotFoundException {
      if (args.length == 0) {
         System.out.println("Usage: ATMTester propertiesFile");
         return;
      } else {
         SimpleDataSource.init(args[0]);
      }

      Bank theBank = new Bank();
      ATM theATM = new ATM(theBank);

      Scanner in = new Scanner(System.in);

      while (true) {
         int state = theATM.getState();
         if (state == ATM.START) {
            System.out.print("Enter account number: ");
            int number = in.nextInt();
            theATM.setCustomerNumber(number);
         } else if (state == ATM.PIN) {
            System.out.print("Enter PIN: ");
            int pin = in.nextInt();
            theATM.selectCustomer(pin);
         } else if (state == ATM.ACCOUNT) {
            System.out.print("A=Checking, B=Savings, C=Quit: ");
            String command = in.next();
            if (command.equalsIgnoreCase("A")) {
               theATM.selectAccount(ATM.CHECKING);
            } else if (command.equalsIgnoreCase("B")) {
               theATM.selectAccount(ATM.SAVINGS);
            } else if (command.equalsIgnoreCase("C")) {
               theATM.reset();
            } else {
               System.out.println("Illegal input!");
            }
         } else if (state == ATM.TRANSACT) {
            System.out.println("Balance=" + theATM.getBalance());
            System.out.print("A=Deposit, B=Withdrawal, C=Cancel: ");
            String command = in.next();
            if (command.equalsIgnoreCase("A")) {
               System.out.print("Amount: ");
               double amount = in.nextDouble();
               theATM.deposit(amount);
               theATM.back();
            } else if (command.equalsIgnoreCase("B")) {
               System.out.print("Amount: ");
               double amount = in.nextDouble();
               theATM.withdraw(amount);
               theATM.back();
            } else if (command.equalsIgnoreCase("C")) {
               theATM.back();
            } else {
               System.out.println("Illegal input!");
            }
         }
      }
   }
}
