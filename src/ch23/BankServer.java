package ch23;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
* E23.4
Modify the BankServer program to provide complete error checking. For example,
the program should check to make sure that there is enough money in the account
when withdraw­ing. Send appropriate error reports back to the client. Enhance the
protocol to be similar to HTTP, in which each server response starts with a number
indicating the success or failure condition, followed by a string with response 
data or an error description.

*/

public class BankServer {

    public static void main(String[] args) throws IOException {
        final int ACCOUNT_LENGTH = 10;
        final int SBAP_PORT = 8888;

        Bank bank = new Bank(ACCOUNT_LENGTH);

        ServerSocket server = new ServerSocket(SBAP_PORT);
        System.out.println("Waiting for clients to connect...");

        while (true) {
            Socket s = server.accept();
            System.out.println("Client connected.");
            BankService service = new BankService(s, bank);
            Thread t = new Thread(service);
            t.start();
        }

    }
}