package ch23;

import java.net.MalformedURLException;
import java.net.URL;

/*
* E23.5 Write a program to display the protocol, host, port, and file components of a URL.
Hint: Look at the API documentation of the URL class
*/

public class URlinfo {

    public static String getURLInfo(URL url) {

        String protocol = url.getProtocol();
        String host = url.getHost();
        int port = url.getPort();
        String file = url.getFile();

        return "Protocol: " + protocol + ", Hot: " + host + ", Port: " + port + ", File: " + file;
    }

    public static void main(String[] args) {
        URL url;
        try {
            url = new URL("https://www.google.com:80");
            System.out.println(getURLInfo(url));
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}