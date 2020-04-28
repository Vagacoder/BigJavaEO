package ch23;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
*
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