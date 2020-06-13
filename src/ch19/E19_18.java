package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

/*
 * E19.18  Write a program that reads a Stream<Country> from a file that contains 
 * country names and numbers for the population and area. Print the most densely 
 * populated country.

 */
public class E19_18 {

    public static Country1 getNewCountry(String line) {
        return new Country1(line);
    }

    public static void main(String[] args) throws IOException {

        String filename = "data/worldPopArea.txt";

        Stream<String> lines = Files.lines(Paths.get(filename));
        Stream<Country1> countries = lines.map(l -> new Country1(l));
        System.out.println(countries.max(Comparator.comparing(c -> c.getPopulation()/c.getArea())).get().toString());

        lines.close();
    }

}