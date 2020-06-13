package ch19;

import java.util.List;

public class Movie 
{
   private String title;
   private int year;
   private List<String> directors;
   private List<String> producers;
   private List<String> actors;
		
   public Movie(String title, int year, List<String> directors,
         List<String> producers, List<String> actors) 
   {
      this.title = title;
      this.year = year;
      this.directors = directors;
      this.producers = producers;
      this.actors = actors;
   }

   public List<String> getActors() 
   {
      return actors;
   }

   public List<String> getDirectors() 
   {
      return directors;
   }

   public List<String> getProducers() 
   {
      return producers;
   }

   public String getTitle() 
   {
      return title;
   }

   public int getYear() 
   {
      return year;
   }
	
   public String toString() 
   {
      return "Name: " + title 
         + "\nYear: " + year
         + "\nDirected by: " + directors
         + "\nProduced by: " + producers
         + "\nActors: " + actors;
   }
}