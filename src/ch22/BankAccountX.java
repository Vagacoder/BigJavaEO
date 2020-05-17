package ch22;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* The class is modified from BankAccoutn class.
! This is a good example of Lock and Condition, must understand it completely!

! Check paradigm of {lock/try/finally/unloc} in deposit() and withdraw()

*/

public class BankAccountX {

    private double balance;
    private Lock balanceChangeLock;
    private Condition sufficientFundsCondition;

    public BankAccountX() {
        this.balance = 0;
        this.balanceChangeLock = new ReentrantLock();
        this.sufficientFundsCondition = balanceChangeLock.newCondition();
    }

    public void deposit(double amount) {
        balanceChangeLock.lock();
        try {
            System.out.print("Depositing " + amount);
            double newBalance = balance + amount;
            System.out.println(", new balance is " + newBalance);
            this.balance = newBalance;
            this.sufficientFundsCondition.signalAll();
        } finally {
            balanceChangeLock.unlock();
        }
    }

    public void withdraw(double amount) throws InterruptedException {
        balanceChangeLock.lock();
        try {
            while (balance < amount) {
                sufficientFundsCondition.await();
            }
            System.out.print("Withdrawing " + amount);
            double newBalance = balance - amount;
            System.out.println(", new balance is " + newBalance);
            balance = newBalance;
        } finally {
            balanceChangeLock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }

    
}