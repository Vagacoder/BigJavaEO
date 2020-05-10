package ch23;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

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

public class BankServer2 implements IBankServerListener {

    // * each bank server has 10 bank accounts
    static final int ACCOUNT_LENGTH = 10;

    // * bank client port is 8888
    static final int BAS_PORT = 8888;
    // * bank admin port is 8889
    static final int ADMIN_PORT = 8889;

    ServerSocket clientSocket;
    ServerSocket adminSocket;
    int numberOfClient = 0;
    Thread bankClientService;
    Thread bankAdminService;

    // * save this to variable
    BankServer2 thisServer;

    boolean isRunning = true;

    public BankServer2() {
        // * save this to variable
        thisServer = this;

        Bank bank = new Bank(ACCOUNT_LENGTH);

        bankClientService = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    clientSocket = new ServerSocket(BAS_PORT);
                    System.out.println("Waiting for client to connect ...");

                    while (isRunning) {
                        Socket clientSocketInstance = clientSocket.accept();
                        System.out.println("Client connected.");
                        numberOfClient++;
                        BankService2 bankService = new BankService2(
                            clientSocketInstance, bank);
                        bankService.addBankServerListener(thisServer);
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

        bankAdminService = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    adminSocket = new ServerSocket(ADMIN_PORT);
                    System.out.println("Waiting for admin to connect ...");

                    while (isRunning) {
                        Socket adminSocketInstance = adminSocket.accept();
                        System.out.println("Admin connected.");
                        BankAdminService adminService = new BankAdminService(
                            adminSocketInstance);
                        adminService.addBankServerListener(thisServer);
                        Thread t = new Thread(adminService);
                        t.start();
                    }

                    System.out.println("Shut down admin service ...");
                    return;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
    }

    public void startService() {
        bankClientService.start();
        bankAdminService.start();
    }

    @Override
    public int getNumberOfClient() {
        return this.numberOfClient;
    }

    @Override
    public void clientDisconnect() {
        this.numberOfClient--;
    }

    @Override
    public void onShutDown() {
        this.isRunning = false;
        try {
            clientSocket.close();
            adminSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isRunning() {
        return this.isRunning;
    }

    public static void main(String[] args) {
        BankServer2 bankServer = new BankServer2();
        bankServer.startService();
    }


}