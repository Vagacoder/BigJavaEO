package ch19;

public class Country {
   private String name;
   private int population;
   private String continent;

   public static Country parse(String line) {
      String[] fields = line.split("\\|");
      Country country = new Country();
      country.name = fields[0];
      country.continent = fields[1];
      country.population = Integer.parseInt(fields[2]);
      return country;
   }

   public String getName() {
      return name;
   }

   public String getContinent() {
      return continent;
   }

   public int getPopulation() {
      return population;
   }

   public String toString() {
      return name + "|" + continent + "|" + population;
   }
}
