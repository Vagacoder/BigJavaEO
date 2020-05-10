package ch23;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/*
* P23.5 A query such as:

    http://aa.usno.navy.mil/cgi-bin/aa_moonphases.pl?year=2011

returns a page containing the moon phases in a given year. Write a program that asks
the user for a year, month, and day and then prints the phase of the moon on that day
*/

public class MoonPhase {

    public static void main(String[] args) {

        String endpoint = "http://aa.usno.navy.mil/cgi-bin/aa_moonphases.pl?";
        Scanner keyBoardIn = new Scanner(System.in);

        do {
            System.out.print("Please enter year (2021): ");
            String year = keyBoardIn.nextLine();
            System.out.print("Please enter month (1-12): ");
            String month = keyBoardIn.nextLine();
            System.out.print("Please enter day (1-31): ");
            String day = keyBoardIn.nextLine();

            try {
                URL url = new URL(endpoint + "year=" + year + "month=" + month + "day=" + day);
                URLConnection connection = url.openConnection();

                HttpURLConnection httpCon = (HttpURLConnection) connection;
                int resCode = httpCon.getResponseCode();
                String resMessage = httpCon.getResponseMessage();
                System.out.println(resCode + " " + resMessage);

                if(resCode != HttpURLConnection.HTTP_OK){
                    return;
                }

                Scanner httpIn = new Scanner(httpCon.getInputStream());

                while(httpIn.hasNextLine()){
                    String input = httpIn.nextLine();
                    System.out.println(input);
                }

                httpIn.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            

        } while (keyBoardIn.hasNext());

        keyBoardIn.close();

    }
}