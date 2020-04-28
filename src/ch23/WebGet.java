package ch23;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* E23.1 Modify the WebGet program to print only the HTTP header of the returned HTML
page. The HTTP header is the beginning of the response data.


*/
public class WebGet {

    public static void main(String[] args) {

        String host = "horstmann.com";
        String resource = "/";
        // * E23.1
        boolean isHeaderOnly = false;

        if (args.length == 2) {
            host = args[0];
            resource = args[1];
        } else if(args.length == 3){
            host = args[0];
            resource = args[1];
            isHeaderOnly = Boolean.parseBoolean(args[2]);
        } else {
            System.out.println("Getting " + resource + " from " + host);
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
            PrintWriter fileOut = new PrintWriter("output/log.txt");
            String fileContent = "";

            // * Send command
            // ! HTTP/1.1 defines the sequence CR LF (\r\n) as the end-of-line marker 
            // ! for all protocol elements except the entity-body
            String command = "GET " + resource + " HTTP/1.1\r\nHost: " + host + "\r\n\r\n";
            System.out.println(command);
            out.print(command);

            // ! Since new line character depends on system, statements below
            // ! don't work in Linux, since println() add only \n at the end of line
            // out.println("GET " + resource + "HTTP/1.1");
            // out.println("Host: " + host);
            // out.println();

            out.flush();

            // * E23.2
            String title = "";
            Pattern p = Pattern.compile("<title>([\\w\\W]+?)</title>");
            
            while(in.hasNextLine()){
                // * Scanner.nextLine() excludes any line separator at the end
                String input = in.nextLine();
                if(isHeaderOnly && input.trim().equals("")){
                    break;
                }
                Matcher m = p.matcher(input);
                if(m.find()){
                    title = m.group(1);
                }
                System.out.println(input);
                fileContent += (input + "\n");
            }
            System.out.println("Title is: " + title);
            fileOut.println(fileContent);
            in.close();
            out.close();
            fileOut.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}