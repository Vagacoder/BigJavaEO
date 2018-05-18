package ch04;

public class PhoneNumberConverter {

	private String areaCode;
	private String firstThree;
	private String lastFour;

	public PhoneNumberConverter(String inputNumber) {

		areaCode = inputNumber.substring(0, 3);
		firstThree = inputNumber.substring(3, 6);
		lastFour = inputNumber.substring(6);
	}

	public String getPhoneNumber() {

		String phoneNumber = "(" + areaCode + ") " + firstThree + "-" + lastFour;

		return phoneNumber;

	}

}
