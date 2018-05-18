package ch04;

import javax.swing.*;

public class PhoneNumberConverterTest {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Enter a phone number:");

		PhoneNumberConverter PNC1 = new PhoneNumberConverter(input);
		System.out.println(PNC1.getPhoneNumber());

	}

}
