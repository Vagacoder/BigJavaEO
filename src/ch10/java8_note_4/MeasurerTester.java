package ch10.java8_note_4;

import java.awt.*;

/**
 * This program demonstrates the use of a Measurer.
 */
public class MeasurerTester {
    public static void main(String[] args) {
	BankAccount[] accounts = new BankAccount[3];
	accounts[0] = new BankAccount(0);
	accounts[1] = new BankAccount(10000);
	accounts[2] = new BankAccount(2000);

	double averageBalance = Data.average(accounts, (Object obj) -> ((BankAccount) obj).getBalance());
	System.out.println("Average balance: " + averageBalance);
	System.out.println("Expected: 4000");

	Rectangle[] rects = new Rectangle[] { new Rectangle(5, 10, 20, 30), new Rectangle(10, 20, 30, 40),
		new Rectangle(20, 30, 5, 15) };

	Measurer areaMeas = (Object obj) -> {
	    Rectangle r = (Rectangle) obj;
	    return r.getWidth() * r.getHeight();
	};

	double averageArea = Data.average(rects, areaMeas);
	System.out.println("Average area: " + averageArea);
	System.out.println("Expected: 625");
    }
}
