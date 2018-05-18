package ch03;

public class ReadDigits {

	int number;

	public ReadDigits(int number, int location) {

		this.number = number;

	}

	public int readDigit() {

		int digit = number % 10;

		return digit;

	}

	public int ReadTen() {

		int ten = Math.floorDiv(number % 100, 10);

		return ten;
	}
}
