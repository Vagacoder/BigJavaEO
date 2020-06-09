package ch19;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch10.BankAccount;

/*
 * E19.8 Write a program that sorts an array of bank accounts by increasing balance. 
 * Pass an appropriate lambda expression to Arrays.sort.
 * 
 */
public class E19_8 {
   
    public static void main(String[] args){

        BankAccount[] accounts = {
            new BankAccount(300),
            new BankAccount(600),
            new BankAccount(200),
            new BankAccount(500),
            new BankAccount(900),
            new BankAccount(700),
            new BankAccount(400),
            new BankAccount(100),
            new BankAccount(800)
        };

        Stream<BankAccount> accStream = Stream.of(accounts);

        List<BankAccount> result = accStream.sorted((a, b)-> (int) (a.getBalance() - b.getBalance()))
        .collect(Collectors.toList());

        for(BankAccount acc : result){
            System.out.println(acc.getBalance());
        }
    }
}