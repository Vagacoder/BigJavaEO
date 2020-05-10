package ch23;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLGet {

    public static void main(String[] args) {

        String urlString;
        if (args.length == 1) {
            urlString = args[0];
        } else {
            // urlString = "http://horstmann.com/";
            urlString = "http://horstmann.com/wambat";       // 404
            // urlString = "http://hosrtmann.com/cay-tiny.gif";     // get picture
        }
        System.out.println("Using " + urlString);

        try {

            // * Open connection
            URL u = new URL(urlString);
            URLConnection connection = u.openConnection();

            // * Check if response code is HTTP_OK 200
            HttpURLConnection httpConnection = (HttpURLConnection) connection;
            int code = httpConnection.getResponseCode();
            String message = httpConnection.getResponseMessage();
            System.out.println(code + " " + message);
            if(code != HttpURLConnection.HTTP_OK){
                return;
            }

            // * Read server response
            InputStream instream = connection.getInputStream();
            Scanner in = new Scanner(instream);

            while(in.hasNextLine()){
                String input = in.nextLine();
                System.out.println(input);
            }
            in.close();;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}