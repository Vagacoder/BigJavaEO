package ch23;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/*
* P23.2 Implement a client-server program in which the client will print the date 
and time given by the server. Two classes should be implemented: DateClient and 
DateServer.

The DateServer simply prints new Date().toString() whenever it accepts a connection
and then closes the socket.


*/

public class DateServer {

    public static void main(String[] args) {

        try {
            ServerSocket dateServer = new ServerSocket(8888);
            
            while(true){
                System.out.println("Waiting for connect ...");
                Socket dateServiceSocket = dateServer.accept();
                System.out.println("Client connected ...");
                PrintWriter writer = new PrintWriter(dateServiceSocket.getOutputStream());
                writer.println(new Date().toLocaleString());
                writer.flush();
                dateServiceSocket.close();
                System.out.println("Client disconnected ...");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}