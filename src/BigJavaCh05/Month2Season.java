<<<<<<< HEAD
package BigJavaCh05;

public class Month2Season {
	
	private int month;
	private int day;
	private String season;
	
	public Month2Season (int month, int day) {
		
		this.month = month;
		this.day = day;
		
	}
	
	public String getSeason() {
		
		if (month == 1 || month ==2 || month == 3) {season = "Winter";}
		else if (month == 4 || month == 5|| month == 6) {season = "Spring";}
		else if (month == 7 || month == 8 || month == 9 ) {season = "Summer";}
		else if (month == 10 || month == 11 || month == 12) {season = "Fall";}
		
		if (month%3 == 0 && day >= 21) 
		{ if (season.equals("Winter")) {season = "Spring";}
		else if (season.equals("Spring")) {season = "Summer";}
		else if (season.equals("Summer")) {season = "Fall";}
		else if (season.equals("Fall")) {season = "Winter";}
			
		}
		
		return season;
	}
	
}
=======
package BigJavaCh05;

public class Month2Season {
	
	private int month;
	private int day;
	private String season;
	
	public Month2Season (int month, int day) {
		
		this.month = month;
		this.day = day;
		
	}
	
	public String getSeason() {
		
		if (month == 1 || month ==2 || month == 3) {season = "Winter";}
		else if (month == 4 || month == 5|| month == 6) {season = "Spring";}
		else if (month == 7 || month == 8 || month == 9 ) {season = "Summer";}
		else if (month == 10 || month == 11 || month == 12) {season = "Fall";}
		
		if (month%3 == 0 && day >= 21) 
		{ if (season.equals("Winter")) {season = "Spring";}
		else if (season.equals("Spring")) {season = "Summer";}
		else if (season.equals("Summer")) {season = "Fall";}
		else if (season.equals("Fall")) {season = "Winter";}
			
		}
		
		return season;
	}
	
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
