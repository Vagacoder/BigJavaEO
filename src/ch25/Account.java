package ch25;

/*
 * for E25.4 
 */

public class Account {

    int number;
    double balance;

    public Account(int number){
        this.number = number;
        this.balance = 0;
    }

    public Account(int number, double balance){
        this(number);
        this.balance = balance;
    }
}