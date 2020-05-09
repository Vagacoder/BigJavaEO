package ch23;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import ch23.BankAdminService.bankServerListener;

/*
*  E23.3 Modify the BankServer program so that it can be terminated more elegantly. 
Provide another socket on port 8889 through which an administrator can log in. 

Support the commands LOGIN password, STATUS, PASSWORD newPassword, LOGOUT, and 
SHUTDOWN. 

The STATUS command should display the total number of clients that have logged 
in since the server started.

! This is totally new design of bankserver class. The problem description said 
modify. Is there any better answer for the problem?
*/

public class BankServer2{

    static final int ACCOUNT_LENGTH = 10;
    static final int BAS_PORT = 8888;
    static final int ADMIN_PORT = 8889;
    ServerSocket clientSocket;
    ServerSocket adminSocket;
    int numberOfClient = 0;
    Thread bankClientService;
    Thread bankAdminService;
    BankServer2 thisServer;
    boolean isRunning = true;

    public BankServer2(){
    thisServer = this;
    Bank bank = new Bank(ACCOUNT_LENGTH);

    bankClientService = new Thread(new Runnable(){

        @Override
        public void run() {
            try {
                clientSocket = new ServerSocket(BAS_PORT);
                System.out.println("Waiting for client to connect ...");

                while(isRunning){
                    Socket s = clientSocket.accept();
                    System.out.println("Client connected.");
                    numberOfClient++;
                    BankService2 bankService = new BankService2(s, bank, thisServer);
                    Thread t = new Thread(bankService);
                    t.start();
                }

            System.out.println("Shut down bank service ...");
            return;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    });

    bankAdminService = new Thread(new Runnable(){

		@Override
		public void run() {
            try {
                adminSocket = new ServerSocket(ADMIN_PORT);
                System.out.println("Waiting for admin to connect ...");
                
                while(isRunning){
                    Socket s = adminSocket.accept();
                    System.out.println("Admin connected.");
                    BankAdminService adminService = new BankAdminService(s, thisServer);
                    Thread t = new Thread(adminService);
                    t.start();
                }
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
			System.out.println("Shut down admin service ...");
		}

    });

    bankClientService.start();
    bankAdminService.start();
    }

    public int getNumberOfClient(){
        return this.numberOfClient;
    }

    public void onShutDown() {
        this.isRunning = false;
        try {
            clientSocket.close();
            adminSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        BankServer2 bankServer = new BankServer2();
    }


}