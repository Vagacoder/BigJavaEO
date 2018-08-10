package ch15;

public class LocalClassExample {
	static String regularExpression = "[^0-9]";

	public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

		int NUMBER_LENGTH = 10;

		// inner class of PhoneNumber
		class PhoneNumber {

			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber) {
				// Note: local var defined outside must be final or effectively final
				// NUMBER_LENGTH = 7;

				// validate phonenumber, # of digits must be 10
				// Note: the filed of regularExpression is defined outside of
				// PhoneNumber class, but it is static. PhoneNumber can still access it.
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				if (currentNumber.length() == NUMBER_LENGTH)
					formattedPhoneNumber = currentNumber;
				else
					formattedPhoneNumber = null;
			}

			public String getNumber() {
				return formattedPhoneNumber;
			}

			// since inner class is defined inside method of validatePhoneNumber(),
			// it can access method parameters: phoneNumber1 and phoneNumber2.
			public void printOriginalNumbers() {
				System.out.println("Original numbers are " + phoneNumber1 + " and " + phoneNumber2);
			}
		}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		myNumber1.printOriginalNumbers();

		if (myNumber1.getNumber() == null)
			System.out.println("First number is invalid");
		else
			System.out.println("First number is " + myNumber1.getNumber());
		if (myNumber2.getNumber() == null)
			System.out.println("Second number is invalid");
		else
			System.out.println("Second number is " + myNumber2.getNumber());

	}

	public static void main(String... args) {
		validatePhoneNumber("123-456-7890", "456-7890");
	}
}
