package ch23;

import ch03.BankAccount;

/*

*/

public class Bank {

    private BankAccount[] accounts;

    public Bank(int size){
        accounts = new BankAccount[size];
        for(int i = 0; i < accounts.length; i ++){
            accounts[i] = new BankAccount();
        }
    }

    public void deposit(int accountNumber, double amount){
        BankAccount account = accounts[accountNumber];
        account.deposit(amount);
    }

    public void withdraw(int accountNumber, double amount){
        BankAccount account = accounts[accountNumber];
        account.withdraw(amount);
    }

    public double getBalance(int accountNumber){
        BankAccount account = accounts[accountNumber];
        return account.getBalance();
    }
}