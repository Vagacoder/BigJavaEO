package ch23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
*  E23.3 Modify the BankServer program so that it can be terminated more elegantly. 
Provide another socket on port 8889 through which an administrator can log in. 

Support the commands LOGIN password, STATUS, PASSWORD newPassword, LOGOUT, and 
SHUTDOWN. 

The STATUS command should display the total number of clients that have logged 
in since the server started.

* E23.4
Modify the BankServer program to provide complete error checking. For example,
the program should check to make sure that there is enough money in the account
when withdraw­ing. Send appropriate error reports back to the client. Enhance the
protocol to be similar to HTTP, in which each server response starts with a number
indicating the success or failure condition, followed by a string with response 
data or an error description.
*/

public class BankService2 implements Runnable {

    private Socket s;
    private Scanner in;
    private PrintWriter out;
    private Bank bank;
    private IBankServerListener bankServer;

    public BankService2(Socket socket, Bank bank){
        this.s = socket;
        this.bank = bank;
    }

    @Override
    public void run() {
        try{
            try{
                in = new Scanner(s.getInputStream());
                out = new PrintWriter(s.getOutputStream());
                out.println("Welcome to bank service");
                doService();
            }finally{
                s.close();
                in.close();
                out.close();
            }
        }catch(IOException ex){
            ex.getMessage();
            ex.printStackTrace();
        }
    }

    private void doService() throws IOException{
        while(bankServer.isRunning()){
            if(!in.hasNext()){
                System.out.println("Client service is done.");
                return;
            }
            System.out.println("doService() calling ...");
            String command = in.next();
            if(command.equals("QUIT") || !bankServer.isRunning()){
                System.out.println("Client service is done.");
                out.println("Client disconneting ... ");
                out.flush();
                bankServer.clientDisconnect();
                return;
            }else{
                executeCommand(command);
            }   
        }
    }

    private void executeCommand(String command){
        int account = in.nextInt();
        if(command.equals("DEPOSIT")){
            double amount = in.nextDouble();
            if(amount <= 0){
                out.println("Invalid ammout");
                out.flush();
            }else{
                bank.deposit(account, amount);
            }
        }else if(command.equals("WITHDRAW")){
            double amount = in.nextDouble();
            double currentBalance = bank.getBalance(account);
            if(currentBalance <= amount){
                out.println("Invalid ammout");
                out.flush();
            }else{
                bank.withdraw(account, amount);
            }
        }else if(!command.equals("BALANCE")){
            out.println("Invalid command");
            out.flush();
            return;
        }
        out.println(account + " " + bank.getBalance(account));
        out.flush();
    }

    public void addBankServerListener(IBankServerListener listener){
        this.bankServer = listener;
    }

}