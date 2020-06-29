package ch25;

import java.util.ArrayList;

/*
 * for E25.4 
 */

public class Bank {
    ArrayList<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account newAcct){
        this.accounts.add(newAcct);
    }
}