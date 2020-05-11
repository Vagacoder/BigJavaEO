package ch23;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* P23.7 A page such as:

    ! https://www.cia.gov/library/publications/the-world-factbook/geos/ca.html

contains information about a country (here Canada, with the symbol casee:

    ! https://www.cia.gov/library/publications/the-world-factbook/print/textversion.html 

for the country symbols). 

Write a program that asks the user for a country name and then prints the area 
and population.


*/

public class CountryInfo {

    private String countryCodesLink = "https://www.cia.gov/library/publications/the-world-factbook/appendix/appendix-d.html";
    private String endpointCiaGeo = "https://www.cia.gov/library/publications/the-world-factbook/geos/";

    public CountryInfo() {
    };

    public String getCountryInfor(String countryFullName) {
        String countryFullNameUpper = countryFullName.toUpperCase();
        String countryCode = "";
        String area = "";
        String population = "";

        try {
            // * get country short name, e.g. US for United States of America
            URL countryCodeUrl = new URL(countryCodesLink);
            URLConnection countryConnection = countryCodeUrl.openConnection();
            HttpURLConnection httpCountryCon = (HttpURLConnection) countryConnection;
            int countryResponseCode = httpCountryCon.getResponseCode();
            // String countryResponseMessage = httpCountryCon.getResponseMessage();
            if(countryResponseCode != HttpURLConnection.HTTP_OK){
                return "Country name service is not available";
            }

            Scanner countryCodeIn = new Scanner(countryConnection.getInputStream());
            int countryFound = 0;
            while (countryCodeIn.hasNextLine()){
                String line = countryCodeIn.nextLine();
                line = line.toUpperCase();
                if(countryFound == 0 || countryFound == 1){
                    if(line.contains(countryFullNameUpper)){
                        countryFound++;
                        // System.out.println("Found full name!");
                    }
                }else if(countryFound == 2){
                    Pattern p = Pattern.compile("<.+>(.+)</TD");
                    Matcher m = p.matcher(line);
                    if(m.find()){
                        countryCode = m.group(1);
                        System.out.println(countryCode);
                        break;
                    }
                }
            }
            countryCodeIn.close();

            if(countryCode.length() == 0){
                return "Bad country name";
            }

            // * retrieve country information
            URL ciaGeoUrl = new URL(endpointCiaGeo + countryCode.toLowerCase() + ".html");
            System.out.println(ciaGeoUrl);
            URLConnection ciaGeoConnection = ciaGeoUrl.openConnection();
            HttpURLConnection httpCiaGeoCon = (HttpURLConnection) ciaGeoConnection;
            int ciaGeoResponseCode = httpCiaGeoCon.getResponseCode();
            if(ciaGeoResponseCode != HttpURLConnection.HTTP_OK){
                return "Country information service is not available";
            }

            // * get area and population
            Scanner geoIn = new Scanner(ciaGeoConnection.getInputStream());
            // * search states: 0: init, 1: found correct id, 2: found sub tag, -1: search is done
            int areaSearchState = 0;
            int popSearchState = 0;
            while(geoIn.hasNextLine()){
                String line = geoIn.nextLine();

                // * search area
                if(areaSearchState == -1){
                    // * area already found, do nothing to skip
                } else if(areaSearchState == 0){
                    if(line.contains("id=\"field-area\"")){
                        areaSearchState = 1;
                    }
                }else if(areaSearchState == 1){
                    if(line.contains("total:")){
                        areaSearchState = 2;
                    }
                }else if(areaSearchState == 2){
                    Pattern p = Pattern.compile("<.+>(.+)</span");
                    Matcher m = p.matcher(line);
                    if(m.find()){
                        area = m.group(1);
                        areaSearchState = -1; // * area found
                    }
                }

                // * search population
                if(popSearchState == -1){
                    // * population already found, do nothing to skip
                }else if(popSearchState == 0){
                    if(line.contains("id=\"field-population\"")){
                        popSearchState = 1;
                    }
                }else if(popSearchState == 1){
                    Pattern p = Pattern.compile("<.+>(.+)</span");
                    Matcher m = p.matcher(line);
                    if(m.find()){
                        population = m.group(1);
                        popSearchState = -1; 
                    }
                }
            }

            if(area.length() == 0){
                area = "Area information is not available";
            }
            if(population.length() == 0){
                population = "Population information is not available";
            }

            return "Area: " + area + ", Population: " + population;

        } catch (Exception e) {
            e.printStackTrace();
        }



        return "";
    }


    public static void main(String[] args){

        CountryInfo service = new CountryInfo();
        Scanner keyIn = new Scanner(System.in);
        
        do{
        System.out.print("Please enter country name (e.g. United States of America, -1 to stop):");
        String countryFullName = keyIn.nextLine();
        
        if(countryFullName.equals("-1")){
            break;
        }

        String data = service.getCountryInfor(countryFullName);
        System.out.println(data);
        } while(true);

        keyIn.close();
    }
    
}