package others;

import java.io.*;
import java.util.concurrent.*;

/**
 * 
 * This class is to Start AIMP player, and if current time matches preset stop
 * time, it stops AIMP player.
 * 
 * It uses several classes, including RunTime, TimeUnit.
 * 
 * @author Skuller
 *
 */

public class RunTimeTester {

    public static void main(String[] args) throws IOException, InterruptedException {

	// start AIMP player
	Runtime.getRuntime().exec("D:\\AIMP\\AIMP.exe", null, new File("D:\\AIMP\\"));

	// preset stop time here;
	String stopTime = "21:58";

	// check the current time, if it matches preset time, stop AIMP player
	boolean timeUp = false;

	while (!timeUp) {
	    // check time every 1 minute
	    TimeUnit.MINUTES.sleep(1);

	    // get current time
	    String currentTime = java.time.LocalTime.now().toString();
	    String[] currentTimeArray = currentTime.split(":");
	    String currentHourMin = currentTimeArray[0] + ":" + currentTimeArray[1];
	    System.out.println("Current time is: " + currentHourMin);

	    // if current time matches preset stop time, stop AIMP player
	    if (currentHourMin.equals(stopTime)) {
		Runtime.getRuntime().exec("taskkill /f /im AIMP.exe");
		System.out.println("Player is stoped at: " + currentHourMin);
		timeUp = true;
	    }
	}

    }

}
