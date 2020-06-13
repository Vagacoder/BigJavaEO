package ch19;

/*
 * for E19.18 
 */
public class Country1 {
    private String name;
    private int population;
    private int area;
 
    public Country1(String line) {
       String[] fields = line.split("\\|");
       name = fields[0];
       population = Integer.parseInt(fields[1]);
       area = Integer.parseInt(fields[2]);
    }
 
    public String getName() {
       return name;
    }
 
    public int getPopulation() {
       return population;
    }

    public int getArea(){
        return this.area;
    }
 
    public String toString() {
       return name + "|" + population + "|" + area;
    }
}