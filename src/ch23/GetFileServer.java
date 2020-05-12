package ch23;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
* P23.3 Write a simple web server that recognizes only the GET request (without the Host:
request parameter and blank line). When a client connects to your server and sends a
command, such as GET filename HTTP/1.1, then return a header

    HTTP/1.1 200 OK

followed by a blank line and all lines in the file. 
If the file doesn’t exist, return 404 Not Found instead.

Your server should listen to port 8080. Test your web server by starting up your web
browser and loading a page, such as localhost:8080/c:\cs1\myfile.html.

*/

public class GetFileServer {

    final int FILE_SERVER_PORT = 8080;

    public GetFileServer() {
    }

    public void startService() {
    
        try {
            ServerSocket fileServer = new ServerSocket(FILE_SERVER_PORT);
            while(true){
                Socket fileServerInstance = fileServer.accept();
                Scanner in = new Scanner(fileServerInstance.getInputStream());
                PrintWriter out = new PrintWriter(fileServerInstance.getOutputStream());

                while(in.hasNext()){
                    String input = in.nextLine();
                    String[] inputs = input.split(" ");
                    if(inputs[0].equals("GET") && inputs[1].length()!= 0 & inputs[2].equals("HTTP/1.1")){
                        File file = new File(inputs[1]);
                        Scanner fileIn = new Scanner(file);
                        while(fileIn.hasNextLine()){
                            String line = fileIn.nextLine();
                            out.println(line);
                        }
                        out.flush();
                        fileIn.close();
                    }else{
                        out.println("Invalid request");
                        out.flush();
                    }
                }

                fileServer.close();
                in.close();
                out.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        GetFileServer fileServer = new GetFileServer();
        fileServer.startService();
    }
}