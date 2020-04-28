package ch23;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*

*/

public class BankService implements Runnable {

    private Socket s;
    private Scanner in;
    private PrintWriter out;
    private Bank bank;

    public BankService(Socket socket, Bank bank){
        this.s = socket;
        this.bank = bank;
    }

    @Override
    public void run() {
        try{
            try{
                in = new Scanner(s.getInputStream());
                out = new PrintWriter(s.getOutputStream());
                doService();
            }finally{
                s.close();
            }
        }catch(IOException ex){
            ex.getMessage();
            ex.printStackTrace();
        }
    }

    public void doService() throws IOException{
        while(true){
            if(!in.hasNext()){
                System.out.println("service is done.");
                return;
            }
            System.out.println("doService() calling ...");
            String command = in.next();
            if(command.equals("QUIT")){
                return;
            }else{
                executeCommand(command);
            }   
        }
    }

    public void executeCommand(String command){
        int account = in.nextInt();
        if(command.equals("DEPOSIT")){
            double amount = in.nextDouble();
            bank.deposit(account, amount);
        }else if(command.equals("WITHDRAW")){
            double amount = in.nextDouble();
            bank.withdraw(account, amount);
        }else if(!command.equals("BALANCE")){
            out.println("Invalid command");
            out.flush();
            return;
        }
        out.println(account + " " + bank.getBalance(account));
        out.flush();
    }

}