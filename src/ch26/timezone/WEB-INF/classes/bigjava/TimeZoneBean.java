package bigjava;

import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
   This bean formats the local time of day for a given city.
*/
@ManagedBean
@SessionScoped
public class TimeZoneBean
{
   private DateFormat timeFormatter;
   private String city;
   private TimeZone zone;

   /**
      Initializes the formatter.
   */
   public TimeZoneBean()
   {
      timeFormatter = DateFormat.getTimeInstance();
   }

   /**
      Setter for city property.
      @param aCity the city for which to report the local time
   */
   public void setCity(String aCity)
   {      
      city = aCity;
   }
   
   /**
      Getter for city property.
      @return the city for which to report the local time
   */
   public String getCity()
   {
      return city;
   }

   /**
      Read-only time property.
      @return the formatted time
   */
   public String getTime()
   {
      if (zone == null) { return "not available"; }
      timeFormatter.setTimeZone(zone);
      Date time = new Date();
      String timeString = timeFormatter.format(time);
      return timeString;
   }

   /**
      Action for checking a city.
      @return "next" if time zone information is available for the city,
      "error" otherwise
   */
   public String checkCity()
   {
      zone = getTimeZone(city);      
      if (zone == null) { return "error"; }
      return "next";
   }

   /**
      Looks up the time zone for a city.
      @param aCity the city for which to find the time zone
      @return the time zone or null if no match is found
   */
   private static TimeZone getTimeZone(String aCity)
   {
      String[] ids = TimeZone.getAvailableIDs();
      for (int i = 0; i < ids.length; i++)
      {
         if (timeZoneIDmatch(ids[i], aCity))
         {
            return TimeZone.getTimeZone(ids[i]);
         }
      }
      return null;
   }

   /**
      Checks whether a time zone ID matches a city.
      @param id the time zone ID (e.g. "America/Los_Angeles")
      @param aCity the city to match (e.g. "Los Angeles")
      @return true if the ID and city match
   */
   private static boolean timeZoneIDmatch(String id, String aCity)
   {
      String idCity = id.substring(id.indexOf('/') + 1);
      return idCity.replace('_', ' ').equals(aCity);
   }
}
