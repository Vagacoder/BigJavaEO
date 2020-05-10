package ch23;

import java.io.IOException;
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

*/

public class BankAdminService implements Runnable{

    private IBankServerListener bankServer;
    private Socket s;
    private Scanner in;
    private PrintWriter out;
    private String password = "123";
    private boolean isLogin = false;

    public BankAdminService(Socket socket){
        this.s = socket;
    }

    @Override
    public void run() {
        try {
            try {
                in = new Scanner(s.getInputStream());
                out = new PrintWriter(s.getOutputStream());
                doService();
            }finally{
                s.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void doService(){
        while(bankServer.isRunning()){
            if(!in.hasNext()){
                System.out.println("admin service is done.");
                return;
            }
            System.out.println("admin service is on ...");
            String command = in.next();
            executeCommand(command);
        }
    }

    private void executeCommand(String command){
        if(command.equals("LOGIN")){
            String input = in.next();
            if(input.equals(this.password)){
                this.isLogin = true;
                out.println("Login successfully");
                out.flush();
            }else{
                out.println("Wrong password");
                out.flush();
            }
        }else if(command.equals("LOGOUT")){
            isLogin = false;
            out.println("Logout ...");
            out.flush();
        } else if(command.equals("PASSWORD")){
            String input = in.next();
            if(this.isLogin){
                this.password = input;
                out.println("Password reset");
                out.flush();
            }else{
                out.println("Please login first");
                out.flush();
            }
        }else if(command.equals("STATUS")){
            if(this.isLogin){
                out.println(this.bankServer.getNumberOfClient());
                out.flush();
            }else{
                out.println("Please login first");
                out.flush();
            }
        }else if(command.equals("SHUTDOWN")){
            if(this.isLogin){
                System.out.println("Admin shutdown service ...");
                out.println("SHUTING DOWN ... ");
                out.flush();
                this.bankServer.onShutDown();
                return;
            }else{
                out.println("Please login first");
                out.flush();
            }
        }else{
            out.println("Invalid command");
            out.flush();
        }
    }

    public void addBankServerListener(IBankServerListener listener){
        this.bankServer = listener;
    }
}