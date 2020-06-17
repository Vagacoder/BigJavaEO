package ch21;

import java.io.IOException;
import java.util.Scanner;

/*
 * This program demonstrates random access. You can access existing accounts and
 * deposit money, or create new accounts. The accounts are saved in a random
 * access file.
 * 
 * E21.6 Modify the BankSimulator program in Section 21.3 so that it is possible 
 * to delete an account. ­To delete a record from the data file, fill the record 
 * with zeroes.
 * 
 * E21.7 The data file in Exercise E21.6 may end up with many deleted records that 
 * take up space. Write a program that compacts such a file, moving all active 
 * records to the beginning and shortening the file length. Hint: Use the setLength 
 * method of the Random­AccessFile class to truncate the file length. Look up the 
 * method’s behavior in the API documentation.
 * 
 */
public class BankSimulator {
   public static void main(String[] args) throws IOException {
      try (Scanner in = new Scanner(System.in); BankData data = new BankData()) {
         data.open("data/bank.dat");

         boolean done = false;
         while (!done) {
            System.out.print("Account number: ");
            int accountNumber = in.nextInt();

            // * E21.16
            System.out.print("Delete Account? [Y/N]: ");
            String delete = in.next().toUpperCase();

            // * Not delete account
            if(!delete.equals("Y")){
               System.out.print("Amount to deposit: ");
               double amount = in.nextDouble();

               int position = data.find(accountNumber);
               BankAccount account;
               if (position >= 0) {
                  account = data.read(position);
                  account.deposit(amount);
                  System.out.println("New balance: " + account.getBalance());
               } else // Add account
               {
                  account = new BankAccount(accountNumber, amount);
                  position = data.size();
                  System.out.println("Adding new account.");
               }
               data.write(position, account);

               System.out.print("Done? (Y/N) ");
               String input = in.next();
               if (input.equalsIgnoreCase("Y")) {
                  done = true;
               }
            }
            // * delete account
            else{
               int position = data.find(accountNumber);
               if(position>=0){
                  data.write(position, new BankAccount(0, 0));
               }else{
                  System.out.println("Account not found!");
               }

               System.out.print("Done? (Y/N) ");
               String input = in.next();
               if (input.equalsIgnoreCase("Y")) {
                  done = true;
               }
            }
         }

         // * E21.7
         data.cleanRecordFile();
      }
   }
}
