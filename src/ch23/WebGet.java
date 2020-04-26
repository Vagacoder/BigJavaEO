package ch23;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WebGet {

    public static void main(String[] args) {

        String host;
        String resource;

        if (args.length == 2) {
            host = args[0];
            resource = args[1];
        } else {
            System.out.println("Getting / from horstmann.com");
            host = "hosrtmann.com";
            resource = "/";
        }

        // * Open socket
        final int HTTP_PORT = 80;
        try (Socket s = new Socket(host, HTTP_PORT)) {

            // * Get streams
            InputStream instream = s.getInputStream();
            OutputStream outstream = s.getOutputStream();

            // * Turn on streams into scanner and writer
            Scanner in = new Scanner(instream);
            PrintWriter out = new PrintWriter(outstream);

            // * Send command
            String command = "GET " + resource + " HTTP/1.1\n" + "Host: " + host
            +"\n\n";
            out.print(command);
            out.flush();

            while(in.hasNextLine()){
                String input = in.nextLine();
                System.out.println(input);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}