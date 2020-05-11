package ch23;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/*
* P23.6 A page such as: 

! http://www.nws.noaa.gov/view/states.php  (it is not working now)

contains links to pages showing the weather reports for many cities in the fifty states.
Write a program that asks the user for a state and city and then prints the weather
report.

* Try to mimic service
*/

public class WeatherForCity {

    private String endpoint = "http://www.nws.noaa.gov/view/states.php";
    private String cityName;
    private String stateName;

    public WeatherForCity() {
    }

    public void setCityAndStateNames(String city, String state) {
        this.cityName = city;
        this.stateName = state;
    }

    public void getWeather() {
        try {
            URL weatherUrl = new URL(endpoint + "?state=" + stateName + "&city=" + cityName);
            URLConnection weatherConnection = weatherUrl.openConnection();
            
            HttpURLConnection httpWeatherConnection = (HttpURLConnection) weatherConnection;
            int code = httpWeatherConnection.getResponseCode();
            String message = httpWeatherConnection.getResponseMessage();
            System.out.println(code + " " + message);
            if(code != HttpURLConnection.HTTP_OK){
                return;
            }

            Scanner weatherIn = new Scanner(weatherConnection.getInputStream());
            
            while(weatherIn.hasNextLine()){
                String input = weatherIn.nextLine();
                System.out.println(input);
            }


            weatherIn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }



    public static void main(String[] args){
        WeatherForCity weatherService = new WeatherForCity();
        System.out.println("Welcome to weather service ...");
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Please enter the state name (-1 for terminate): ");
            String stateName = scanner.nextLine();
            if(stateName.equals("-1")){
                break;
            }
            System.out.print("Please enter the city name  (-1 for terminate): ");
            String cityName = scanner.nextLine();
            if(cityName.equals("-1")){
                break;
            }
            weatherService.setCityAndStateNames(cityName, stateName);
            weatherService.getWeather();
            System.out.println("================");
        } while(true);
        scanner.close();
    }
    
}