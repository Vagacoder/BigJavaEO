package ch10;

import java.awt.event.*;
import java.time.*;
import java.util.*;

import javax.swing.Timer;

public class E10_27 {

    public static void main(String[] args) {

	class TimerListener implements ActionListener {

	    @Override
	    public void actionPerformed(ActionEvent event) {
		String currentTime = LocalTime.now().toString();
		System.out.println(currentTime);

	    }
	}

	ActionListener tl = new TimerListener();
	Timer timer = new Timer(1000, tl);
	timer.start();
	boolean stop = false;
	Scanner in = new Scanner(System.in);
	while (!stop) {
	    String input = in.next();
	    if (!input.equals("")) {
		stop = true;
	    }
	}
	in.close();
    }

}
