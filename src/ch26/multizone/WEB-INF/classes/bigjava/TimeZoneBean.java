package bigjava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.sql.DataSource;

/**
   This bean formats the local time of day for a given city.
*/
@ManagedBean
@SessionScoped
public class TimeZoneBean
{
   @Resource(name="jdbc/__default")
   private DataSource source;
   
   private DateFormat timeFormatter;
   private ArrayList<String> cities;
   private String cityToAdd;
   private String cityToRemove;

   /**
      Initializes the formatter.
   */
   public TimeZoneBean()
   {
      timeFormatter = DateFormat.getTimeInstance();
      cities = new ArrayList<>();
   }

   /**
      Setter for cityToAdd property.
      @param city the city to add to the list of cities
   */
   public void setCityToAdd(String city)
   {      
      cityToAdd = city;
   }
   
   /**
      Getter for cityToAdd property.
      @return the city to add to the list of cities
   */
   public String getCityToAdd()
   {
      return cityToAdd;
   }
   
   /**
      Setter for the cityToRemove property.
      @param city the city to remove from the list of cities
   */
   public void setCityToRemove(String city) 
   {      
      cityToRemove = city;
   }

   /**
      Getter for the cityToRemove property.
      @return the city to remove from the list of cities
   */
   public String getCityToRemove() 
   {      
      return cityToRemove;
   }
   
   /**
      Read-only citiesAndTimes property.
      @return a map containing the cities and formatted times
   */
   public Map<String, String> getCitiesAndTimes()
   {
      Date time = new Date();
      Map<String, String> result = new TreeMap<>();
      for (int i = 0; i < cities.size(); i++)
      {
         String city = cities.get(i);
         String label = city + ": ";
         TimeZone zone = getTimeZone(city);
         if (zone != null)
         {
            timeFormatter.setTimeZone(zone);
            String timeString = timeFormatter.format(time);
            label = label + timeString;            
         }
         else 
         {
            label = label + "unavailable";            
         }
         result.put(label, city);
      }

      return result;
   }

   /**
      Action for adding a city.
      @return "next" if time zone information is available for the city,
      "error" otherwise
   */
   public String addCity()
   {
      TimeZone zone = getTimeZone(cityToAdd);      
      if (zone == null) { return "error"; }
      cities.add(cityToAdd);
      cityToRemove = cityToAdd;
      cityToAdd = "";
      return "next";
   }

   /**
      Action for removing a city.
      @return null if there are more cities to remove, "index" otherwise
   */
   public String removeCity()
   {
      cities.remove(cityToRemove);
      if (cities.size() > 0) { return null; }
      else { return "index"; }
   }
   
   /**
      Looks up the time zone for a city
      @param city the city for which to find the time zone
      @return the time zone or null if no match is found
   */
   private TimeZone getTimeZone(String city)
   {
      String[] ids = TimeZone.getAvailableIDs();
      for (int i = 0; i < ids.length; i++)
      {
         if (timeZoneIDmatch(ids[i], city))
         {
            return TimeZone.getTimeZone(ids[i]);
         }
      }
      try
      {
         String id = getZoneNameFromDB(city);
         if (id != null)
         {
            return TimeZone.getTimeZone(id);
         }
      }
      catch (Exception ex)
      {
         Logger.global.info("Caught in TimeZone.getTimeZone: " 
               + ex);
      }
      return null;
   }

   private String getZoneNameFromDB(String city) 
      throws SQLException
   {
      if (source == null) 
      {
         Logger.global.info("No database connection");
         return null;
      }
      try (Connection conn = source.getConnection())
      {
         PreparedStatement stat = conn.prepareStatement(
            "SELECT Zone FROM CityZone WHERE City=?");
         stat.setString(1, city);
         ResultSet result = stat.executeQuery();
         if (result.next()) { return result.getString(1); }
         else { return null; }
      }
   }

   /**
      Checks whether a time zone ID matches a city
      @param id the time zone ID (e.g. "America/Los_Angeles")
      @param city the city to match (e.g. "Los Angeles")
      @return true if the ID and city match
   */
   private static boolean timeZoneIDmatch(String id, String city)
   {
      String idCity = id.substring(id.indexOf('/') + 1);
      return idCity.replace('_', ' ').equals(city);
   }
}
