package ch09;

import java.io.*;
import java.util.*;

public class AppointmentBook {

    Appointment[] appBook = new Appointment[10];
    int numberOfAppointment = 0;

    public void addOneTine(String description, int year, int month, int day) {
	OneTime newOneTime = new OneTime();
	newOneTime.description = description;
	newOneTime.year = year;
	newOneTime.month = month;
	newOneTime.day = day;
	appBook[numberOfAppointment] = newOneTime;
	numberOfAppointment++;
    }

    public void addMonthly(String description, int year, int month, int day) {
	Monthly newMonthly = new Monthly();
	newMonthly.description = description;
	newMonthly.year = year;
	newMonthly.month = month;
	newMonthly.day = day;
	appBook[numberOfAppointment] = newMonthly;
	numberOfAppointment++;
    }

    public void addDaily(String description, int year, int month, int day) {
	Daily newDaily = new Daily();
	newDaily.description = description;
	newDaily.year = year;
	newDaily.month = month;
	newDaily.day = day;
	appBook[numberOfAppointment] = newDaily;
	numberOfAppointment++;
    }

    public void save(String fileName) throws FileNotFoundException {
	// ArrayList<String> file = new ArrayList<>();
	PrintWriter out = new PrintWriter(fileName);
	for (Appointment app : appBook) {
	    String type = "";
	    if (app instanceof OneTime) {
		type = "1";
	    } else if (app instanceof Monthly) {
		type = "2";
	    } else if (app instanceof Daily) {
		type = "3";
	    }
	    String entry = app.description + "\t " + app.year + "\t" + app.month + "\t" + app.day + "\t" + type;
	    // file.add(entry);
	    out.print(entry);
	}

	out.close();
    }

    public void load(String fileName) throws FileNotFoundException {
	ArrayList<Appointment> apps = new ArrayList<>();
	Scanner in = new Scanner(new File(fileName));
	int lineNumber = 0;
	while (in.hasNextLine()) {
	    lineNumber++;
	    String line = in.nextLine();
	    String[] lineParts = line.split("\t");
	    if (lineParts.length != 5) {
		System.out.println("wrong format at line " + lineNumber);
		continue;
	    }
	    String description = lineParts[0];
	    String year = lineParts[1];
	    String month = lineParts[2];
	    String day = lineParts[3];
	    String type = lineParts[4];
	    if (type.equals("1")) {
		OneTime newApp = new OneTime();
		newApp.description = description;
		newApp.year = Integer.parseInt(year);
		newApp.month = Integer.parseInt(month);
		newApp.day = Integer.parseInt(day);
		apps.add(newApp);
	    } else if (type.equals("2")) {
		Monthly newApp = new Monthly();
		newApp.description = description;
		newApp.year = Integer.parseInt(year);
		newApp.month = Integer.parseInt(month);
		newApp.day = Integer.parseInt(day);
		apps.add(newApp);
	    } else if (type.equals("3")) {
		Daily newApp = new Daily();
		newApp.description = description;
		newApp.year = Integer.parseInt(year);
		newApp.month = Integer.parseInt(month);
		newApp.day = Integer.parseInt(day);
		apps.add(newApp);
	    } else {
		System.out.println("wrong class at line " + lineNumber);
		continue;
	    }

	    appBook = new Appointment[apps.size()];
	    apps.toArray(appBook);
	}
    }
}
