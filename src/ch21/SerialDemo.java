package ch21;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * This program demonstrates serialization of a Bank object. If a file with
 * serialized data exists, then it is loaded. Otherwise the program starts with
 * a new bank. Bank accounts are added to the bank. Then the bank object is
 * saved.
 */
public class SerialDemo {
   public static void main(String[] args) throws IOException, ClassNotFoundException {
      Bank firstBankOfJava;

      File f = new File("data/bankobj.dat");
      if (f.exists()) {
         try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f))) {
            firstBankOfJava = (Bank) in.readObject();
         }
      } else {
         firstBankOfJava = new Bank();
         firstBankOfJava.addAccount(new BankAccount(1001, 20000));
         firstBankOfJava.addAccount(new BankAccount(1015, 10000));
      }

      // Deposit some money
      BankAccount a = firstBankOfJava.find(1001);
      a.deposit(100);
      System.out.println(a.getAccountNumber() + ": " + a.getBalance());
      a = firstBankOfJava.find(1015);
      System.out.println(a.getAccountNumber() + ": " + a.getBalance());

      try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f))) {
         out.writeObject(firstBankOfJava);
      }
   }
}
