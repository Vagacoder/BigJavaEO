package ch23;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
* P23.1Write a client application that executes an infinite loop that
a. Prompts the user for a number.
b. Sends that value to the server.
c. Receives a number from the server.
d. Displays the new number.
Also write a server that executes an infi­nite loop whose body accepts a client connec-
tion, reads a number from the client, computes its square root, and writes the result
to the client.

*/

public class SquareServer {

    public static int SQUARE_SERVER_PORT = 8887;

    private ServerSocket sqServer;

    public SquareServer() {
    }

    public void startService() {
        try {
            sqServer = new ServerSocket(SQUARE_SERVER_PORT);
            Socket sqServerInstance = sqServer.accept();
            Scanner in = new Scanner(sqServerInstance.getInputStream());
            PrintWriter out = new PrintWriter(sqServerInstance.getOutputStream());

            while (in.hasNext()) {
                String input = in.nextLine();
                try {
                    double n = Double.parseDouble(input);
                    out.println(n * n);
                    out.flush();
                } catch (Exception e) {
                    out.println("Invalid number");
                    out.flush();
                }
            }
            in.close();
            out.close();
            sqServerInstance.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SquareServer sqs = new SquareServer();
        sqs.startService();
    }

}