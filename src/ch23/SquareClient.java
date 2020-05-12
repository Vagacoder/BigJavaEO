package ch23;

import java.io.IOException;
import java.io.PrintWriter;
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

public class SquareClient {

    public static int SQUARE_SERVER_PORT = 8887;

    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", SQUARE_SERVER_PORT);
            Scanner in = new Scanner(s.getInputStream());
            PrintWriter out = new PrintWriter(s.getOutputStream());
            
            out.println("3");
            out.flush();
            String response = in.nextLine();
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}