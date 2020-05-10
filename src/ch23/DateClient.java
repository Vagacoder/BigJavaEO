package ch23;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
* P23.2 Implement a client-server program in which the client will print the date 
and time given by the server. Two classes should be implemented: DateClient and 
DateServer.

The DateServer simply prints new Date().toString() whenever it accepts a connection
and then closes the socket.


*/

public class DateClient {

    public static void main(String[] args) {


        try (Socket socket = new Socket("localhost", 8888);) {
            
            Scanner scanner = new Scanner(socket.getInputStream());
            // PrintWriter printeWriter = new PrintWriter(socket.getOutputStream());
            
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
         } catch (Exception e) {
            e.printStackTrace();
        }


    }
}